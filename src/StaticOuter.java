public class StaticOuter {
    static String outerName = "OuterName";

    static class Inner {
        public void printOuterName() {
            System.out.println(outerName);
        }
    }

    public static void main(String[] args) {
        StaticOuter.Inner inner = new StaticOuter.Inner();
        inner.printOuterName();
    }
}
