package chapter9Classes;

/**
 * Created by jjenkins on 11/14/2016.
 */
public class WeatherForecast {
    private String skies = "";
    private int high;
    private int low;

    public String getSkies() {
        return skies;
    }

    public void setSkies(String skies) {
        this.skies = skies;
    }

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    public int getLow() {
        return low;
    }

    public void setLow(int low) {
        this.low = low;
    }
}
