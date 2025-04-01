package jay.frc.util;

import java.util.List;

public class MathUtil {

    public MathUtil() {
        throw new RuntimeException("unable to create new util class");
    }

    public static double average(int buffer[]) {
        double sum = 0;
        for(int i = 0; i < buffer.length; i++)
            sum += buffer[i];
        return sum / buffer.length;
    }

    public static double average(double buffer[]) {
        double sum = 0;
        for(int i = 0; i < buffer.length; i++)
            sum += buffer[i];
        return sum / buffer.length;
    }

    public static double average(List<Integer> buffer) {
        double sum = 0;
        for(int i = 0; i < buffer.size(); i++)
            sum += buffer.get(i);
        return sum / buffer.size();
    }



}
