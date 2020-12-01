public class StringManipulatorTest {
    public static void main(String[] args) {
        StringManipulator manipulator = new StringManipulator();
        System.out.println(manipulator.trimAndConcat("    hello    ","    World    "));
        System.out.println(manipulator.getIndexOrNull("hello", 'l'));
        System.out.println(manipulator.getIndexOrNull("hello", 'a'));
        System.out.println(manipulator.getIndexOrNull("hello", "llo"));
        System.out.println(manipulator.getIndexOrNull("world", "llo"));
        System.out.println(manipulator.concatSubstring("Hello", 1, 2, "world"));
    }
}