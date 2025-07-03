import java.util.ArrayList;
import java.util.List;

interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

abstract class Patient {
    private String patientId;
    private String name;
    private int age;
    private String diagnosis;
    private List<String> medicalHistory;

    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.medicalHistory = new ArrayList<>();
    }

    public String getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void addToHistory(String entry) {
        medicalHistory.add(entry);
    }

    public void viewMedicalHistory() {
        System.out.println("Medical History:");
        for (String entry : medicalHistory) {
            System.out.println("- " + entry);
        }
    }

    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Diagnosis: " + (diagnosis != null ? diagnosis : "Not Provided"));
    }

    public abstract double calculateBill();
}


class InPatient extends Patient implements MedicalRecord {
    private int daysAdmitted;
    private double roomChargePerDay;

    public InPatient(String patientId, String name, int age, int daysAdmitted, double roomChargePerDay) {
        super(patientId, name, age);
        this.daysAdmitted = daysAdmitted;
        this.roomChargePerDay = roomChargePerDay;
    }

    public double calculateBill() {
        return daysAdmitted * roomChargePerDay + 2000; 
    }

    public void addRecord(String record) {
        addToHistory("InPatient Note: " + record);
    }

    public void viewRecords() {
        viewMedicalHistory();
    }
}


class OutPatient extends Patient implements MedicalRecord {
    private int visits;
    private double consultationFee;

    public OutPatient(String patientId, String name, int age, int visits, double consultationFee) {
        super(patientId, name, age);
        this.visits = visits;
        this.consultationFee = consultationFee;
    }

    public double calculateBill() {
        return visits * consultationFee;
    }

    public void addRecord(String record) {
        addToHistory("OutPatient Note: " + record);
    }

    public void viewRecords() {
        viewMedicalHistory();
    }
}
public class HospitalManagementSystem {
    public static void displayBilling(Patient patient) {
        System.out.println("\n--- Patient Summary ---");
        patient.getPatientDetails();
        System.out.println("Total Bill: ₹" + patient.calculateBill());

        if (patient instanceof MedicalRecord) {
            MedicalRecord record = (MedicalRecord) patient;
            record.viewRecords();
        }
    }

    public static void main(String[] args) {
        Patient p1 = new InPatient("P101", "Amit Verma", 45, 4, 1500);
        p1.setDiagnosis("Pneumonia");
        ((MedicalRecord) p1).addRecord("Admitted with high fever and cough.");

        Patient p2 = new OutPatient("P102", "Nina Sharma", 32, 3, 500);
        p2.setDiagnosis("Allergy");
        ((MedicalRecord) p2).addRecord("Prescribed anti-allergy medication.");

        displayBilling(p1);
        displayBilling(p2);
    }
}
