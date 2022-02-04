import java.util.*;  //importing java.util package
import java.io.*; //importing java.
import java.text.*;
import java.nio.*;
public class L1{
    L1() 
    {
        System.out.println("***MENU***");
        System.out.println("1.REGISTER");
        System.out.println("2.LOGIN");
        System.out.println("3.SEARCH");
        System.out.println("4.RECOMMEND");
        System.out.println("5.FEEDBACK");
        System.out.println("6.HELP");
        System.out.println("7.Account Maintainance");
        System.out.println("8.EXIT");		
        /**Select the choice that you needed. */
        System.out.println("enter your choice");
        System.out.println("enter your choice in integers only");
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();//accept user input
        switch(choice)
        {
            case 1:
             Register r=new Register();break;
            case 2:
            Login l=new Login();break;
            case 3:
            Search s =new Search();break;
            case 4:
            Recommend re=new Recommend();break;
            case 5:
            Feedback f=new Feedback();break;
            case 6:Help h=new Help();break;
            case 7:
             AccountMaintainance z=new AccountMaintainance();
             break;
            // z.AccountMaintainance();
            case 8:Exit e=new Exit();break;
            default: System.out.println("Incorrect input!!! Please re-enter choice from our menu");
        }
    }

}