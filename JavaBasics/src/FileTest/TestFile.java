package FileTest;

import java.io.File;
import java.io.IOException;

public class TestFile {
    public static void main(String[] args) {
        String fileName = "fll";
        String separator = File.separator;
        String directory = "myDir1" +separator + "myDir2";

        File f = new File(directory,"fff");
        if (f.exists()){
            System.out.println(f.getAbsoluteFile());
            System.out.println(f.length());
        }else {
            f.mkdirs();
            try {
                f.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }    }
}
