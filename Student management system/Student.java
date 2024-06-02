package CourseWork;
public class Student {
    private int enrollmentID;
    private String dateOfBirth;
    private String courseName;
    private String studentName;
    private String dateOfEnrollment;
    private int courseDuration;
    private int tuitionFee;

    //constructor
    public Student(String dateOfBirth, String studentName, int courseDuration,int tuitionFee)
    {
        this.courseName = "";
        this.dateOfEnrollment="";
        this.enrollmentID=0;
        this.dateOfBirth=dateOfBirth;
        this.studentName=studentName;
        this.courseDuration=courseDuration;
        this.tuitionFee = tuitionFee;
    }
    //getter method
    public int getEnrollmentID()
    {
        return this.enrollmentID;
    }
    public String getDateOFBirth()
    {
        return this.dateOfBirth;
    }
    public String getCourseName()
    {
        return this.courseName;
    }
    public String getStudentName()
    {
        return this.studentName;
    }
    public String getDateOfEnrollment()
    {
        return this.dateOfEnrollment;
    }
    public int getCourseDuration()
    {
        return this.courseDuration;
    }
    public int getTuitionFee()
    {
        return this. tuitionFee;
    }
    //setter method
    public void setCourseName(String courseName)
    {
        this.courseName = courseName;
    }
    public void setEnrollmentID(int enrollmentID)
    {
        this.enrollmentID = enrollmentID;
    }
    public void setDateOfEnrollment(String dateOfEnrollment)
    {
        this.dateOfEnrollment = dateOfEnrollment;
    }
    public void setDateOfBirth(String dateOfBirth)
    {
        this.dateOfBirth=dateOfBirth;
    }
    public void setStudentName(String studentName)
    {
        this.studentName=studentName;
    }
    public void setCourseDuratioin(int courseDuration)
    {
        this.courseDuration=courseDuration;
    }
    public void setTuitionFee(int tuitionFee)
    {
        this.tuitionFee=tuitionFee;
    }
    //display method
    public void display()
    {
        if(enrollmentID == 0 || dateOfEnrollment.equals("") || courseName.equals("") || studentName.equals("") || dateOfEnrollment.equals("") || courseDuration == 0 || tuitionFee == 0){
            System.out.println("All the parameter have not been set");
        }
        else{
            System.out.println("EnrollmentID= " + this.enrollmentID);
            System.out.println("dateOfBirth= " + this.dateOfBirth);
            System.out.println("Course= " + this.courseName);
            System.out.println("Student= " + this.studentName);
            System.out.println("dateOfEnrollment= " + this.dateOfEnrollment);
            System.out.println("courseDuration= " + this.courseDuration);
            System.out.println("TuitionFee= " + this.tuitionFee);
        }
    }
}

