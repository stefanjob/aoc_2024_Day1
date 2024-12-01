public class Part2 extends Day1 {
        
    public Part2() {
    }
    public static void main(String[] args) {
        System.out.println("AOC Day 1 Part 1");

        boolean loadFull = true;

        Part2 part2 = new Part2();
        part2.loadInput(loadFull);
        part2.calculateSimilarity();

        System.out.println("Similarity is " + part2.calculateSimilarity());
    }
}