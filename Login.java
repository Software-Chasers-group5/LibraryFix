import java.util.*;  //importing java.util package
import java.io.*; //importing java.
import java.text.*;
import java.nio.*;  //import the java.util package
public class Login{
    Login()
    {
        String filepath="ap.csv";
        Scanner j=new Scanner(System.in);
        System.out.println("Enter membership id");
        String memberShipid=j.nextLine();
        System.out.println("Enter password");
        String password=j.nextLine();
        filepath="ap.csv";
        try
        {
            Scanner x;
            boolean flag=false;
            x=new Scanner(new File(filepath));
            x.useDelimiter("[,\n]");
            while(x.hasNext())
            {
                String userName=x.next();
                String Rollno=x.next();
                String membership=x.next();
                String password1=x.next();
                System.out.println(membership);    
                if(membership.equals(memberShipid))
                {
                  flag=true;
                  break;
                }
            }
            if(flag)
            {
                System.out.println("***SUBMENU***");
                System.out.println("1.ISSUE");
                System.out.println("2.RETURN");
                Scanner scan=new Scanner(System.in);
                int choice = scan.nextInt();
                switch(choice)
                {
                    case 1:Issue i=new Issue();break;
                    
                    case 2:
                       Return r=new Return();
                       break;
                }
            }
            else
                System.out.println("Login unsuccessful");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}