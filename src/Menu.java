import models.Product;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Scanner scanner = new Scanner(System.in);
        do {

            System.out.println("1");
            System.out.println("2");
            System.out.println("3");
            System.out.println("4.Exit");
            int choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("Nhap vao thong tin");
                    System.out.println("ID");
                    scanner = new Scanner(System.in);
                    String id = scanner.nextLine();
                    scanner = new Scanner(System.in);
                    System.out.println("Name");
                    String name = scanner.nextLine();
                    scanner = new Scanner(System.in);
                    System.out.println("Price");
                    float price = scanner.nextFloat();
                    System.out.println("Quantity");
                    int quantity = scanner.nextInt();
                    Product product = new Product(id, name, price, quantity);
                    try {
                        productManager.addProduct(product);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 2:
                    System.out.println("San pham co gia cao nhat la");
                    System.out.println(productManager.getHighestPriceProduct().getName());
                    System.out.println(productManager.getHighestPriceProduct().getPrice());

                    System.out.println("San pham co gia thap nhat la");
                    System.out.println(productManager.getLowestPriceProduct().getName());
                    System.out.println(productManager.getLowestPriceProduct().getPrice());

                    break;

                case 3:
                    System.out.println("Nhap vao tu khoa");
                    scanner = new Scanner(System.in);
                    String kw = scanner.nextLine();
                    for (Product foundProduct : productManager.searchProduct(kw)) {
                        if (foundProduct != null) {
                            System.out.println(foundProduct.getName());
                        }
                    }

                    break;

                case 4:
                    System.exit(1);
            }
        } while (true);
    }
}
