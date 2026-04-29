package Week09.BookShopEx.Without.V2;

import Week09.BookShopEx.Action;

public class ActionShelf extends BookShelf {
    public void addItem(Action book) {
        super.addItem(book);
    }

    @Override
    public Action getItem(int index) {
        return  (Action) super.getItem(index);
    }
}
