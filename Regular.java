/**
 * The name of this class is Regular
 *
 * @author (Deepshikha)
 * @date (08/10/2023)
 */
public class Regular extends Student
{
    private int numOfModules;
    private int numOfCreditHours;
    private double daysPresent;
    private boolean IsGrantedScholarship;
    private String AttendanceGrade;
    //Creation of constructor for this class
    Regular(int enrollmentID,String dateOfBirth,String studentName,int tuitionFee,int courseDuration,String courseName,int numOfModules,int numOfCreditHours,double daysPresent,String dateOfEnrollment)
    {
        super(dateOfBirth,studentName,courseDuration,tuitionFee);
        super.setcourseName(courseName);
        super.setenrollmentID(enrollmentID);
        super.setdateOfEnrollment(dateOfEnrollment);
        this.numOfModules=numOfModules;
        this.numOfCreditHours=numOfCreditHours;
        this.daysPresent=daysPresent;
        this.IsGrantedScholarship=false;
    }
    //using getter for this class
    public int getnumOfModules()
    {
        return numOfModules;
    }

    public int getnumOfCreditHours()
    {
        return numOfCreditHours;
    }

    public double getdaysPresent()
    {
        return daysPresent;
    }
    //using setter for this class
    public void setnumOfModules(int numOfModules)
    {
        this.numOfModules= numOfModules;
    }

    public void setnumOfCreditHours(int numOfCreditHours)
    {
        this.numOfCreditHours= numOfCreditHours;
    }

    public void setdaysPresent(double daysPresent)
    {
        this.daysPresent= daysPresent;
    }
    //method to return IsGrantedScholarship
    public boolean getIsGrantedScholarship()
    {
        return IsGrantedScholarship;
    }

    public void setIsGrantedScholarship(boolean Granted)
    {
        this.IsGrantedScholarship= Granted;
    }
    //method for calculating presentPrecentage
    public double presentPercentage(double daysPresent)
    {
        double presentPercentage = ((daysPresent)/(getcourseDuration()))*100;
        if (daysPresent > getcourseDuration())
        {
            System.out.println("Number of daysPresent cannot be greater than courseDuration");

        } else {

            if(presentPercentage>=80){

                AttendanceGrade= "Your grade is A and Certificate has been Granted";
                
                IsGrantedScholarship=true;
            } 
            else if (presentPercentage >= 60){
                AttendanceGrade= "Your grade is B and Certificate has not been Granted";
                
                IsGrantedScholarship=false;
            }
            else if (presentPercentage >=40){
                AttendanceGrade="Your grade is C and Certificate has not been Granted";
                
                IsGrantedScholarship=false;
            }
            else if (presentPercentage >=20){
                AttendanceGrade= "Your grade is D and Certificate has been not been Granted";
                
                IsGrantedScholarship=false;
            }
            else{
                AttendanceGrade= "Your grade is E and Certificate has not been Granted";
                
                IsGrantedScholarship= false;
            }
        } 
    
        return presentPercentage;

    }
    //method to print message nad values
    public void grantCertificate(String courseName,int enrollmentID,String dateOfEnrollment)
    {
        System.out.println("The student has graduated");
        System.out.println("The courseName is "+courseName);
        System.out.println("The enrollmentID is "+enrollmentID);
        System.out.println("The dateOfEnrollment is "+dateOfEnrollment);
        if (IsGrantedScholarship==true){
            System.out.println("The scholarship has been granted to you");
        }
        else{
            System.out.println("The scholarship has not been granted to you");
        }

    }
    //this is the method for GUI
    public String grantCertificateToRegular(String courseName,int enrollmentID,String dateOfEnrollment){
        String message="Enrollment ID:" +enrollmentID+"\n"+
            "The certificate has been granted.\n";
        return message;
    }
    //display method of this class
    public void display(){
        super.display();//Calling display method from the parent class i.e. Student
        System.out.println("The number of modules is " + numOfModules);
        System.out.println("The number of credit hours is " + numOfCreditHours);
        System.out.println("The number of days present is " + daysPresent);
    }
}