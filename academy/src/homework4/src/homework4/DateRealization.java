package homework4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class DateRealization {

    private Pattern pattern;
    private LocalDate localDate;
    private DateTimeFormatter formatter;
    private String format = "dd-mm-yyyy";
    private String date;

    private Year y;
    private Month m;
    private Day d;


    public DateRealization() {
        super();
        y = new Year(0);
        m = new Month(1);
        d = new Day(1);
    }

    ////////////////////////////////////////////////////
    public DateRealization(String date) {
        super();
        pattern = Pattern.compile("(0[1-9]|[12][0-9]|3[01])([\\-])(0[1-9]|1[012])([\\-])(19\\d\\d|20\\d\\d)");
        formatter = DateTimeFormatter.ofPattern(format);
        if (validator(date)) {
            this.date = date;
            String ymd[] = date.split("-");
            y = new Year(Integer.parseInt(ymd[2]));
            m = new Month(Integer.parseInt(ymd[1]));
            d = new Day(Integer.parseInt(ymd[0]));
        } else {
            System.out.println("Введена неверная дата");
        }
    }

    ////////////////////////////////////////////////////
    private boolean validator(String date) {
        Matcher matcher = pattern.matcher(date);
        if (matcher.matches()) {
            if ((Integer.parseInt(matcher.group(1)) == 31 && (Integer.parseInt(matcher.group(3))) == 4)
                    || (Integer.parseInt(matcher.group(1)) == 31 && (Integer.parseInt(matcher.group(3))) == 6)
                    || (Integer.parseInt(matcher.group(1)) == 31 && (Integer.parseInt(matcher.group(3))) == 9)
                    || (Integer.parseInt(matcher.group(1)) == 31 && (Integer.parseInt(matcher.group(3))) == 11)) {
                System.out.println("Введена неверная дата");
                return false;
            }

            if (leapYear(Integer.parseInt(matcher.group(5)))) {
                if (Integer.parseInt(matcher.group(3)) == 2 && Integer.parseInt(matcher.group(1)) > 29) {
                    System.out.println("Введена неверная дата");
                    return false;
                }
            } else if (Integer.parseInt(matcher.group(3)) == 2 && Integer.parseInt(matcher.group(1)) > 28) {
                System.out.println("Введена неверная дата");
                return false;
            }
        }

        return true;
    }


    public static boolean leapYear(int year) {
        if ((year % 400) == 0 || (year % 4 == 0 && (year % 100) != 0)) {
            return true;
        }
        return false;
    }

    public boolean leapYear() {
        if ((y.getYear() % 400) == 0 || (y.getYear() % 4 == 0 && (y.getYear() % 100) != 0)) {
            return true;
        }
        return false;
    }

    ////////////////////////////////////////////////////
    public void setDate(String date) {
        if (validator(date)) {
            this.date = date;
            String ymd[] = date.split("-");
            y.setYear(Integer.parseInt(ymd[2]));
            m.setMonth(Integer.parseInt(ymd[1]));
            d.setDay(Integer.parseInt(ymd[0]));
        } else {
            System.out.println("Введена неверная дата ");
        }
    }

    public int getDayOfWeek() {
        LocalDate dayOfWeek = LocalDate.of(y.getYear(), m.getMonth(), d.getDay());
        for (DayOfTheWeek day : DayOfTheWeek.values()) {
            if (dayOfWeek.getDayOfWeek().getValue() == day.getDayIndex()) {
                return day.getDayIndex();
            }
        }
        return 0;
    }

    ////////////////////////////////////////////////////
    public enum DayOfTheWeek {
        SUNDAY(1),
        MONDAY(2),
        TUESDAY(3),
        WEDNESDAY(4),
        THURSDAY(5),
        FRIDAY(6),
        SATURDAY(7);

        private int dayIndex;


        DayOfTheWeek(int dayIndex) {
            this.dayIndex = dayIndex;
        }

        public int getDayIndex() {
            return dayIndex;
        }

    }

    public static int difBtwDays(DateRealization date1, DateRealization date2) {
        if (date1.date.equals(date2.date)) {
            return 0;
        }
        int diffDate = 0;
        int minYear = date1.y.getYear();
        int maxYear = date2.y.getYear();
        if (date1.y.getYear() > date2.y.getYear()) {
            minYear = date2.y.getYear();
            maxYear = date1.y.getYear();
        }
        for (; minYear < maxYear; minYear++) {
            if (leapYear(minYear)) {
                diffDate += 366;
            } else {
                diffDate += 365;
            }
        }
        if (date1.getDayOfYear(date1) < date2.getDayOfYear(date2)) {
            return (diffDate + (date1.getDayOfYear(date1) - date2.getDayOfYear(date2))) * (-1);
        }
        return (diffDate + (date2.getDayOfYear(date2) - date1.getDayOfYear(date1))) * (-1);
    }

    ////////////////////////////////////////////////////
    private int getDayOfYear(DateRealization date) {
        int sumDays = 0;
        for (int i = 1; i < date.m.getMonth(); i++) {

            if (i == 4 || i == 6 || i == 9 || i == 11) {
                sumDays += 30;
                continue;
            }
            if (leapYear(date.y.getYear()) && i == 2) {
                sumDays += 29;
                continue;
            } else if (i == 2) {
                sumDays += 28;
                continue;
            }
            sumDays += 31;
        }
        sumDays += date.d.getDay();
        return sumDays;
    }


    ////////////////////////////////////////////////////
    public String getDate() {
        return date;
    }

    public class Year {
        private int year;

        public Year(int year) {
            this.year = year;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }
    }

    public class Month {
        private int month;

        public Month(int month) {
            this.month = month;
        }

        public int getMonth() {
            return month;
        }

        public void setMonth(int month) {
            this.month = month;
        }
    }

    public class Day {
        private int day;

        public Day(int day) {
            this.day = day;
        }

        public int getDay() {
            return day;
        }

        public void setDay(int day) {
            this.day = day;
        }
    }

    ////////////////////////////////////////////////////

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DateRealization that = (DateRealization) o;
        return Objects.equals(date, that.date) &&
                Objects.equals(y, that.y) &&
                Objects.equals(m, that.m) &&
                Objects.equals(d, that.d);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, y, m, d);
    }
}
