import java.util.*;  //importing java.util package
import java.io.*; //importing java.
import java.text.*;
import java.nio.*;  //import the java.util package

public class Help{
    Help(){
        System.out.println("you can know each and every feature of the software using this feature");
        System.out.println("code still in development");
        try 
        {
             File myObj1 = new File("help.txt");//path of file
            Scanner myReader = new Scanner(myObj1);
            while (myReader.hasNextLine())
            {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        }
        catch (FileNotFoundException e) 
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}