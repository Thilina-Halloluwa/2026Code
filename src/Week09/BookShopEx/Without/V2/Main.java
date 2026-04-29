package Week09.BookShopEx.Without.V2;

import Week09.BookShopEx.*;

public class Main {
    public static void main(String[] args) {
        FictionShelf fictionShelf = new FictionShelf();
        fictionShelf.addItem(new Fiction("The Hobbit", "J.R.R. Tolkien"));
        fictionShelf.addItem(new Fiction("Harry Potter", "J.K. Rowling"));

        ActionShelf actionShelf = new ActionShelf();
        actionShelf.addItem(new Action("Die Hard", "Roderick Thorp"));

        BookShelf allBookShelf = new BookShelf();
        allBookShelf.addItem(new Fiction("Percy Jackson", "Rick Riordan"));
        allBookShelf.addItem(new Action("Mission Impossible", "Bruce Geller"));


        System.out.println("Fiction Shelf:");
        fictionShelf.displayBooks();

        System.out.println("\nAction Shelf:");
        actionShelf.displayBooks();

        System.out.println("\nAll Books Shelf:");
        allBookShelf.displayBooks();

    }
}
