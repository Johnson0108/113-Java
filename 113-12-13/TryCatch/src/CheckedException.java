import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedException {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        try{
            File file = new File("nonexistentfile.txt");
            FileReader reader = new FileReader(file);
        }catch (FileNotFoundException e){
            System.out.println("處理受檢例外:"+e.getMessage());
        }
    }
}
