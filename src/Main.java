
//===== TASK MANAGER =====
//1. Aufgabe hinzufügen
//2. Alle Aufgaben anzeigen
//3. Aufgabe als erledigt markieren
//4. Aufgabe löschen
//5. Nach Aufgabe suchen
//0. Programm beenden

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        boolean running = true;


        ArrayList<Task> tasks = new ArrayList<Task>();

        Scanner input = new Scanner(System.in);

        while (running) {
            System.out.println("\n===== TASK MANAGER =====\n" +
                    "1. Aufgabe hinzufügen\n" +
                    "2. Alle Aufgaben anzeigen\n" +
                    "3. Aufgabe als erledigt markieren\n" +
                    "4. Aufgabe löschen\n" +
                    "5. Nach Aufgabe suchen\n" +
                    "0. Programm beenden");

            System.out.println("\nPlease choose an option:");
            int choice = input.nextInt();
            Iterator<Task> iterator = tasks.iterator();

            switch (choice) {
                case 1:
                    Task task = TaskManager.addTask();
                    tasks.add(task);
                    System.out.println("The task was successfully created.");
                    break;

                case 2:
                    System.out.println("Please enter the id of a task to see details:");
                    for(Task t : tasks) {
                        System.out.println("[" + t.getStatus() + "] " + t.getId() + " - " + t.getName());
                    }
                    int choice1 = input.nextInt();
                    for(Task t : tasks){
                        if (t.getId() == choice1) {
                            System.out.println(t);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Please enter the id of a task, you'd like to mark completed.");
                    System.out.println(tasks);
                    int choice2 = input.nextInt();
                    for(Task t : tasks){
                        if (t.getId() == choice2){
                            t.setStatus(Status.COMPLETED);
                        }
                    }
                    break;
                    case 4:
                        System.out.println("Please enter the id of a task, you'd like to delete");
                        System.out.println(tasks);
                        int choice3 = input.nextInt();
                       while(iterator.hasNext()){
                           Task t = iterator.next();
                            if (t.getId() == (choice3)) {
                                iterator.remove();
                            }
                        }
                            break;
                case 0:
                    running = false;
            }
        }


        System.out.println(tasks);
        }

    }
