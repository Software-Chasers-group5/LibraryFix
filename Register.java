import java.util.*;  //importing java.util package
import java.io.*; //importing java.
import java.text.*;
import java.nio.*;  //import the java.util package


public class Register{
    Register(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter user name");
        String userName=sc.nextLine();
        System.out.println("Enter Rollno");
        String rollno=sc.nextLine();
        System.out.println("Enter password");
        String password=sc.nextLine();
        System.out.println("REMEMBER!!!!!");
        System.out.println("YOUR MEMBERSHIP ID IS LAST 2 DIGITS OF YOUR ROLL NUMBER");
        System.out.println("YOUR MEMBERSHIP ID IS LAST 2 DIGITS OF YOUR ROLL NUMBER");
        System.out.println("Enter your Membership id");
        String memberShipid=sc.nextLine();
        String filepath="ap.csv";
        /**
         * @param code.
         */
        try
        {
            FileWriter fw = new FileWriter(filepath,true);
            BufferedWriter bw=new BufferedWriter(fw);
            PrintWriter pw=new PrintWriter(bw);
            pw.println("\n");
            pw.println(userName+","+rollno+","+memberShipid+","+password+",");
           // pw.println("\n");
            pw.flush();
            pw.close();
            System.out.println("Registration successfull");
        }
        catch(Exception E)
        {
            System.out.println(E);
        }
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}