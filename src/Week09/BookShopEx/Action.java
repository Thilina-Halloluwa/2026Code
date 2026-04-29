package Week09.BookShopEx;

public class Action extends Book{

    public Action(String title, String author){
        super(title, author);
    }

    @Override
    public String getGenre() {
        return "Action";
    }
}
