import java.util.Scanner;

public class TaskManager {

    static int id;

    public static Task addTask () {


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the name of the task: ");
        String name = input.nextLine();
        System.out.println("Please enter the description of the task: ");
        String description = input.nextLine();
        id++;

        Task task = new Task(id, name, description, Status.OPEN);

        return task;

    }

}
