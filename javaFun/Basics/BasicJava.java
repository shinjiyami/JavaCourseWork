import java.util.Arrays;
import java.util.ArrayList;
public class BasicJava {
    public String countFromOne(int end) {
        System.out.println("starting");
        for(int i = 1; i <= end; i++) {
            System.out.println(i);
        }
        return "complete";
    }
    public String countOddsFromOne(int end){
        System.out.println("starting");
        for(int i = 1; i <= end; i++) {
            if( i % 2 == 1) {
                System.out.println(i);
            }
        }
        return "complete";
    }
    public String countSumFromZed(int end) {
        int sum = 0;
        for(int i = 0; i <= end; i++) {
            sum = sum + i;
            String num = String.format("New Number: " + i + " sum: " + sum);
            System.out.println(num);
        }
        return "complete";
    }
    public String iterateArray(int[] input){
        for(int item : input) {
            System.out.println(item);
        }
        return "complete";
    }
    public int findMax(int[] input) {
        int max = input[0];
        for (int item : input) {
            if (item > max) {
                max = item;
            }
        }
        return max;
    }
    public float getAverage(int[] input) {
        float sum = 0;
        for (int item : input) {
            sum = sum + item;
        }
        float average = sum / input.length;
        return average;
    }
    public ArrayList<Integer> getOddArray(int end) {
        ArrayList<Integer> y = new ArrayList<Integer>();
        for (int i=1; i <= end; i++) {
            if (i % 2 == 1) {
                y.add(i);
            }
        }
        return y;
    }
    public int greaterThanY(int[] array, int value) {
        int count = 0;
        for(int item : array) {
            if (item > value) {
                count++;
            }
        }
        return count;
    }
    public int[] squareValues(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (array[i] * array[i]);
        }
        System.out.println(Arrays.toString(array));
        return array;
    }
    public int[] getNoNegative(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
        return array;
    }
}