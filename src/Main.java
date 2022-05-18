import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        boolean turn = true;
        do {
            System.out.println("Введите команду из списка предложенных");
            System.out.println("add, remove, exit");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextLine()) {
                case "add":
                    System.out.println("Введите название продукта");
                    String nameAdd = scanner.nextLine();
                    System.out.println("Введите кол-во продукта");
                    int count = scanner.nextInt();
                    System.out.println("Введите цену продукта");
                    int price = scanner.nextInt();
                    Product.add(products,nameAdd,count,price);
                    break;
                case "remove":
                    System.out.println("Введите название продукта");
                    String nameRemove = scanner.nextLine();
                    Product.remove(products,nameRemove);
                    break;
                default:
                    turn = false;
                    break;
            }
        } while (turn);

    }
}
