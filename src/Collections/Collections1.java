package Collections;

import java.util.*;

/**
 * Created by jjenkins on 11/2/2016.
 */
public class Collections1  {


    public static void main(String args[]){

        Product door = new Product("Wooden Door" , 35);
        Product floor = new Product("Floor" , 25);
        Product window = new Product("Window" , 15);
        //A list with a ganeric type of products
        List<Product> products = new ArrayList<>();
        products.add(door);
        products.add(floor);
        products.add(window);

//        for (Product p : products) {
//
//            System.out.println(p.getWeight());
//            System.out.println(p.getName());
//        }

        //Set insures no duplications
        Set<Product> productSet = new HashSet<>();

        productSet.add(door);
        productSet.add(floor);
        productSet.add(window);

        for (Product p: productSet){
            System.out.println(p.hashCode());
        }

        //a map is a key value pair
        Map<String , Integer> map = new HashMap<>();

        map.put("test", 0);
        map.put("test1", 1);
        map.put("test2", 2);


        System.out.println(map);

        System.out.println(new SortedPair<>(1,2).getFirst());


    }


}
