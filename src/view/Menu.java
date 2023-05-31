package view;

import service.Check;
import service.Discount;
import service.Order;
import domen.Product;
import service.ProductService;

import java.util.*;


public class Menu {
    private Order order;
    Scanner in =new Scanner(System.in);
    public Menu(Order order, ProductService productService){
        this.order=order;

        this.productService = productService;
    }

    private final ProductService productService;

    public void printProducts(){

        List<Product> listPizza =productService.productList();
        for (Product product:listPizza){
            System.out.println(product.toString());
        }
    }

    public void menu()  {
        System.out.println("1-Сделать заказ  2 - Вывести меню  0-Выход");


        int num= in.nextInt();

        switch (num){
            case 1->{
                List<Order>orderList=order.makeOrder();
                double priceNoDiscount=order.calculateOrder(orderList);
                Check.printCheck(orderList,Discount.calculateDiscount(orderList,priceNoDiscount));


            }
            case 2->printProducts();
            case 0-> System.exit( 0);
            default -> System.out.println("Команда не найдена");
        }





    }




}
