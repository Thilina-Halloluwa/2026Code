package Week09.BookShopEx.With;

import Week09.BookShopEx.Book;

import java.util.ArrayList;
import java.util.List;

public class BookShelf<T extends Book> {

    private List<T> inventory = new ArrayList<>();

    public  void addItem(T item){
        inventory.add(item);
    }

    public T getItem(int index){
        return inventory.get(index);
    }


    public  void displayBooks(){
        for(T book: inventory){
            System.out.println(book.getTitle()+ "-" + book.getGenre());

        }
    }
}
