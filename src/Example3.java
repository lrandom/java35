public class Example3 {
    public static void main(String[] args) {
        String a = "hello";
        String b = "Hello";
        System.out.println(a.equalsIgnoreCase(b));

        String name = "Nguyen Thanh Luan";
        char[] names = new char[5];//0,1,2,3,4
        name.getChars(0, 3, names, 0);
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        System.out.println("abc".compareTo("abc"));
        System.out.println("abc".compareTo("ab"));
        System.out.println("abc".compareTo("abcd"));
    }
}
