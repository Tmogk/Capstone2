package co.grandcircus;

import java.util.ArrayList;
import java.util.Scanner;

public class Week2Capstone {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);

		System.out.println("1. List tasks\n2. Add task\n3. Delete Task\n4. Mark Task Complete\n5. Quit");

		System.out.println("What would you like to do? Enter the number for your choice ");

		int userChoice = scnr.nextInt();

		ArrayList<Task> tasks = new ArrayList<>();

		do {

			if (userChoice == 2) {
				Task task = new Task();

				System.out.println("Please enter member name ");
				task.setMemberName(scnr.next());
				scnr.next();

				System.out.println("Please enter task description ");
				task.setDescription(scnr.next());
				scnr.next();

				System.out.println("Please enter the task due date ");
				task.setDueDate(scnr.next());
				scnr.next();

				System.out.println("Please enter the task completion status (complete/incomplete ");
				task.setDueDate(scnr.next());
				scnr.next();

				return;
			}

		} while (userChoice != 5);
		System.out.println(tasks);
	}

}
