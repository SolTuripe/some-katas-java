package morekatas.morekatas.FizzBuzzKata;

public class FizzBuzz {

    public String convert(int i) {
        StringBuffer sb = new StringBuffer();

        if (i % 3 == 0) {
            sb.append("Fizz");
        }
        if (i % 5 == 0) {
            sb.append("Buzz");
        }
        return sb.toString();
    }
}
