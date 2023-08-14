package app.services;

import app.data.Product;

import java.util.ArrayList;
import java.util.List;

public class DataService {
    // Алгоритм лінійного пошуку
    public List<Integer> search(List<Product> list, double x) {
        List<Integer> indexList = new ArrayList<>();
        for (int i = 0; i < list.toArray().length; i++)
            if (list.get(i).getPrice() == x)
                indexList.add(i);
                return indexList;
    }
}
