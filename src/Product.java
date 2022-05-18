import java.util.ArrayList;
import java.util.Scanner;

public class Product {
    String name;
    int count;
    int price;

    public Product(String name, int count, int price) {
        this.name = name;
        this.count = count;
        this.price = price;
    }

    @Override
    public String toString() {
        return "\nname='" + name + ", count=" + count + ", price=" + price;
    }

    public String getName() {
        return name;
    }

    static public void add(ArrayList<Product> products) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название продукта");
        String name = scanner.nextLine();
        System.out.println("Введите кол-во продукта");
        int count = scanner.nextInt();
        System.out.println("Введите цену продукта");
        int price = scanner.nextInt();
        Product product = new Product(name, count, price);
        products.add(product);
        System.out.println("Ваша корзина" + (products));
    }

    static public void remove(ArrayList<Product> products) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название продукта");

        String name = scanner.nextLine();
        for (Product product : products) {

            String nameChecked = product.getName();
            if (nameChecked.equals(name)) {
                products.remove(product);
                System.out.println("Успешно удалено");
                System.out.println("Ваша корзина" + (products));
                break;
            } else {
                System.out.println("Соре соре продукт не найден");

            }


        }
    }


}

