import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Day1 {

    private long difference;
    private ListsOfNumbers part1List;

    public Day1() {
        part1List = new ListsOfNumbers();
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

                part1List.addLeft(Integer.valueOf(line.substring(0,5)));
                part1List.addRight(Integer.valueOf(line.substring(8,13)));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void calculateDifference() {
        difference = part1List.diff();
    }

    public long getDifference() {
        return difference;
    }
}