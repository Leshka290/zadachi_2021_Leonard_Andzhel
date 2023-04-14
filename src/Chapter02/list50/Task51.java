package Chapter02.list50;

/*
Написание немутируемого класса с помощью шаблона строителя.
Написать программу, представляющую имплементацию шаблона строителя в нему-
тируемом классе.
 */
public class Task51 {

    public static final class User {
        private String firstName;
        private String lastName;
        private String email;
        private final String login;
        private final String password;

        private User(UserBuilder userBuilder) {
            this.firstName = userBuilder.firstName;
            this.lastName = userBuilder.lastName;
            this.email = userBuilder.email;
            this.login = userBuilder.login;
            this.password = userBuilder.password;
        }

        public UserBuilder getUserBuilder(String log, String pas){
            return new UserBuilder(log, pas);
        }

    }

   public static final class UserBuilder {
        private String firstName;
        private String lastName;
        private String email;
        private final String login;
        private final String password;

       public UserBuilder(String log, String pas) {
            this.login = log;
            this.password = pas;
        }
        public UserBuilder firstName(String firstName) {
           this.firstName = firstName;
           return this;
        }
        public UserBuilder lastName(String lastName) {
           this.lastName = lastName;
           return this;
        }
        public UserBuilder email(String email) {
           this.email = email;
           return this;
        }

       public User build() {
           return new User(this);
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public String getEmail() {
            return email;
        }

        public String getLogin() {
            return login;
        }

        public String getPassword() {
            return password;
        }
    }
}
