public class Example {
    public static void main(String[] args) {
        int ages[] = new int[20];//mảng có 20 phần tử
        ages[ages.length - 1] = 20;//demo cách gán dữ liệu cho phần tử mảng cuối cùng
        for (int i = 0; i < ages.length; i++) {
            System.out.println(ages[i]);
        }

        for (int age : ages
        ) {
            System.out.println(age);
        }

        String[] names = new String[]{"Luan", "Nam", "Linh"};
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
