package lesson9;

public class UserDemo {
    public static void main(String[] args) {
        User user1 = new User();
        user1.createQuery();
        User.Qerry q1 = new User.Qerry(user1);
        q1.printToLog();
        User.Qerry q2 = new User.Qerry(user1);
        q2.printToLog();


    }
}
