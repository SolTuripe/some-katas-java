package morekatas.morekatas.LeapYearKata;

public class LeapYear {

    private int year;

    public LeapYear(int year) {
        this.year = year;
    }

    public boolean check() {
        int number = 400;
        return isDivisibleBy(4) && !((isDivisibleBy(100)) && (year % number != 0));
    }

    private boolean isDivisibleBy(int number) {
        return year % number == 0;
    }
}
