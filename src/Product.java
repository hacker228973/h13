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
        int i = -1;
        String name = scanner.nextLine();
        for (Product product : products) {
            i++;
//            products.get(i);//Получение элемента

            if (products.get(i).name.equals(name)) {
                products.remove(i);
                System.out.println("Успешно удалено");
                System.out.println("Ваша корзина" + (products));
                break;
            }
            else{
                System.out.println("Соре соре продукт не найден");

            }
//            System.out.println(products.get(i));


        }
    }

//    public String getName(ArrayList<Product> products) {
////        return products.get(products.indexOf(product)).name;
//        return " ";
//    }

}
