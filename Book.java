import java.util.*;
import java.io.*;
import java.text.*;
public class Book{
    public void Search(){
        /**case 3 is for Searching a book.
         * The member can search a book by name of Booktitle or Author or publisher.
         * the member need to enter the choice of which type to search. 
         */
        System.out.println("1 Search by Booktitle\n");
        System.out.println("2 Search by Author\n");
        System.out.println("3 Search by publisher\n");
        System.out.println("Press any key to EXIT\n");
        System.out.println("Enter your choice: ");
        Scanner b=new Scanner(System.in);
        int choice=b.nextInt();
        switch(choice){
          case 1:
          /**case1 for searching the book by book name. */
          boolean f1=false;
            System.out.println("Enter Book name:");
            Scanner o=new Scanner(System.in);
            String bookName=o.nextLine();
            String bt1[]={"S","java","python","c"};
            for(int i=0;i<bt1.length;i++){
              //String f=bt1[i];
              if(bookName.equals(bt1[i])){
                  f1=true;
              }                  
            }
            if(f1){
              System.out.println("Found");
            }
            else
              System.out.println("not found");
            break;
          case 2:
          /** case2 is searching a book by author.*/
            System.out.println("Enter the name of the author");
            Scanner s=new Scanner(System.in);
            Scanner u=new Scanner(System.in);
            String bookAuthor=u.nextLine();
            String auth[]={"James Gosling","Roger s Pressmen","Dennis Ritche","Guido Van Rossum","stephen Wolfram","Brendan Eich"};
            for(int k=0;k<auth.length;k++){
              if(bookAuthor.equals(auth[k]))
                  System.out.println("Found ");
            }
            break;
          case 3:
          /**Case3 is searching a book by publisher. */
            System.out.println("Enter the name of the publisher:");
            Scanner v=new Scanner(System.in);
            String bookPublisher=v.nextLine();
            String pubr[]={"The Pragmatic Bookshelf","CENGAGE","Manning publications","Peachpit","No Starch Press","Que","LeanPub"};
            for(int m=0;m<pubr.length;m++){
              if(bookPublisher.equals(pubr[m]))
                System.out.println("Found");
            }
            break;
        }

    }
    public void Recommend(){
        /**case4 is for recommending books. */
        Scanner z=new Scanner(System.in);
        System.out.println("Enter the name of the book that you recommended:\n");
        String s=z.nextLine();
        try {
          //creating an object for File class.
          File f1 = new File("RecommendedBooks.txt");
          if(!f1.exists()) {
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
        catch(Exception e){
            e.printStackTrace();
        } 
          /**   File file = new File("RecommendedBooks.txt");
           Scanner c = new Scanner(file);
    
           // we just need to use \\Z as delimiter
            c.useDelimiter("\\z");
      
            System.out.println(c.next()); **/
    }
    public static void lg1()
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
    }
}