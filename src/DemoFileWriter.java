import java.io.FileWriter;

public class DemoFileWriter {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("/Users/lrandom/Desktop/note2.txt");
            fileWriter.write("hdjkfdhjkdhkjf hd fhdkjf dfhkdhkf dhfdf");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
