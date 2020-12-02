import java.util.ArrayList;
import java.util.Arrays;
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
    public String shuffleAlpha() {
        ArrayList<String> alpha = new ArrayList<String>(Arrays.asList("a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"));
        Collections.shuffle(alpha);
        System.out.println(alpha.get(25));
        if (alpha.get(0) == "a" || alpha.get(0) == "e" || alpha.get(0) == "i" || alpha.get(0) == "o" || alpha.get(0) == "u") {
            System.out.println("your vowel is " + alpha.get(0));
        }
        else {
            System.out.println(alpha.get(0));
        }
        return "complete";
    }
    public int[] randomArray() {
        int[] newArray;
        newArray = new int[10];
        Random randomIndex = new Random();
        for (int i = 0; i <=9; i++) {
            newArray[i] = randomIndex.nextInt((100-55)+1)+55;
        }
        System.out.println(Arrays.toString(newArray));
        return newArray;
    }
    public ArrayList<Integer> randomArraySort() {
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        Random randomIndex = new Random();
        for (int i = 0; i <=9; i++) {
            newArray.add(randomIndex.nextInt((100-55)+1)+55);
        }
        Collections.sort(newArray);
        // System.out.println(Arrays.toString(newArray));
        System.out.println(newArray.get(0));
        System.out.println(newArray.get(9));
        return newArray;
    }
}