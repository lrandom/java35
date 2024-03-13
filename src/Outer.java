public class Outer {
    String outerName = "OuterName";

    class Inner {
        public void printOuterName() {
            class User {
                String id;
                String name;
            }
            User user = new User();
            user.name = "Test";
            System.out.println(outerName);
        }
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.printOuterName();
    }
}
