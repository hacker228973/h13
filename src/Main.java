import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        boolean turn = true;
        do {
            System.out.println("Введите команду из списка предложенных");
            System.out.println("add, remove, exit");
            switch (scanner.nextLine()) {
                case "exit":
                    turn = false;
                    break;
                case "add":

                    Product.add(products);
                    break;
                case "remove":

                    Product.remove(products);
                    break;

                default:
                    turn = false;
                    break;
            }
        } while (turn);

    }
}
