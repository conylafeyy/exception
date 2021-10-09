package domain;

public class Book extends Product {
    private String author;

    public Book() {
        super();
    }

    public Book(int id, int price, String name, String author) {
        super(id, price, name);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
