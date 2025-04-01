package jay.frc.util;

public class Util {


    public static void requireNonNull(Object ... objects) {
        for(int i = 0; i < objects.length; i++)
            if(objects[i] == null) throw new RuntimeException("REQUIRE NOT NULL");
    }
}
