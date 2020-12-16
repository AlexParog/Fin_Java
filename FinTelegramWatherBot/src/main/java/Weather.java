import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Weather {

    // 7103ee5799ac933a46d49fdf63edeea6
    public static String getWeather(String message, Model model) throws IOException {
        URL url = new URL("https://api.openweathermap.org/data/2.5/weather?q=" + message +
                "&units=metric&appid=7103ee5799ac933a46d49fdf63edeea6");

        Scanner scanner = new Scanner((InputStream) url.getContent());
        String result = "";
        while (scanner.hasNext()) {
            result += scanner.nextLine();
        }


        JSONObject object = new JSONObject(result);
        model.setName(object.getString("name"));

        JSONObject main = object.getJSONObject("main");
        model.setTemp(main.getDouble("temp"));
        model.setHumidity(main.getDouble("humidity"));

        JSONArray getArray = object.getJSONArray("weather");
        for (int i = 0; i < getArray.length(); i++) {
            JSONObject obj = getArray.getJSONObject(i);
            model.setMain((String) obj.get("main"));
        }

        return "Город: " + model.getName() + "\n" +
                "Температура: " + model.getTemp() + "\n" +
                "Погода: " + model.getMain() + "\n" +
                "Влажность: " + model.getHumidity();
    }

//    public static HashMap<String, ArrayList<String>> getDayWeather(String message, Model model) throws IOException {
//        URL url = new URL("https://api.openweathermap.org/data/2.5/forecast?q=" + message +
//                "appid=7103ee5799ac933a46d49fdf63edeea6");
//        HashMap<String, ArrayList<String>> info = new HashMap<String, ArrayList<String>>();
//        Scanner scanner = new Scanner((InputStream) url.getContent());
//        String result = "";
//        while (scanner.hasNext()) {
//            result += scanner.nextLine();
//        }
//
//        JSONObject object = new JSONObject(result);
//        JSONArray hours = (JSONArray) object.get("list");
//        for (int i = 0; i < 8; i++) {
//            JSONObject el = hours.getJSONObject(i);
//            String time = el.getString("dt_txt").split(" ")[1].split(":")[0] + ":" +
//                    el.getString("dt_txt").split(" ")[1].split(":")[1];
//            String date = el.getString("dt_txt").split(" ")[0].split("-")[2] + "-" +
//                    el.getString("dt_txt").split(" ")[0].split("-")[1];
//            String temp = new JSONObject(el.get("main").toString()).get("temp").toString();
//            String humidity = new JSONObject(el.get("main").toString()).get("humidity").toString();
//            String weather = new JSONObject(el.get("weather").toString()
//                    .replace("[", "").replace("]", "")).get("description").toString();
//            String wSpeed = new JSONObject(el.get("wind").toString()).get("speed").toString();
//            ArrayList<String> for_info = new ArrayList<String>();
//            for_info.add(date);
//            for_info.add(time);
//            for_info.add(weather);
//            for_info.add(temp);
//            for_info.add(humidity);
//            info.put(Integer.toString(i), for_info);
//        }
//        return info;
//    }
}
