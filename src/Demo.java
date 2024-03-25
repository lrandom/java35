import java.io.FileInputStream;

public class Demo {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream =
                    new FileInputStream("/Users/lrandom/Desktop/note.txt");
            int i = 0;
            while ((i = fileInputStream.read()) != -1) {
                System.out.println((char) i);
            }
            //đóng stream
            fileInputStream.close();
        } catch (Exception e) {

        }
    }
}
