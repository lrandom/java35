import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        ATMManager atmManager = new ATMManager();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui long nhap ID va MK");
        String id = scanner.nextLine();
        scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        if (atmManager.authenticate(id, password) == null) {
            //ko dc
            System.out.println("Thong tin dang nhap khong chinh xac");
            System.exit(1);
        }

        System.out.println("Welcome" + atmManager.getLoggedUser().getUser().getName());
        do {
            System.out.println("1. Rut tien");
            System.out.println("2. Truy van tk");
            System.out.println("3. Thoat chuong trinh");
            int choose = 0;
            scanner = new Scanner(System.in);
            choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("Nhap so tien can rut");
                    float withdrawMoney = 0;
                    do {
                        try {
                             withdrawMoney = scanner.nextFloat();
                            break;
                        } catch (Exception e) {
                            System.out.println("Vui long nhap vao so");
                        }
                    } while (true);
                    try {
                        atmManager.widthdraw(withdrawMoney);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 2:
                    atmManager.printAccountInfo();
                    break;

                case 3:
                    System.exit(1);
            }
        } while (true);

    }
}
