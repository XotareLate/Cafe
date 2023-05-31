package repozitory;

import domen.Drink;
import domen.Pizza;
import domen.Product;

import java.util.Collections;
import java.util.List;

public class ProductRepozitory implements IRepozitory<Product>{
    public List<Product>listProducts;
    public ProductRepozitory(List<Product>listProducts) {
        this.listProducts=listProducts;





    }







    @Override
    public Product findById(int id) {
        return listProducts.stream()
                .filter(b -> id==(b.getId()))
                .findFirst()
                .orElse(null);
    }


    @Override
    public List<Product> getAll() {
        return listProducts;
    }

    @Override
    public double getPrice(int id) {
        Product product=findById(id);
        return product.getPrice();
    }
}
