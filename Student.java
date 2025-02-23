import java.util.*;

public class Student {
    // fields
    private String name;
    private int id;
    private double balance;
    private static int idGen = 1;  // auto-generate student ID
    private ArrayList<Transaction> transactions;

    //okay i got all the fields done note to self

    // constructor
    public Student(String myName) {
        name = myName;
        balance = 0;
        id = idGen;
        idGen++;
        transactions = new ArrayList<Transaction>();
    }

    // charge lunch, reduce balance and log the transaction
    public void chargeLunch(int month, int day) {
        balance -= 7;  // each lunch costs $7
        Transaction t = new Transaction(month, day, -7);
        transactions.add(t);
    }

    // add a transaction (used for adding funds)
    public void addTransaction(int month, int day, double amount) {
        balance += amount;  // update the balance with the transaction amount
        Transaction t = new Transaction(month, day, amount);
        transactions.add(t);
    }

    // get all transactions for a specific date
    public ArrayList<Transaction> getTransactionsByDate(int month, int day) {
        ArrayList<Transaction> givenDay = new ArrayList<Transaction>();

        for (Transaction t : transactions) {
            if (month == t.getMonth() && day == t.getDay()) {
                givenDay.add(t);
            }
        }

        return givenDay.isEmpty() ? null : givenDay;
    }

    // display student info
    public void displayInfo() {
        System.out.print("Student: " + name + " ID: " + id + " Balance: $" + balance + " Transactions: ");
        if (transactions.isEmpty()) {
            System.out.println("None");
        } else {
            for (Transaction t : transactions) {
                System.out.print("(" + t.getMonth() + "/" + t.getDay() + ", $" + t.getAmount() + ") ");
            }
        }
        System.out.println();
    }

    // getters for id and balance
    public int getID() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }
}
