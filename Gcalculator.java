
import java.util.Scanner;

 interface Calculator {

   void Subjects_Marks();
   int Calculate_Marks();
   void Calculate_Percentage();
   void Grade_Calculation();
   void Display_Result();
    
}

class Student
{
    Scanner sc=new Scanner(System.in);
    
    int java,c,cpp,python,maths,network;
    int Total_marks;
    float Percentage;
    String StudentName;

    public Student()
    {
        System.out.println("Enter the name of student:");
        StudentName =sc.next();

    }

     void Subjects_Marks()
     {
        System.out.println("----------------------------------");
        System.out.println("Enter the marks of subject Java out of 100:");
        java=sc.nextInt();
        System.out.println("----------------------------------");
        System.out.println("enter the the marks of the subject cpp out of 100:");
        cpp=sc.nextInt();
        System.out.println("----------------------------------");

        System.out.println("enter the the marks of the subject python out of 100:");
        python=sc.nextInt();
        System.out.println("----------------------------------");

        System.out.println("enter the the marks of the subject mathas out of 100:"); 
        maths=sc.nextInt();
        System.out.println("----------------------------------");

        System.out.println("enter the the marks of the subject Network out of 100:");
        network=sc.nextInt();
        System.out.println("----------------------------------");
        
     }

     void Calculate_Marks()
     {
        System.out.println("----------------------------------");
           Total_marks=java + cpp + python + maths + network;
           System.out.println("Total marks are obatained out of 500 :" +Total_marks);


     }

     void Calculate_Percentage()
     {
        System.out.println("----------------------------------");
         Percentage= (Total_marks)/5f;
         


    }

    void Grade_Calculation()
    {
        if(Percentage >=95)
        {
            System.out.println("Student "+StudentName+"||"+"obtain A+ grade ");

        }
        else if(Percentage >=80)
        {
            System.out.println("Student "+StudentName+ "||"+"obtain A grade ");
        }
        else if(Percentage >=75)
        {
            System.out.println("Student "+StudentName+ "||"+ "obtain B+ grade ");
        }
        else if(Percentage >=70){
        System.out.println("Student "+StudentName+"||"+"obtain B grade ");
        }
        else if(Percentage >=60){
            System.out.println("Student "+StudentName+""+"obtain C+ grade ");
        }
        else if(Percentage >=50){
            System.out.println("Student " +StudentName+ ""+ "obtain C grade ");
        }
        else if(Percentage >=35){
            System.out.println("Student "+StudentName+""+"obtain D grade ");
        }
        else
        {
            System.out.println("Student faild to get passing marks!,thank you ");
        }
    }    

    void Display_Result()
    {
        System.out.println("The Percentages obtained by Studen"+"="+ Percentage);

        if(Percentage<35)
        {
            System.out.println("Studen failed in Exam ");
        }
        else{
            System.out.println("Student pass in Exam ");
        }
    }

 }

 public class Gcalculator
 {
    public static void main(String[] args) {
        
        Student st=new Student();
        st. Subjects_Marks();
        st. Calculate_Marks();
        st. Calculate_Percentage();
        st. Grade_Calculation();
        st. Display_Result();
    }


 }











