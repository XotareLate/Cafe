package service;

import domen.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Order {
    private Product product;
    private int qualityProduct;


    @Override
    public String toString() {
        return
                "Название= " + product.getName() +
                ", Количество " + qualityProduct +
                ", Цена= "+product.getPrice()*qualityProduct ;
    }



    public Product getProduct() {
        return product;
    }

    public int getQualityProduct() {
        return qualityProduct;
    }

    public Order(Product product, int qualityProduct) {
        this.product = product;
        this.qualityProduct = qualityProduct;

    }

    Scanner in =new Scanner(System.in);

    public Order(ProductService productService) {
        this.productService = productService;
    }
    private   ProductService productService ;

    public List<Order> makeOrder(){
        List<Order> orderList=new ArrayList<>();
        try {

        while (true){
            System.out.println("id Продукта ");
            int productId= in.nextInt();
            System.out.println("Количество");
            int pizzaQuality= in.nextInt();

            if(productService.findById(productId)==null){
                System.out.println("Нет такова ");
            }
            if(productId<=0||pizzaQuality<=0){
                System.out.println("id или количество не может быть < 0");
            }
            else {
                Order order=new Order(productService.findById(productId),pizzaQuality);
                orderList.add(order);
            }
            System.out.println("Вы хотите продолжить +да  -нет");
            String choice=in.next();
            if(choice.equals("-")){
                break;

            }

        }

        }
        catch (Exception e){

            System.err.println("error");
        }

        return orderList;
    }
    public double calculateOrder(List<Order>orderList){
        double Price=0;
        for (Order order : orderList) {
            Price+=order.getProduct().getPrice()*order.getQualityProduct();
        }
        return Price;

    }





    }
