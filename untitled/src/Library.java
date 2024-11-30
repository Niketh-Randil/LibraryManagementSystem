import java.util.ArrayList;

public class Library {
    private ArrayList <Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    //function to add a book
    public void addBook(Book book){
        books.add(book);
        System.out.println("A book was added succesfully");
    }

    //function to remove a book
    public void removeBook(Book book){
        books.remove(book);
        System.out.println("A Book was removed succesfully");
    }

    //function to search for a book
    public void searchBook(String title){
        for (Book book : books){
            if(book.getTitle().equalsIgnoreCase(title)){
                System.out.println("Book was found"+book.getTitle());

            }else{
                System.out.println("Book was not found");
            }

        }
    }

    //function to display all the books
    public void showallBooks(){
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    //function to issue a book
    public  void  issueBook(int bookId){

    }


}
