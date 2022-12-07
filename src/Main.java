
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Library library = new Library();

        do {

            library.displayMainMenu();

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {

                Book book = new Book();
                book.bookMenu();
                library.addBook(book);
//                System.out.println(" Do you want to add more books?" + "\r\n" + " 'y' for Yes or 'n' for No");
//                String userAddMoreChoice = sc.next();
//                if(userAddMoreChoice == "y"){
//                    book.bookMenu();
//                    library.addBook(book);
//                }else{
//                    break;
//                }

            } else if (choice == 2) {

                //Read
                System.out.println("Enter the books serial Number that you want to find : ");
                int userChoice = sc.nextInt(); //100
                int indexUser = library.findBook(userChoice);
                //library.getBook(library.findBook(userChoice)).getAuthorName()
                //System.out.println("The index of the array object is: " + indexUser);
                //System.out.println("The list of the book that are available: " + book.toString());
                System.out.println("The book with the given Serial Number is: " + "\r\n" + library.getBook(library.findBook(userChoice)));
                //book.toString();

            } else if (choice == 3) {

                System.out.println("Enter the books serial Number that you want to Update : ");
                int userChoice = sc.nextInt();
                //int index = library.findBook(userChoice);
                Book book=library.getBook(library.findBook(userChoice));
                //library.getBook(userChoice);
                book.userUpdateDisplay();
                System.out.println("What do you want to update. ");
                int updateUserChoice = sc.nextInt();

                if (updateUserChoice == 1) {
                    System.out.println("Enter the new serial number for the book:  ");
                    int newsNo = sc.nextInt();
                    book.setsNo(newsNo);

                } else if (updateUserChoice == 2) {
                    System.out.println("Enter the New Book Name: ");
                    String newBookName = sc.next();
                    book.setBookName(newBookName);

                } else if (updateUserChoice == 3) {
                    System.out.println("Enter the new Author Name: ");
                    String newAuthorName = sc.next();
                    book.setAuthorName(newAuthorName);
                }

                System.out.println("The updated Book is : " + library.getBook(userChoice));

            } else if (choice == 4) {

                System.out.println("Enter the books serial Number that you want to Delete : ");
                int userChoice = sc.nextInt();

                Book book=library.getBook(library.findBook(userChoice));
                library.removeBook(book);

            } else if(choice == 5) {
                library.getAllBook();
            }
        } while (true);
    }
}