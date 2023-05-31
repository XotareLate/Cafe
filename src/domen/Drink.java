package domen;

public class Drink extends Product{
    public Drink(int id, String name, int price) {
        super(id, name, price);
    }

    @Override
    public String toString() {
        return "Drink{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
