import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by sho on 2017/07/18.
 */
public class main {
    public static void main(String args[]){
        Path fileLocation = Paths.get("C:\\Users\\sho\\Desktop\\a.txt");
        try {
            byte[] data = Files.readAllBytes(fileLocation);
            for (int i = 0; i < data.length; i++) {
                System.out.print(data[i]);
            }
            String bytes = "";
            byte[] dataa = toBytes(bytes.toCharArray());
                FileOutputStream fileOuputStream = new FileOutputStream("C:\\Users\\sho\\Desktop\\b");
                fileOuputStream.write(dataa);
                fileOuputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    private static byte[] toBytes(char[] chars) {
        List<Byte> a = new ArrayList<>();
        for(int i = 0;i < chars.length;i++){
            a.add((byte) chars[i]);
        }
        byte[] b = new byte[chars.length];
        for(int i = 0;i < a.size();i++){
            b[i] = a.get(i);
        }
        return b;
    }
}
