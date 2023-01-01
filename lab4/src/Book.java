public class Book extends Goods{
    private String author;
    private String title;
    public Book(double price, int number,String author,String title) throws PriceException {
        super(price, number);
        this.author=author;
        this.title=title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public double checkPromo(double percent) {
        return getPrice()-(getPrice()*(percent/100));
    }

    public String toString() {
        return "Book{" +
                "price:"+getPrice()+
                "number:"+getNumber()+
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
