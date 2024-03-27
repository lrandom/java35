import java.io.*;
import java.net.URL;

public class UpgradeDownoadListImage {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("/Users/lrandom/Desktop/note.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String link = "";
            int i = 0;
            while ((link=bufferedReader.readLine())!=null) {
                URL url = new URL(link);
                BufferedInputStream bufferedStream = new BufferedInputStream(url.openStream());
                FileOutputStream fileOutputStream = new FileOutputStream("/Users/lrandom/Documents/" + i+ ".jpg");
                int data;
                while ((data = bufferedStream.read()) != -1) {
                    fileOutputStream.write(data);
                }
                fileOutputStream.close();
                bufferedStream.close();
                i++;
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
