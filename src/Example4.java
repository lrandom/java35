import java.util.StringTokenizer;

public class Example4 {
    public static void main(String[] args) {
        String greeting = "Hello, I come From VietNam";
        StringTokenizer stringTokenizer = new StringTokenizer(greeting);
        while (stringTokenizer.hasMoreTokens()) {
            System.out.println(stringTokenizer.nextToken());
        }
    }
}
