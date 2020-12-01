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
}