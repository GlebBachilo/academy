package Task2;

import java.util.Objects;

public class User extends Person {
        public  String login;
        private String password;
        public  String email;

        public User(String firstName, String lastName, int age, String dateOfBirth,
                    String login, String password, String email) {
                super(firstName, lastName, age, dateOfBirth);
                this.login = login;
                this.password = password;
                this.email = email;
        }

        public User() {
                super();
        }

        public String getLogin() {
                return login;
        }

        public void setLogin(String login) {
                this.login = login;
        }

        public String getPassword() {
                return password;
        }

        public void setPassword(String password) {
                this.password = password;
        }

        public String getEmail() {
                return email;
        }

        public void setEmail(String email) {
                this.email = email;
        }

        public void printUserInfo(){
                System.out.println("Login: " + login);
                System.out.println("Password: " + password);
                System.out.println("Email: " + email);
        }

        @Override
        public boolean equals(Object o) {
                if (this == o)
                    return true;
                if (o == null || getClass() != o.getClass())
                    return false;
                if (!super.equals(o))
                    return false;
                User user = (User) o;
                return Objects.equals(login, user.login) &&
                        Objects.equals(password, user.password) &&
                        Objects.equals(email, user.email);
        }

        @Override
        public int hashCode() {
                return Objects.hash(super.hashCode(), login, password, email);
        }

        @Override
        public String toString() {
                final StringBuilder sb = new StringBuilder("User{");
                sb.append("login='").append(login).append('\'');
                sb.append(", password='").append(password).append('\'');
                sb.append(", email='").append(email).append('\'');
                sb.append('}');
                return sb.toString();
        }
}
