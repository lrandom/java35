import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.URL;

public class DownloadListImage {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("/Users/lrandom/Desktop/note.txt");
            int i;
            StringBuilder stringBuilder = new StringBuilder();
            while ((i = fileInputStream.read()) != -1) {
                //System.out.println((char)i);
                stringBuilder.append((char) i);
            }
            String[] links = stringBuilder.toString().split("<<>>");

            for (int j = 0; j < links.length; j++) {
                String link = links[j];
                URL url = new URL(link);
                BufferedInputStream bufferedStream = new BufferedInputStream(url.openStream());
                FileOutputStream fileOutputStream = new FileOutputStream("/Users/lrandom/Documents/" + j + ".jpg");
                int data;
                while ((data = bufferedStream.read()) != -1) {
                    fileOutputStream.write(data);
                }
                fileOutputStream.close();
                bufferedStream.close();
            }
            fileInputStream.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
