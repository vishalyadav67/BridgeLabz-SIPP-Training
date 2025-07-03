import java.util.ArrayList;
import java.util.List;

class Hospital {
    List<Doctor> doctors = new ArrayList<>();
    List<Patient> patients = new ArrayList<>();

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    class Doctor {
        private String name;
        private List<Patient> consultedPatients;

        public Doctor(String name) {
            this.name = name;
            this.consultedPatients = new ArrayList<>();
        }

        public String getName() {
            return name;
        }

        public void consult(Patient patient) {
            if (!consultedPatients.contains(patient)) {
                consultedPatients.add(patient);
            }
            if (!patient.getConsultedDoctors().contains(this)) {
                patient.addDoctor(this);
            }
            System.out.println("Dr. " + name + " is consulting patient " + patient.getName());
        }

        public void showConsultedPatients() {
            System.out.println("Dr. " + name + " consulted:");
            for (Patient p : consultedPatients) {
                System.out.println(" - " + p.getName());
            }
        }
    }

    class Patient {
        private String name;
        private List<Doctor> consultedDoctors;

        public Patient(String name) {
            this.name = name;
            this.consultedDoctors = new ArrayList<>();
        }

        public String getName() {
            return name;
        }

        public void addDoctor(Doctor doctor) {
            consultedDoctors.add(doctor);
        }

        public List<Doctor> getConsultedDoctors() {
            return consultedDoctors;
        }

        public void showConsultedDoctors() {
            System.out.println("Patient " + name + " consulted:");
            for (Doctor d : consultedDoctors) {
                System.out.println(" - Dr. " + d.getName());
            }
        }
    }
}
public class HospitalApp {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();

        Hospital.Doctor d1 = hospital.new Doctor("Mehta");
        Hospital.Doctor d2 = hospital.new Doctor("Roy");

        Hospital.Patient p1 = hospital.new Patient("Ananya");
        Hospital.Patient p2 = hospital.new Patient("Ravi");

        hospital.addDoctor(d1);
        hospital.addDoctor(d2);

        hospital.addPatient(p1);
        hospital.addPatient(p2);

        d1.consult(p1);
        d1.consult(p2);
        d2.consult(p1);

        d1.showConsultedPatients();
        d2.showConsultedPatients();

        p1.showConsultedDoctors();
        p2.showConsultedDoctors();
    }
}
