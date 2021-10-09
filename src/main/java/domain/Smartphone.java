package domain;

public class Smartphone extends Product {
    private String producer;

    public Smartphone() {
        super();
    }

    public Smartphone(int id, int price, String name, String producer) {
        super(id, price, name);
        this.producer = producer;
    }


    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }


}