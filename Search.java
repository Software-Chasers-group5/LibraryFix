import java.util.*;  //importing java.util package
import java.io.*; //importing java.
import java.text.*;
import java.nio.*;
public class Search{
    Search(){
            System.out.println("1 Search by Booktitle\n");
            System.out.println("2 Search by Author\n");
            System.out.println("3 Search by publisher\n");
            System.out.println("Press any key to EXIT\n");
            System.out.println("Enter your choice: ");
            Scanner b=new Scanner(System.in);
            int choice=b.nextInt();
            switch(choice)
            {
                case 1:
                    boolean f1=false;
                    System.out.println("Enter Book name:");
                    Scanner o=new Scanner(System.in);
                    String bookName=o.nextLine();
                    String bt1[]={"S","java","python","c"};
                    for(int i=0;i<bt1.length;i++)
                    {
                      //String f=bt1[i];
                        if(bookName.equals(bt1[i]))
                        {
                            f1=true;
                        }                  
                    }
                    if(f1)
                    {
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
                    for(int k=0;k<auth.length;k++)
                    {
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
                    for(int m=0;m<pubr.length;m++)
                    {
                        if(bookPublisher.equals(pubr[m]))
                            System.out.println("Found");
                    }
                    break;
            }
    }
}