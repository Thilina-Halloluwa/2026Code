package Week09.BookShopEx.Without;

import Week09.BookShopEx.*;

public class Main {
    public static void main(String[] args) {
        BookShelf shelf = new BookShelf();

        shelf.addItem(new Fiction("The Hobbit", "J.R.R. Tolkien"));
        shelf.addItem(new Action("Die Hard", "Roderick Thorp"));
        shelf.addItem(new Fiction("Harry Potter", "J.K. Rowling"));
        shelf.addItem(new Action("Mission Impossible", "Bruce Geller"));


        Book b = shelf.getItem(0); // returns Book
        b = shelf.getItem(1);
        b = shelf.getItem(2);


        Fiction f = (Fiction) shelf.getItem(0); // cast needed if you want Fiction
        Fiction f2 = (Fiction) shelf.getItem(1);// second book is an action book
        Fiction f3 = (Fiction) shelf.getItem(2);


        // shelf.displayBooks();


    }
}
