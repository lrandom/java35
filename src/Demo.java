import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class Demo {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream =
                    new FileInputStream("/Users/lrandom/Desktop/note.txt");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            int i = 0;
            while ((i = bufferedInputStream.read()) != -1) {
                System.out.println((char) i);
            }
            //đóng stream
            bufferedInputStream.close();
            fileInputStream.close();

        } catch (Exception e) {

        }
    }
}
