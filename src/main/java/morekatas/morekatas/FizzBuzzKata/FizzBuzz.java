package morekatas.morekatas.FizzBuzzKata;

public class FizzBuzz {

    public String convert(int i) {
        //StringBuffer sb = new StringBuffer();

        if (i % 3 == 0 && i % 5 == 0) {
            return "FizzBuzz";
        }

        if (i % 3 == 0) {
            return "Fizz";
        }
        if (i % 5 == 0) {
            return "Buzz";
        }
        return Integer.toString(i);
    }
}
