package domen;

import java.util.List;

public class Pizza extends Product{
    public Pizza(int id, String name, int price) {
        super(id, name, price);
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
