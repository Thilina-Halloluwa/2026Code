package Week09.BookShopEx.Without.V2;

import Week09.BookShopEx.Fiction;

public class FictionShelf  extends BookShelf {
    public void addItem(Fiction book) {
        super.addItem(book);
    }

    @Override
    public Fiction getItem(int index) {
        return (Fiction) super.getItem(index);
    }
}
