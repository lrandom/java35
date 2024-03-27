import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyDemo {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("/Users/lrandom/Desktop/original.jpeg");
            FileOutputStream fileOutputStream = new FileOutputStream("/Users/lrandom/Documents/copy.jpeg");
            int data = 0;
            while ((data = fileInputStream.read()) != -1) {
                fileOutputStream.write(data);
            }
            fileInputStream.close();

            fileOutputStream.close();
        } catch (Exception e) {

        }
    }
}
