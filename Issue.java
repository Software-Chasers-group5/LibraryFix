import java.util.*;  //importing java.util package
import java.io.*; //importing java.
import java.text.*;
import java.nio.*;  
public class Issue{
    Issue()
    {
        // login details....
        HashMap<String, Integer> hm=new HashMap<String, Integer>();
        /**m hashmap stores the student id with date of issue */
        HashMap<String, String> m=new HashMap<String, String>();
        /** d hasmap stores the bookname and no.of book present */
        HashMap<String, Integer> d=new HashMap<String, Integer>();
        hm.put("O7",1);
        hm.put("O6",1);
        hm.put("M8",2);
        hm.put("N1",2);
        d.put("c",6);
        d.put("python",5);
        d.put("Java",6);
        d.put("SE",10);
        System.out.println("Enter Student Id,bookName");
        Scanner c = new Scanner(System.in);
        String studentId = c.nextLine();
        Scanner c1 = new Scanner(System.in);
        String bookName = c1.nextLine();
        /** it gives the date */
        String pattern = "MM-dd-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(new Date());
        //System.out.println(date);
        //it checks whether thestudent id is present in hashmap hm.
        if(hm.containsKey(studentId))
        {
            int a=hm.get(studentId);
            if(a<2)
            {
                System.out.println("you are eligible to issue");
                int p=d.get(bookName);
                if(p>0)
                {
                    m.put(studentId,date);
                    d.put(bookName,++p);
                    hm.put(studentId,++a);
                    System.out.println("Issue Successful");
                }
                else
                    System.out.println("not possible");
            }
            else
                System.out.println("you are not eligible since no.of book issued are already 2");
        }
        else{
            System.out.println("Invalid student id");
        }
    }
    
}