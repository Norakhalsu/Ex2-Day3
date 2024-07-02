
import java.util.Scanner;
public class Ex2 {
    /* 1.Write a program that checks the role of the user
        If the role is admin print "welcome admin"
        If the role is superuser print "welcome superuser"
        If the role is user print "welcome user" (tip:
        use if else)   */

    /*  public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println(" enetr your role ");
        String role=scanner.nextLine();

        if (role.equalsIgnoreCase("Admin")){
            System.out.println(" Welcome Admin");
        }
        else if (role.equalsIgnoreCase("superuser")) {
            System.out.println(" welcome Superuser ");

        }
        else if(role.equalsIgnoreCase("user")) {
            System.out.println(" welcome User ");

        }
        else {
            System.out.println(" Undefine Role ");
        }
    }    */



    /*   2.Take three numbers from the user and print the greatest number.
         Test Data
         Input the 1st number: 25
         Input the 2nd number: 78
         Input the 3rd number: 87
         Expected Output : The
         greatest: 87  */

   /* public static void main(String[] args) {
        Scanner scan=new Scanner((System.in));

         System.out.println(" Write frist number : ");
        int num1 = scan.nextInt();

         System.out.println(" Write second number : ");
        int num2 =scan.nextInt();

         System.out.println(" Write third number : ");
        int num3 =scan.nextInt();

        int greatest=checknum(num1, num2,num3);
    }
    public static int checknum(int num1 ,int  num2 ,int num3) {

       int max = Math.max(Math.max(num1,num2),num3);
        System.out.println(" The max number is : " + max );

        return max;
    }    */




 /*   3.Write a Java program that generates an integer between 1 and 7 and
      displays the name of the weekday.
      Test Data
      number: 4
      Expected Output:
      Wednesday */

   /*  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter from 1-7 to show the Day ");
        int input = scanner.nextInt();

        switch (input){
        case 1:
        System.out.println(" Sunday ");
           break;
        case 2:
        System.out.println(" Monday ");
            break;
        case 3:
        System.out.println(" Tusday ");
            break;
        case 4:
        System.out.println(" Wednsday ");
            break;
        case 5:
        System.out.println(" thirsday ");
             break;
        case 6:
        System.out.println(" friday ");
             break;
        case 7:
        System.out.println(" saturday ");
            default:
            System.out.println(" ");

    }
} */




    /*   4. Write a program that takes a numeric score as input and prints the
         corresponding letter grade using the following grading scale:
         A: 90-100
         B: 80-89
         C: 70-79
         D: 60-69
         F: 0-59
         Enter your numeric score: 85
         Numeric Score: 85
         Letter Grade: B       */

  /*  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Write your dgree ");
        int degree = scanner.nextInt();

           if (degree <= 100 && degree >= 90 ){
             System.out.println(" Your grade is ' A ' ");
         }

           else if ( degree <= 89 && degree >= 80 ) {
             System.out.println(" Your grade is  ' B '  ");
         }

           else if ( degree <= 79 && degree >= 70 ) {
             System.out.println(" Your grade is  ' C ' ");
         }

           else if ( degree <= 69 && degree >= 60  ) {
               System.out.println(" You grade is  ' D ' ");
         }

           else if (degree <= 59 && degree >= 0 ) {
               System.out.println(" Your grade is ' F ' ");
           }

           else {
               System.out.println(" Unkown !! please try again ");
           }

    }









    /*     5. Write a Java program that takes a person's age as input and
            categorizes them into one of three age categories: "Child,"
            "Teenager," or "Adult" using an if statement.
             use an if statement to categorize the age based on the following criteria:
            • If the age is less than 13, categorize them as a "Child."
            • If the age is between 13 and 19 (inclusive), categorize them as a "Teenager."
            • If the age is 20 or older, categorize them as an "Adult."
             Sample Output:
             Enter your age: 25
             You are an Adult.         */

 /*    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" How old are you? ");
        int age = scanner.nextInt();

        if (age < 13 ){
            System.out.println(" You are an Child ");
        }

        else if (age >= 13 && age <= 19) {
            System.out.println(" You are an Teenager ");

        } else if ( age >= 20  ) {
            System.out.println(" You are an Adult.  ");

        }


    }  */

}
