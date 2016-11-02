package Collections;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by jjenkins on 11/2/2016.
 */
public class Collections1 {

    public static void main(String args[]){

        Product door = new Product("Wooden Door" , 35);
        Product floor = new Product("Floor" , 25);
        Product window = new Product("Window" , 15);
        //collection of products A list with a ganeric type of products
        Collection<Product> products = new ArrayList<>();
        products.add(door);
        products.add(floor);
        products.add(window);

        for (Product p : products) {

            System.out.println(p.getWeight());
            System.out.println(p.getName());
        }

        System.out.println(products.contains(door));

    }


}
