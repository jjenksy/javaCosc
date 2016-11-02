package Collections;

/**
 * Created by jjenkins on 11/2/2016.
 */
public class Product {
    private final String name;
    private final int weight;


    public Product(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }


}
