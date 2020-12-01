public class StringManipulator {
    public String trimAndConcat(String string1, String string2) {
        String trimmed1 = string1.trim();
        String result = trimmed1.concat(string2.trim());
        return result;
    }
    public Integer getIndexOrNull(String string1, char input){
        if(string1.indexOf(input) >= 0) {
            return string1.indexOf(input);
        }
        else {
            return null;
        }
    }
    public Integer getIndexOrNull(String string1, String input) {
        if(string1.indexOf(input) >= 0) {
            return string1.indexOf(input);
        }
        else {
            return null;
        }
    }
    public String concatSubstring(String string1, int int1, int int2, String string2) {
        String substring = string1.substring(int1, int2);
        String result = substring.concat(string2);
        return result;
    }
}