public class ProjectTest {
    public static void main(String[] args) {
        Project poker = new Project("Poker", "a game of chance");
        poker.setCost(1.99);
        System.out.println(poker.getCost());
        System.out.println(poker.getName());
        System.out.println(poker.getDesc());
        System.out.println(poker.elevatorPitch());
    }
}