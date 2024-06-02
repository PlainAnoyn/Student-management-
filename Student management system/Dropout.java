package CourseWork;

public class Dropout extends Student
{
    private int numOfRemainingModules;
    private int numOfMonthsAttended;
    private String dateOfDropout;
    private int remainingAmount;
    private boolean hasPaid;
    //constructor
    public Dropout(int enrollmentID, String dateOfBirth, String courseName, String studentName, String dateOfEnrollment, int tuitionFee, int courseDuration, int numOfRemainingModules, String dateOfDropout, int numOfMonthsAttended)
    {
        super(dateOfBirth,studentName,courseDuration,tuitionFee);
        super.setCourseName(courseName);
        super.setDateOfEnrollment(dateOfEnrollment);
        super.setEnrollmentID(enrollmentID);
        this.numOfRemainingModules=numOfRemainingModules;
        this.numOfMonthsAttended=numOfMonthsAttended;
        this.dateOfDropout=dateOfDropout;
        this.remainingAmount=0;
        this.hasPaid=false;
    }    
    //Getter method
    public int getNumOfRemainingModules()
    {
        return this.numOfRemainingModules;
    }
    public int getNumOfMonthsAttended()
    {
        return this.numOfMonthsAttended;
    }
    public String getDateOfDropout()
    {
        return this.dateOfDropout;
    }
    public boolean getHasPaid()
    {
        return this.hasPaid;
    }
    //method for calculating remaining Amount
    public void billsPayable()
    {
        this.remainingAmount = (super.getCourseDuration() - this.numOfMonthsAttended) * super.getTuitionFee();
        this.hasPaid = true;
    }
    public void removeStudent()
    {
        if(hasPaid == true){
            super.setCourseName("");
            super.setDateOfEnrollment("");
            super.setEnrollmentID(0);
            super.setCourseDuratioin(0);
            super.setDateOfBirth("");
            super.setStudentName("");
            super.setTuitionFee(0);
            this.dateOfDropout="";
            this.numOfMonthsAttended=0;
            this.numOfRemainingModules=0;
            this.remainingAmount=0;
        }
        else{
            System.out.println("All bills not cleared");
        }
    }
    public void display()
    {
        super.display();
        System.out.println("number Of remaining modules= "+ numOfRemainingModules);
        System.out.println("number Of months attended= "+ numOfMonthsAttended);
        System.out.println("date of dropout= "+ dateOfDropout);
        System.out.println("Remaining amount= "+ remainingAmount);
    }
}