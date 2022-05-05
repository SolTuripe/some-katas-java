package morekatas.morekatas.LeapYearKata;

public class LeapYear {

    private int year;

    public LeapYear(int year) {
        this.year = year;
    }

    public boolean check(){
        if (year % 4 == 0) {
            return true;
        }
        return false;
    }
}
