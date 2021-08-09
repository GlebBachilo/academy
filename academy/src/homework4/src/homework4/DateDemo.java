package homework4;

public class DateDemo {
    public static void main(String[] args) {
        DateRealization date2 = new DateRealization("8-07-2007");
        DateRealization date1 = new DateRealization("23-04-2008");


        System.out.println(DateRealization.difBtwDays(date1, date2));
        System.out.println(DateRealization.leapYear(2011));
        System.out.println(date1.leapYear());
        System.out.println(date2.getDayOfWeek());
    }
}
