/**
 * The name of this class is Dropout
 *
 * @author (Deepshikha)
 * @date (08/10/2023)
 */

public class Dropout extends Student
{
    private int numOfRemainingModules;
    private int numOfMonthsAttended;
    private String dateOfDropout;
    private int remainingAmount;
    private boolean hasPaid;
    //Constructor accepting parameters
    public Dropout(int enrollmentID,String dateOfBirth,String studentName,int tuitionFee,int courseDuration,int numOfRemainingModules,int numOfMonthsAttended,
    String dateOfDropout,String dateOfEnrollment,double remainingAmount)
    {
        super(dateOfBirth,studentName,courseDuration,tuitionFee);
        setenrollmentID(enrollmentID);
        super.setcourseName(super.getcourseName());
        super.setdateOfEnrollment(super.getdateOfEnrollment());
        this.numOfRemainingModules=numOfRemainingModules;
        this.numOfMonthsAttended=numOfMonthsAttended;
        this.dateOfDropout=dateOfDropout;
        this.remainingAmount=0;
        this.hasPaid=false;
    }
    //getter for this class
    public boolean gethasPaid()
    {
        return hasPaid;
    }
    public int getnumOfMonthsAttended()
    {
        return numOfMonthsAttended;
    }
    public String getdateOfDropout()
    {
        return dateOfDropout;
    }
    public int getnumOfRemainingModules()
    {
        return numOfRemainingModules;
    }
    public String dateOfDropout()
    {
        return dateOfDropout;
    }
    public boolean hasPaid()
    {
        return hasPaid;
    }
    public int getremainingAmount()
    {
        return remainingAmount;
    }
    public double remainingAmount()
    {
        return remainingAmount;
    }
    //method for the calculation of remaining amount
    public double billsPayable()
    {
        remainingAmount=(super.getcourseDuration()- numOfMonthsAttended)*gettuitionFee();
        if(remainingAmount<=0){
           hasPaid=(true); 
        }
        return remainingAmount;
        
    }
    //method to print message that says bill is not cleared
    public void removeStudent()
    {
        if (hasPaid){
            super.setdateOfBirth("");
            super.setcourseName("");
            super.setstudentName("");
            super.setdateOfEnrollment("");
            super.setcourseDuration(0);
            super.settuitionFee(0);
            super.setenrollmentID(0);
            this.hasPaid=false;
            this.numOfRemainingModules=(0);
            this.numOfMonthsAttended=(0);
            this.remainingAmount=(0);
            this.dateOfDropout=("");
            
        }
        else{
            System.out.println("All the bills has not been cleared");
        }
        
    }
    //display method for this class
    public void display(){
        super.display();//Calling display method from parent class i.e. Student
        System.out.println("The number of remaining module is " + numOfRemainingModules);
        System.out.println("The number of months attended is " + numOfMonthsAttended);
        System.out.println("The date of dropout is " + dateOfDropout);
        System.out.println("The remaining amount is " + remainingAmount);
        System.out.println("Has Paid is: " + hasPaid);
    }
}