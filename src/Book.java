import java.util.*;
public class Book {
   private int sNo;
   private String bookName;
   private String authorName;

   //parameterized constructor
    Book(int sN, String bookN,String authorN){
        this.sNo = sN;
        this.bookName = bookN;
        this.authorName = authorN;
    }

    //Default constructor
    Book(){

    }

   public int getsNo(){
       return sNo;
   }

   public String getBookName(){
       return bookName;
    }

   public String getAuthorName(){
       return authorName;
   }

   public void setsNo(int sNo){
        this.sNo = sNo;
    }

    public void setBookName(String bookName){
        this.bookName = bookName;
    }

    public void setAuthorName(String authorName){
        this.authorName = authorName;
    }

    Scanner sc = new Scanner(System.in);

    public void bookMenu() {
        //Book book = new Book();
        System.out.println("1: Enter Serial Number of a Book.");
        this.sNo = sc.nextInt();
        //book.setsNo(sNo);
        System.out.println("2: Enter Book Name: ");
        this.bookName = sc.next();
        //book.setBookName(bookName);
        System.out.println("3: Enter Author Name: ");
        this.authorName = sc.next();
       // book.setAuthorName(authorName);
    }

    public void userUpdateDisplay(){
        System.out.println("1: To change the Serial Number of Book.");
        System.out.println("2: To change the Book Name.");
        System.out.println("3: To change the Author Name.");

    }

    @Override
    public String toString(){
        return " Serial Number: " + sNo + "\r\n" + " Book Title: " + bookName + "\r\n" + " Author Name: "+ authorName;
    }

}
