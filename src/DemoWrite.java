import java.io.FileOutputStream;

public class DemoWrite {
    public static void main(String[] args) {
        try {
            String content = "Xin chao, cho xin 2k";
            FileOutputStream fos =
                    new FileOutputStream("/Users/lrandom/Desktop/note.txt",true);
            fos.write(content.getBytes());
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
