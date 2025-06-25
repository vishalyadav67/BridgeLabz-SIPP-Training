public class OnlineClassManagement {
   
    String courseName;
    int duration;
    double fee;

   
    static String instituteName = "ABC Institute";

    
    void displayCourseDetails() {
        System.out.println("Institute Name: " + instituteName);
        System.out.println("Course Name   : " + courseName);
        System.out.println("Duration      : " + duration + " weeks");
        System.out.println("Fee           : ₹" + fee);
       
    }

    
    static void updateInstituteName(String newName) {
        instituteName = newName;
    }

   
    public static void main(String[] args) {
        OnlineClassManagement c1 = new OnlineClassManagement();
        c1.courseName = "Java Programming";
        c1.duration = 10;
        c1.fee = 5000;

        OnlineClassManagement c2 = new OnlineClassManagement();
        c2.courseName = "Web Development";
        c2.duration = 12;
        c2.fee = 7000;

        
        c1.displayCourseDetails();
        c2.displayCourseDetails();

       
        OnlineClassManagement.updateInstituteName("Tech Pro Institute");

        
        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}

