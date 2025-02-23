import java.util.*;

public class Tester {
    public static void main(String[] args) {
        Manager manager = new Manager();

        // add some students
        manager.addStudent(new Student("Langston"));
        manager.addStudent(new Student("Lennon"));
        manager.addStudent(new Student("Iris"));
        manager.addStudent(new Student("Kelly"));

        // log meals and transactions
        manager.logMeal(2, 4, 1);  // Langston eats
        manager.logMeal(2, 6, 1);  // Langston eats again
        manager.getStudentById(2).addTransaction(2, 4, 40);  // Lennon adds money
        manager.logMeal(2, 5, 2);  // Lennon eats
        manager.logMeal(2, 4, 3);  // Iris eats a lot
        manager.logMeal(2, 4, 3);
        manager.logMeal(2, 4, 3);
        manager.logMeal(2, 4, 3);
        manager.logMeal(2, 4, 3);
        manager.logMeal(2, 4, 3);
        manager.logMeal(2, 4, 3);
        manager.logMeal(2, 8, 3);  // Iris eats more
        manager.logMeal(2, 8, 3);

        // show all students
        System.out.println("Displaying students...");
        manager.displayAllStudents();

        // show negative balances
        System.out.println("Displaying students with negative balances...");
        manager.displayNegativeBalanceStudents();

        // look up student by ID
        System.out.println("Looking up student with ID 2:");
        Student student = manager.getStudentById(2);
        if (student != null) {
            student.displayInfo();
        } else {
            System.out.println("Student not found.");
        }

        // transactions on 2/4
        System.out.println("Displaying all transactions on 2/4...");
        System.out.println(manager.transactionsByDay(2, 4));
    }
}

//note to self, i think this one is done