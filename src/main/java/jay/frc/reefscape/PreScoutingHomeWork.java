package jay.frc.reefscape;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.stream.JsonReader;
import jay.frc.util.MathUtil;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class PreScoutingHomeWork {

    static final String defaultFile = "test.json";

    public static String buildStringFromFile(InputStream is) throws IOException {
        InputStreamReader reader = new InputStreamReader(is);
        int c;
        StringBuilder builder = new StringBuilder();
        while((c = reader.read()) != -1) {
            builder.append((char)c);
        }
        return builder.toString();
    }

    public static void main(String args[]) throws Exception {
        try {
            String path;
            path = args.length < 2 ? defaultFile : args[0];
            String built = buildStringFromFile(Files.newInputStream(Paths.get(path)));
            ScoringInfo info = new Gson().fromJson(built, ScoringInfo.class);
            System.out.println("l1 average:"+ MathUtil.average(info.l1));
            System.out.println("l2 average:"+MathUtil.average(info.l2));
            System.out.println("l3 average:"+MathUtil.average(info.l3));
            System.out.println("l4 average:"+MathUtil.average(info.l4));
            System.out.println("net average:"+MathUtil.average(info.net));
            System.out.println("processor average:"+MathUtil.average(info.processor));
        } catch (Exception e) {
            throw e;
        }
    }

}
