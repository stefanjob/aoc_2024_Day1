
import static java.lang.Math.abs;
import java.util.ArrayList;
import java.util.Arrays;

public class ListsOfNumbers {
    private ArrayList<Integer> left;
    private ArrayList<Integer> right;

    public ListsOfNumbers() {
        this.left = new ArrayList<>(100);
        this.right = new ArrayList<>(100);
    }

    public void addLeft(int n) {
        left.add(n);
    }

    public void addRight(int n) {
        right.add(n);
    }

    public int diff() {
        int dif = 0;

        Object[] leftA = left.toArray();
        Object[] rightA = right.toArray();

        Arrays.sort(leftA);
        Arrays.sort(rightA);

        for (int i=0; i<left.size(); i++) {
            dif += abs((int)leftA[i] - (int)rightA[i]);
        }
        return dif;
    }
}