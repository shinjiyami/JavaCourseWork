import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
public class PuzzleJava {
    public ArrayList<Integer> greaterArray(int[] array) {
        int sum = 0;
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        for(int item : array) {
            if(item > 10) {
                newArray.add(item);
                sum = sum + item;
                System.out.println(sum);
            }
            else {
                sum = sum + item;
                System.out.println(sum);
            }
        }
        return newArray;
    }
    public ArrayList<String> randomNameArray(String[] array){
        ArrayList<String> newArray = new ArrayList<String>();
        Random randomIndex = new Random();
        String randomName = array[randomIndex.nextInt(array.length)];
        System.out.println(randomName);
        for(String item : array) {
            if (item.length() > 5) {
                newArray.add(item);
            }
        }
        return newArray;
    }
}