package Week09.BookShopEx.Without.V2;

import Week09.BookShopEx.Action;
import Week09.BookShopEx.Book;

import java.util.ArrayList;
import java.util.List;

public class ActionShelf {

    private List<Action> inventory = new ArrayList<>();

    public void addItem(Action book) {
        inventory.add(book);

    }


    public Action getItem(int index) {
        return inventory.get(index);
    }

    public void displayBooks() {
        for (Book book : inventory) {
            System.out.println(book.getTitle() + " (" + book.getGenre() + ")");
        }
    }
}
