import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.URL;
import java.net.URLConnection;

public class DownloadImage {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://i.pinimg.com/originals/eb/58/cc/eb58cc5cfecde2911c1bd9bb8df69ce7.jpg");
            BufferedInputStream bufferedStream = new BufferedInputStream(url.openStream());
            FileOutputStream fileOutputStream = new FileOutputStream("/Users/lrandom/Documents/download.jpg");
            int data;
            while ((data = bufferedStream.read()) != -1) {
                fileOutputStream.write(data);
            }
            fileOutputStream.close();
            bufferedStream.close();

        } catch (Exception e) {

        }
    }
}
