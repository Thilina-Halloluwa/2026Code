package Week09.BookShopEx.With;

import Week09.BookShopEx.*;

public class Main {
    public static void main(String[] args) {

        BookShelf<Fiction> fictionShelf = new BookShelf<>();
        BookShelf<Action> actionShelf = new BookShelf<>();
        //BookShelf<Book> allBookShelf = new BookShelf<>();

        fictionShelf.addItem(new Fiction("The Hobbit", "J.R.R. Tolkien"));
        fictionShelf.addItem(new Fiction("Harry Potter", "J.K. Rowling"));

        actionShelf.addItem(new Action("Die Hard", "Roderick Thorp"));

       // allBookShelf.addItem(new Fiction("Percy Jackson", "Rick Riordan"));
        //allBookShelf.addItem(new Action("Mission Impossible", "Bruce Geller"));

        // Display books
        fictionShelf.displayBooks();
        actionShelf.displayBooks();
       // allBookShelf.displayBooks();


    }
}
