package morekatas.morekatas.HappyBirthday;

import java.util.Arrays;

public class Wrapper {

    public static Integer wrap(Integer height, Integer width, Integer length) throws Exception {

        if(height <= 0 || width <= 0 || length <= 0) {
            throw new Exception("some side isn't greater then zero");
        }

        Integer Array[] = {height, width, length};
        Arrays.sort(Array);
        System.out.println(Arrays.asList(Array));
        return 4 * Array[0] + 2 *(Array[1] + Array[2]) + 20;
    }
}


