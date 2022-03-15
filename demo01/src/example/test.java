package example;
import java.io.*;
public class test {
    public static void main(String args[]) {
        int b;
        File f = new File("D:\\Desktop\\web后端\\test-1\\src\\example", "abc.txt");
        byte bytes[] = new byte[512];
        System.out.print("Please enter the:");
        try {
            if (f.exists())
                f.createNewFile();
            b = System.in.read(bytes);
            FileOutputStream fos = new FileOutputStream(f, true);
            fos.write(bytes, 0, b);
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            FileInputStream fis = new FileInputStream(f);
            int rs = 0;
            System.out.print("The content of java is:");
            while ((rs = fis.read(bytes, 0, 512)) > 0) {
                String s = new String(bytes, 0, rs);
                System.out.println(s);
            }
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
