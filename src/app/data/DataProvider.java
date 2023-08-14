package app.data;

import java.util.ArrayList;
import java.util.List;

public class DataProvider {

    public List<Product> getData() {
        List<Product> list = new ArrayList<>();
        list.add(new Product("apple", 1.29));
        list.add(new Product("plum", 1.79));
        list.add(new Product("banana", 2.05));
        list.add(new Product("mango", 2.75));
        list.add(new Product("kiwi", 2.23));
        list.add(new Product("cherry", 1.79));
        return list;
    }
}
