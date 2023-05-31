package service;

import domen.Pizza;
import domen.Product;
import repozitory.IRepozitory;
import repozitory.ProductRepozitory;

import java.util.List;

public class ProductService {
    private final ProductRepozitory repozitory;
    public ProductService(ProductRepozitory repozitory) {
        this.repozitory=repozitory;
    }

    public Product findById(int id ){
        return repozitory.findById(id);

    }
    public double getPrice(int id){
        return repozitory.getPrice(id);
    }
    public List<Product> productList(){
        return repozitory.getAll();
    }


}
