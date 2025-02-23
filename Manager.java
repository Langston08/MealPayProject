import java.util.*;

public class Manager {
    // list of students
    ArrayList<Student> students;

    // set up students list
    public Manager() {
        students = new ArrayList<Student>();
    }

    // add a student
    public void addStudent(Student student) {
        students.add(student);
    }

    // log a meal for a student by id
    public void logMeal(int month, int day, int id) {
        for (Student st : students) {
            if (st.getID() == id) {
                st.addTransaction(month, day, -7.0);
                break;
            }
        }
    }

    // get transactions for a specific day
    public String transactionsByDay(int month, int day) {
        String result = "";
        for (Student st : students) {
            ArrayList<Transaction> transactions = st.getTransactionsByDate(month, day);
            if (transactions != null && !transactions.isEmpty()) {
                for (Transaction t : transactions) {
                    result += "(" + t.getMonth() + "/" + t.getDay() + ", $" + t.getAmount() + ") by: " + st.getName() + " ID: " + st.getID() + "\n";
                }
            }
        }
        return result;
    }

    // display all students
    public void displayAllStudents() {
        for (Student st : students) {
            st.displayInfo();
        }
    }

    // display students with negative balances
    public void displayNegativeBalanceStudents() {
        for (Student st : students) {
            if (st.getBalance() < 0) {
                st.displayInfo();
            }
        }
    }

    // get student by id
    public Student getStudentById(int id) {
        for (Student st : students) {
            if (st.getID() == id) {
                return st;
            }
        }
        return null;
    }
}
