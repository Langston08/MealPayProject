import java.util.*;

public class Manager {
    //fields
    ArrayList<Student> students;

    public Manager(){
        students = new ArrayList<Student>();
    }

    public String transactionsByDay(int month, int day){
        String s = "";
        for(Student st : students){
            ArrayList<Transaction> tByDay = st.getTransactionsByDate(month, day);
            if(tByDay != null){
                s += tByDay.toString() + " by: " + st.getName() + " ID: " + st.getID();
                s += "\n";
            }
        }
        return s;
    }

    public void logMeal(int month, int day, int id){
        //loop through all students and find matching id
    }
}
