public class FizzBuzz {
    public String getFizzBuzz(int val) {
        if(val % 3 == 0 & val % 5 == 0) {
            String answer = "FizzBuzz";
            return answer;
        }
        else if (val % 3 == 0) {
            String answer = "Fizz";
            return answer;
        }
        else if (val % 5 == 0) {
            String answer = "Buzz";
            return answer;
        }
        else {
            return "?";
        }
    }
}