package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * Created by jjenkins on 11/2/2016.
 */
public class Shipment implements Iterable<Product> {

    private static final int LIGHT_VAN_MAX_WEIGHT = 20;
    public static final int INT_COMPARE_THIS = -1;


    private final List<Product> products = new ArrayList<>();


    public void add(Product product){
        int one =1;

        if(one> INT_COMPARE_THIS){
            System.out.println("impossible");
        }

        products.add(product);
    }

    @Override
    public Iterator<Product> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super Product> action) {



    }

    @Override
    public Spliterator<Product> spliterator() {
        return null;
    }
}
