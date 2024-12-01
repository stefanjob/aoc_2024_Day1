
public class Part1 extends Day1 {
        
    public Part1() {
    }
    public static void main(String[] args) {
        System.out.println("AOC Day 1 Part 1");

        boolean loadFull = true;

        Part1 part1 = new Part1();
        part1.loadInput(loadFull);
        part1.calculateDifference();

        System.out.println("Total Difference is " + part1.getDifference());
    }
}