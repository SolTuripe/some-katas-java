package morekatas.morekatas.HappyBirthday;

public class Wrapper {

    public static double wrap(double height, double width, double length) throws Exception {
        double result;

        if(height <= 0 || width <= 0 || length <= 0) {
            throw new Exception("some side isn't greater then zero");
        }

        result = (height >= width)?
                (width >= length)?
                        (height*2+width*2+length*4+20):
                        (height*2+length*2+width*4+20):
                (height >= length)?
                        (height*2+width*2+length*4+20):
                        (width*2+length*2+height*4+20);

        return result;
    }
}
