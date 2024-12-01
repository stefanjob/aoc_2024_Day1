import java.io.File;
import java.io.FileNotFoundException;
import static java.lang.Integer.parseInt;
import java.util.*;

public class Day1 {

    private long difference;
    private final ListsOfNumbers numbers;

    public Day1() {
        numbers = new ListsOfNumbers();
        difference = 0;
    }

    public void loadInput(boolean full) {
        try {
            Scanner scanner = null;

            if (full) {
                scanner = new Scanner(new File("input.full.txt"));
            }
            else {
                scanner = new Scanner(new File("input.test.txt"));
            }
            while (scanner.hasNextLine()) {

                String line = scanner.nextLine();
                //System.out.println(line);

                numbers.addLeft(Integer.parseInt(line.substring(0,5)));
                numbers.addRight(parseInt(line.substring(8,13)));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void calculateDifference() {
        difference = numbers.diff();
    }

    public long getDifference() {
        return difference;
    }

    public long calculateSimilarity() {
        return numbers.similarity();
    }
}