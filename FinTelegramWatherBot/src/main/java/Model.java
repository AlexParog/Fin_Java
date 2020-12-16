public class Model {

    private String name;
    private Double temp;
    private Double humidity;
    private String time;
    private String date;
    private String main;


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setHumidity(Double humidity) {
        this.humidity = humidity;
    }

    public Double getHumidity() {
        return humidity;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTime() {
        return time;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public String getMain() {
        return main;
    }

    public void setTemp(Double temp) {
        this.temp = temp;
    }

    public Double getTemp() {
        return temp;
    }
}
