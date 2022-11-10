import org.example.Robot;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Good Morning");

        Robot robot_one = new Robot();
        System.out.println(robot_one.name);
        robot_one.Attack();
    }


}