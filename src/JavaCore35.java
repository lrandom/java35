import helpers.Constant;

import java.util.Scanner;

public class JavaCore35 {
    public static void main(String[] args) {
        //hard code
        String name;
        System.out.println("Vui long nhap vao ten");
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();
        //Helper helper = new Helper();
        name = Helper.trimText(name);
        System.out.println(Constant.labelInputData);

        System.out.println(Constant.labelInputData);
    }
}
