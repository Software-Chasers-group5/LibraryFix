import java.util.*;  //importing java.util package
import java.io.*; //importing java.
import java.text.*;
import java.nio.*;
public class Recommend{
    Recommend(){
        Scanner z=new Scanner(System.in);
        System.out.println("Enter the name of the book that you recommended:\n");
        String s=z.nextLine();
        try 
        {
          //creating an object for File class.
            File f1 = new File("RecommendedBooks.txt");
            if(!f1.exists()) 
            {
                f1.createNewFile();
            }
            //we use the file writer class to get the name.
            FileWriter fileWritter = new FileWriter(f1.getName(),true);
            BufferedWriter bw = new BufferedWriter(fileWritter);
            //bw.write("\n");
            bw.write(s+"\n");
            bw.close();
            //System.out.println("Done");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        } 
    }
}