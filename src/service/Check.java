package service;

import service.Order;

import java.util.List;

public class Check {
    public static void printCheck(List<Order> orderList, double totalPrice){
        System.out.println("Ваш чек");
        for (Order order:orderList){
            System.out.println(order.toString());
        }
        System.out.println("К оплате "+totalPrice);

    }

}
