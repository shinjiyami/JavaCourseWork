public class BasicJavaTest {
    public static void main(String[] args){
        BasicJava algo = new BasicJava();
        // System.out.println(algo.countFromOne(255)); // prints all numbers 1 - 255
        // System.out.println(algo.countOddsFromOne(255)); // prints all odd numbers 1 -255
        // System.out.println(algo.countSumFromZed(255));
        int[] array = {1,3,5,7,9,13};
        System.out.println(algo.iterateArray(array));
    }
}