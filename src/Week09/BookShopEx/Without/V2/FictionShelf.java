package Week09.BookShopEx.Without.V2;


import Week09.BookShopEx.Book;
import Week09.BookShopEx.Fiction;

import java.util.ArrayList;
import java.util.List;

public class FictionShelf {
    private List<Fiction> inventory = new ArrayList<>();

    public void addItem(Fiction book) {
        inventory.add(book);
    }


    public Fiction getItem(int index) {
        return inventory.get(index);
    }

    public void displayBooks() {
        for (Book book : inventory) {
            System.out.println(book.getTitle() + " (" + book.getGenre() + ")");
        }
    }
}
