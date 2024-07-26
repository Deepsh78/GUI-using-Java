/**
 * The name of this class is Student
 *
 * @author (Deepshikha)
 * @date (08/10/2023)
 */

public class Student
{
    //declaration of the variables
    private int enrollmentID;
    private String dateOfBirth;
    private String courseName;
    private String studentName;
    private String dateOfEnrollment;
    private int courseDuration;
    private int tuitionFee;
    private int yearsEnrolled;
    //creation of constructor
    public Student(String dateOfBirth,String studentName,int courseDuration,int tuitionFee)
    {
        this.dateOfBirth=dateOfBirth;
        this.studentName=studentName;
        this.courseDuration=courseDuration;
        this.tuitionFee=tuitionFee;
        this.courseName="";
        this.dateOfEnrollment="";
        this.enrollmentID=0;
        int yearsEnrolled=courseDuration/12;
    }
    //Acessor method for all attributes of this class
    public String getdateOfBirth()
    {
        return dateOfBirth;
    }
    public int getenrollmentID()
    {
        return enrollmentID;
    }

    public String getcourseName()
    {
        return courseName;
    }

    public String getstudentName()
    {
        return studentName;
    }

    public String getdateOfEnrollment()
    {
        return dateOfEnrollment;
    }

    public int getcourseDuration()
    {
        return courseDuration;
    }

    public int gettuitionFee()
    {
        return tuitionFee;
    }
    
    //Setting values into new values(there should be new in parameter)
    public void setcourseName(String newcourseName)
    {
        this.courseName=newcourseName;
    }

    public void setenrollmentID(int newenrollmentID)
    {
        this.enrollmentID=newenrollmentID;  
    }

    //setter for dropout class 
    public void setdateOfBirth(String dateOfBirth)
    {
        this.dateOfBirth=dateOfBirth;
    }
    public void setcourseDuration(int courseDuration)
    {
        this.courseDuration=courseDuration;
    }
    public void setstudentName(String studentName)
    {
        this.studentName=studentName;
    }
    public void settuitionFee(int tuitionFee)
    {
        this.tuitionFee=tuitionFee;
    }
    
    //mutator method for dateOfEnrollment
    public void setdateOfEnrollment(String dateOfEnrollment)
    {
        this.dateOfEnrollment=dateOfEnrollment;
    }
    //Display method for this class
    public void display()
    {
        if((courseName.equals(""))||(dateOfEnrollment.equals(""))||enrollmentID==0){
            System.out.println("The parameter has not been set");
        }
        else{
            System.out.println("The courseName is: " + courseName);
            System.out.println("The dateOfEnrollment is: " + dateOfEnrollment);
            System.out.println("The enrollmentID is: " + enrollmentID);
            System.out.println("The dateOfBirth is: "+ dateOfBirth);
            System.out.println("The studentName is: "+ studentName);
            System.out.println("The courseDuration is: "+ courseDuration);
            System.out.println("The tuitionFee is: "+ tuitionFee);
            System.out.println("The yearsEnrolled is: "+ yearsEnrolled);
        }
    }
}