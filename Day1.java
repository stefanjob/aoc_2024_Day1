import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Day1 {

    public void Day1() {

    }

    public void loadInput(boolean full) {
        try {
            Scanner scanner = null;

            if (full) {
                scanner = new Scanner(new File("input.txt"));
            }
            else {
                scanner = new Scanner(new File("input.test.txt"));
            }
            while (scanner.hasNextLine()) {

                String line = scanner.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}