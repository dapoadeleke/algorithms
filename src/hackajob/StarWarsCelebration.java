package hackajob;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import com.google.gson.*;

public class StarWarsCelebration {

    public static void main(String[] args) {
        run("Luke%20Skywalker");
    }


    public static int run(String character) {
        StringBuilder result = new StringBuilder();
        try {
            URL url = new URL("https://challenges.hackajob.co/swapi/api/people/?search=" + character);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            while ((line = rd.readLine()) != null) {
                result.append(line);
            }
            rd.close();

//            JsonObject jsonObject = new JsonParser().parse(result.toString()).getAsJsonObject();
//            JsonElement d = jsonObject.getAsJsonArray("result").get(0);
//            JsonObject obj = d.getAsJsonObject();//.get("films");
//            JsonArray jArray = obj.getAsJsonArray("films");
//            return jArray.size();
        } catch (Exception e) {e.printStackTrace();}
        System.out.println(result);
        return 0;
    }

}
