public class BasicJavaTest {
    public static void main(String[] args){
        BasicJava algo = new BasicJava();
        System.out.println(algo.countFromOne(255)); // prints all numbers 1 - 255
        System.out.println(algo.countOddsFromOne(255)); // prints all odd numbers 1 -255
        System.out.println(algo.countSumFromZed(255));
        int[] array = {1,3,5,9,13};
        System.out.println(algo.iterateArray(array));
        System.out.println(algo.findMax(array));
        System.out.println(algo.getAverage(array));
        System.out.println(algo.getOddArray(255));
        System.out.println(algo.greaterThanY(array, 6));
        System.out.println(algo.squareValues(array));
        int[] array = {1, 5, 10, -2};
        System.out.println(algo.getNoNegative(array));
    }
}