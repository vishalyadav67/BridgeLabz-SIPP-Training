import java.util.*;

abstract class JobRole {
    private String candidateName;
    private int experience; 

    public JobRole(String candidateName, int experience) {
        this.candidateName = candidateName;
        this.experience = experience;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public int getExperience() {
        return experience;
    }

    public abstract void evaluateResume();
}

class SoftwareEngineer extends JobRole {
    public SoftwareEngineer(String name, int exp) {
        super(name, exp);
    }

    @Override
    public void evaluateResume() {
        System.out.println(getCandidateName() + getExperience() + " yrs");
    }
}

class DataScientist extends JobRole {
    public DataScientist(String name, int exp) {
        super(name, exp);
    }

    @Override
    public void evaluateResume() {
        System.out.println(getCandidateName() +  getExperience() + " yrs");
    }
}

class ProductManager extends JobRole {
    public ProductManager(String name, int exp) {
        super(name, exp);
    }

    @Override
    public void evaluateResume() {
        System.out.println(getCandidateName() +  getExperience() + " yrs");
    }
}

class Resume<T extends JobRole> {
    private T jobRole;

    public Resume(T jobRole) {
        this.jobRole = jobRole;
    }

    public T getJobRole() {
        return jobRole;
    }

    public void processResume() {
        System.out.println("Processing resume of " + jobRole.getCandidateName());
        jobRole.evaluateResume();
    }
}

class ResumeScreening {
    public static <T extends JobRole> Resume<T> generateResume(T jobRole) {
        System.out.println("Generating resume for " + jobRole.getCandidateName() + "...");
        return new Resume<>(jobRole);
    }

    public static void screenAll(List<? extends JobRole> applicants) {
        System.out.println("\n--- Screening Pipeline ---");
        for (JobRole applicant : applicants) {
            applicant.evaluateResume();
        }
    }
}

public class ResumeeScreening {
    public static void main(String[] args) {
        // Create job role objects
        SoftwareEngineer se = new SoftwareEngineer("Vishal", 3);
        DataScientist ds = new DataScientist("Ayesha", 2);
        ProductManager pm = new ProductManager("Rahul", 5);

        Resume<SoftwareEngineer> seResume = ResumeScreening.generateResume(se);
        Resume<DataScientist> dsResume = ResumeScreening.generateResume(ds);
        Resume<ProductManager> pmResume = ResumeScreening.generateResume(pm);

        System.out.println();
        seResume.processResume();
        dsResume.processResume();
        pmResume.processResume();

        List<JobRole> pipeline = new ArrayList<>();
        pipeline.add(se);
        pipeline.add(ds);
        pipeline.add(pm);

        ResumeScreening.screenAll(pipeline);
    }
}
