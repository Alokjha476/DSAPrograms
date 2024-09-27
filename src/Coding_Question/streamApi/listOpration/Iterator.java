package Coding_Question.streamApi.listOpration;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

class Product {
    Integer id;
    String name;
    float price;

    public Product(Integer id, String name, float price) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
    }


}

public class Iterator {
    // Its works for java collections Objects
    public static void main(String[] args) {
        List<Product> productList = new LinkedList<Product>();

        productList.add(new Product(1, "Flappy", 25000));
        productList.add(new Product(2, "mobile", 20000));
        productList.add(new Product(3, "pend rive", 30000));

        List<Float> newpriceList = productList.stream().
                filter(p -> p.price < 30000).map(p -> p.price).collect(Collectors.toList());

        System.out.println(newpriceList);

        productList.stream().filter(p -> p.price == 25000).forEach(p -> System.out.println(p.name));


    }
}
