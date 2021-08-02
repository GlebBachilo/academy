package homework3;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Inputdata {


    LocalDate localDate;

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }


    Pattern pattern1 = Pattern.compile("(0[1-9]|[12][0-9]|3[01])[\\/](0[1-9]|1[012])[\\/](19\\d\\d|20\\d\\d)");
    Pattern pattern2 = Pattern.compile("(0[1-9]|[12][0-9]|3[01])[\\-](0[1-9]|1[012])[\\-](19\\d\\d|20\\d\\d)");


    public boolean inputdate(String input) {
        if (input.equals(null)) {
            System.out.println("Invalid value entered");
            return false;
        }
        if (input.charAt(2) == '/' && input.charAt(5) == '/') {
            Matcher matcher1 = pattern1.matcher(input);
            matcher1.find();

            DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate localDate = LocalDate.parse(input, formatter1);

            if (matcher1.matches()) {
                System.out.println("Day" + "<" + localDate.getDayOfMonth() + ">");
                System.out.println("Month" + "<" + localDate.getMonth() + ">");
                System.out.println("Year" + "<" + localDate.getYear() + ">");
                return true;
            }

        }
        if (input.charAt(2) == '-' && input.charAt(5) == '-') {
            Matcher matcher2 = pattern1.matcher(input);
            matcher2.find();

            DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDate localDate = LocalDate.parse(input, formatter2);

            if (matcher2.matches()) {
                System.out.println("Day" + "<" + localDate.getDayOfMonth() + ">");
                System.out.println("Month" + "<" + localDate.getMonth() + ">");
                System.out.println("Year" + "<" + localDate.getYear() + ">");
                return true;
            }
        }
        System.out.println("Invalid value entered");
        return false;
    }


}



