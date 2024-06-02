package CourseWork;

public class Regular extends Student
 {
    private int numOfModules;
    private int numOfCreditHours;
    private double daysPresent;
    private boolean isGrantedScholarship;

    //constructor
    public Regular(int enrollmentID,String dateOfBirth, String courseName, String studentName, String dateOfEnrollment, int courseDuration, int tuitionFee, int numOfModules, int numOfCreditHours, int daysPresent)
    {
        super(dateOfBirth,studentName,courseDuration,tuitionFee);
        super.setCourseName(courseName);
        super.setDateOfEnrollment(dateOfEnrollment);
        super.setEnrollmentID(enrollmentID);
        this.numOfCreditHours=numOfCreditHours;
        this.numOfModules=numOfModules;
        this.daysPresent=daysPresent;
        this.isGrantedScholarship=false;
    }
    //getter method
    public int getNumOfCreditHours()
    {
        return numOfCreditHours;
    }
    public int getNumOfModules()
    {
        return numOfModules;
    }
    public double getDaysPresent()
    {
        return daysPresent;
    }
    public boolean isGrantedScholarship()
    {
        return isGrantedScholarship;
    }
    //method for calculating percentage
    public String presentPercentage(double daysPresent)
    {
        double monthPresent = daysPresent / 30;
        String percentage = "";
        if(super.getCourseDuration() < monthPresent){
            System.out.println("CourseDuration is less than the number of days Present");
        }
        else{
            double presentPercentage = (monthPresent / super.getCourseDuration())*100;
            if(100 >= presentPercentage && 80 <= presentPercentage){
                percentage = "A";
                this.isGrantedScholarship = true;
            }
            else if(79 >= presentPercentage && 60 <= presentPercentage)
            {
                percentage = "B";
                this.isGrantedScholarship=false;
            }
            else if(59 >= presentPercentage && 40 <= presentPercentage)
            {
                percentage = "C";
                this.isGrantedScholarship=false;
            }
            else if(100 >= presentPercentage && 20 <= presentPercentage)
            {
                percentage = "D";
                this.isGrantedScholarship=false;
            }
            else if(20 < presentPercentage)
            {
                percentage = "E";
                this.isGrantedScholarship=false;
            }
        }
        return percentage;
    }
    public void grantCertificate(String courseName, int enrollmentID, String dateOfEnrollment)
    {
        System.out.println(courseName);
        System.out.println(enrollmentID);
        System.out.println(dateOfEnrollment);
        if(isGrantedScholarship==true){
            System.out.println("The scholarship has been granted");
        }
    }
    public void display()
    {
        super.display();
        System.out.println("numOfModules= "+ this.numOfModules);
        System.out.println("numOfCreditHours= "+ this.numOfCreditHours);
        System.out.println("daysPresent= "+ this.daysPresent);
    }
}