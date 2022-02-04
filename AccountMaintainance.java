import java.util.*;
import java.io.*;
import java.nio.file.*;
public class AccountMaintainance{
    public static long no_of_users(){

            Path path = Paths.get("ap.csv");
      
            long lines = 0;
            try {
      
                // much slower, this task better with sequence access
                //lines = Files.lines(path).parallel().count();
      
                lines = Files.lines(path).count();
      
            } catch (IOException e) {
                e.printStackTrace();
            }
      
            //System.out.println("lines);
            return lines;
        }
        public static void addMember(){
            Pu.register();
        }
    
    AccountMaintainance(){
        System.out.println("1.No.of.users");
        System.out.println("2.Add Membership");
       Scanner s=new Scanner(System.in);
       int choice=s.nextInt();
       switch(choice){
           case 1:
           long p= no_of_users();
           System.out.println("No.of users:"+p);
           break;
           case 2:
           addMember();
           break;
       }
    }
}