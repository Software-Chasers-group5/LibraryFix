
import java.util.*;  //importing java.util package
import java.io.*; //importing java.
import java.text.*;
import java.nio.*;
public class Feedback{
    Feedback()
{
    /**code for giving feedback by the member. */
    // we use the Scanner class to take the input i.e name of the book.
    Scanner n=new Scanner(System.in);
    System.out.println("Enter the StudentId:");
    String studentId=n.nextLine();
    //Scanner s=new Scanner(System.in);
    System.out.println("enter your feedback:");
    String feedback=n.nextLine();
    try
    {
        //creating an object for File class.
        File f1 = new File("FeedBack.txt");
        if(!f1.exists())
        {
            f1.createNewFile();
        }
        //we use the file writer class to get the name.
        FileWriter fileWritter = new FileWriter(f1.getName(),true);
        BufferedWriter bw = new BufferedWriter(fileWritter);
        //bw.write("\n");
        bw.write(studentId+" "+":"+" "+feedback+"\n");
        bw.close();
        //System.out.println("Done");
    } 
    catch(IOException e)
    {
       e.printStackTrace();
    } 
}
}