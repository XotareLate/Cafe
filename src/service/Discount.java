package service;

import domen.Drink;
import domen.Pizza;

import java.util.List;

public class Discount {
    private final ProductService productService;

    public Discount(ProductService productService) {
        this.productService = productService;
    }

    public static double calculateDiscount(List<Order> orderList,double noDiscountPrice) {

        double discountPrice = noDiscountPrice;
        int allPizzaQuality = 0;
        int drinkQuality=0;


        for (Order order : orderList) {
            int qualityProduct=order.getQualityProduct();
            double priceProduct=order.getProduct().getPrice();

            if (order.getProduct() instanceof Pizza){
                allPizzaQuality+=qualityProduct;

                if(allPizzaQuality>=5){
                    discountPrice-=priceProduct*(allPizzaQuality/5);
                    allPizzaQuality=qualityProduct%5;
                }
            }
            if (order.getProduct() instanceof Drink ) {
                drinkQuality+=qualityProduct;
                if(priceProduct>2&&qualityProduct>=3){
                    discountPrice-=priceProduct*qualityProduct*0.15;
                }

            }
        }
        if(discountPrice>50){
            discountPrice-=discountPrice*0.20;
        }
        return discountPrice;


    }

}
