import domen.Drink;
import service.Order;
import domen.Pizza;
import domen.Product;
import repozitory.ProductRepozitory;
import service.ProductService;
import view.Menu;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Product>listProducts=List.of(new Pizza(1,"4 сыра",13),
                new Pizza(2,"Пепперони",11),
                new Pizza(3,"Европейская",11),
                new Pizza(4,"Карбонара",8),
                new Drink(5,"Пиво",3),
                new Drink(6,"Сок",2),
                new Drink(7,"Кока кола(пепсе)",2));

        ProductRepozitory productRepozitory=new ProductRepozitory(listProducts);
        ProductService productService =new ProductService(productRepozitory);
        Order order=new Order(productService);
        Menu menu=new Menu(order, productService);
        while (true) {
            menu.menu();
        }
    }
}