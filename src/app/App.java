package app;

import app.data.DataProvider;
import app.data.Product;
import app.services.DataService;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class App {

    static AtomicInteger count = new AtomicInteger(1);

    public static void main(String[] args) {
        double priceSearch = getSearchValue();
        DataProvider provider = new DataProvider();
        List<Product> list = provider.getData();
        getOutput(list);
        DataService service = new DataService();
        List<Integer> indexList = service.search(list, priceSearch);
        getOutput(list, priceSearch, indexList);
    }

    private static double getSearchValue() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter price value to search (x.xx): ");
        return Double.parseDouble(scanner.next());
    }

    private static void getOutput(List<Product> list) {
        System.out.print("Initial data:\n");

        for (Product product : list)
            System.out.println(count.getAndIncrement() + ") " +
                    product.getName() + ", USD " + product.getPrice());
    }

    private static void getOutput(List<Product> list, double priceSearch, List<Integer> indexList) {
        System.out.println("------------------------");
        if(indexList.isEmpty())
            System.out.println("There is no product with this price.");
        else for (int i : indexList)
            System.out.print("Product: " + list.get(i).getName() +
                    ", USD " + priceSearch + "\n");
    }
}