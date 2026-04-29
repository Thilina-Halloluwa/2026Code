package Week09.BookShopEx;

public class Fiction extends Book {

    public Fiction(String title, String author) {
        super(title, author);

    }

    @Override
    public String getGenre() {
        return "Fiction";
    }
}
