import java.util.Scanner;
import java.lang.Exception;
class Account extends Exception
{
    long account_num;
    String Holder_Name;
    String Account_Type;
    Double Balance=50000.00;
    int pin;
    Scanner sc=new Scanner(System.in);

    public void Login()
    {
       
        System.out.println("**********Welcome to Indian Oversise Bank:************* ");
        System.out.println("-------------------------------------------------------- ");
        System.out.println("Please Enter you Name(As per Yur Adhar Card):");
        Holder_Name=sc.nextLine();
        System.out.println("");

        System.out.println("Please Enter your Account Number_______(Saving or current):");
        account_num=sc.nextInt();
        System.out.println("");

        System.out.println("Please enter your Account type:(Saving or current):");
        Account_Type=sc.next();
        System.out.println("");

        try{
        System.out.println("Please enter your 4 digit pin");
        pin=sc.nextInt();

        String string_pin = Integer.toString(pin);
        int len=string_pin.length();

        if (len != 4) {
            throw new IllegalArgumentException("PIN must be exactly 4 digits long.");
        }

    }

    catch (IllegalArgumentException e) {
        System.err.println("Length of pin not matching: " + e.getMessage());
    } 

    }

}

class Functionality extends Account
{


  public void Withdraw()
  {
    System.out.println("-------please enter your amount withdraw-------:");
        
    int Amt=sc.nextInt();

    if(Amt>Balance)
    {
        System.out.println("**************Sorry! Insufficient Balance,");
        System.out.println("Check your Balance--");
    }
    else{
        Balance=Balance-Amt;
        System.out.println("Wait! while we counting your money");
        System.out.println("************Withdrawl Succesfull************");
        System.out.println("your Balance is:"+Balance);
        System.out.println("Thank you!");
    }

  }



  public void Deposit()
  {
    System.out.println("Please Enter the amount to deposite less than 50000:");
    int damt=sc.nextInt();

    if(damt>50000)
    {
        System.out.println("Please enter the amount less than 50000 OR**** ADD PAN CARD:");
    }
    else{
        Balance=Balance+damt;
        System.out.println("Your Account is credited with__"+damt);
        System.out.println("your BankBALANCE is:"+Balance);
    }


   }





  public void Check_Balance()
  {
    System.out.println("Your Acount Balance is:"+Balance);
  }



}








public class ATM
 {

    public static void main(String args[])
    {
     
        Scanner s=new Scanner(System.in);

        Functionality fn=new Functionality ();
        fn.Login();
        boolean exit=false;

     while(!exit)
     {
        System.out.println("__________________________________________________");

        System.out.println("1.-----WITHDRWA-------");
        System.out.println("2.-----DEPOSITE-------");
        System.out.println("3.-----CHECK_BALANCE-------");
        System.out.println("4.-----Exit!-------");

        
        System.out.println("Please tell me your choice according to GIVEN NUMBERS---");
        
        int choice=s.nextInt();

        switch(choice)
        {

            case 1:
                        fn.Withdraw();
                        break;
        
        case 2:
                        fn.Deposit();
                        break;
        case 3 :
                        fn.Check_Balance();
                        break;
        case 4 :
                        System.out.println("Have nie day SIR/MAM,visit again:");
                        exit=true;   
                        
        default:
                     System.out.println("This functionality is under devlopment please choose the opetion given above thank you");

        }                


     }


 }

}
