public class PuzzleJavaTest {
    public static void main(String[] args) {
        PuzzleJava puzzle = new PuzzleJava();
        int[] testArray = {3,5,1,2,7,9,8,13,25,32};
        System.out.println(puzzle.greaterArray(testArray));
        String[] testArray2 = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
        System.out.println(puzzle.randomNameArray(testArray2));
    }
}