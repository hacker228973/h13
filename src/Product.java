import java.util.ArrayList;
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
    static public void add(ArrayList<Product> products, String name, int count, int price) {
        Product product = new Product(name, count, price);
        products.add(product);
        System.out.println("Ваша корзина" + (products));
    }
    static public void remove(ArrayList<Product> products, String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
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

