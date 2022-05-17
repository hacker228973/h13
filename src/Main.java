import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
//        Product product1 = new Product("Говядина",1,130);
//        Product product2 = new Product("Помидоры",15,100);
//        products.add(2,product2);
//        Product product3 = new Product("Огурец",1,5);
//        products.add(3,product3);
//        Product teleshka = new Product()
        boolean turn = true;
        do {
            System.out.println("Введите команду из списка предложенных");
            System.out.println("add, remove, exit");
            switch (scanner.nextLine()) {
                case "exit":
                    turn = false;
                    break;
                case "add":
//                    System.out.println("Введите название продукта");
//                    String name = scanner.nextLine();
//                    System.out.println("Введите кол-во продукта");
//                    int count = scanner.nextInt();
//                    System.out.println("Введите цену продукта");
//                    int price = scanner.nextInt();
//                    Product product2 = new Product(name, count, price);
//                    products.add(product2);
//                    System.out.println("Ваша корзина"+(products));
                    Product.add(products);
                    break;
                case "remove":
//                    Product.remove(products);
                    Product.remove(products);
                    break;
//                case "get":
////                    System.out.println(products.get(1).name);w
////                    if(products.equals(0){
//
////                }
////                    if(products.name.equals("Том")){
////
////                    }
//                    System.out.println(products.get(0).name);
                default:
                    turn = false;
                    break;
            }
        } while (turn == true);

    }
}
