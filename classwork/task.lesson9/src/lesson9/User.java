package lesson9;

public class User {
    private String login;
    private String password;

    static class Qerry {
        User u;

        public Qerry() {
            super();
        }

        public Qerry(User u) {
            this.u = u;
        }

        public void printToLog() {
            System.out.println("Пользователь " + u.login + "отправить запрос");
        }
    }

    public void createQuery() {
        Qerry q = new Qerry();
        q.printToLog();
    }
}
