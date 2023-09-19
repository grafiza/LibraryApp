import java.util.ArrayList;
import java.util.List;

public class BookService {
    public static List<Books> bookList=new ArrayList<>();

    public static void addBook(String bookName,String author,String type,String publisher){
        Books book=new Books(bookName,author,type,publisher);
        bookList.add(book);

    };
    public static void printBooks(){
        System.out.println("Kitap Listesi");
        System.out.println("---------------------------------------------------------");
        int i=0;
        for (Books w:bookList             ) {
            System.out.printf("%-2s %-15s %-15s %-15s %-15s\n",i,w.getBookName(), w.getAuthorName(), w.getBookType(), w.getPublisherName());
            i++;
        }
    }
    public static  void deleteBook(int index){
        bookList.remove(index);
        printBooks();
    }
    public static void deleteLibrary(){
        bookList.clear();
        printBooks();
    }
}
