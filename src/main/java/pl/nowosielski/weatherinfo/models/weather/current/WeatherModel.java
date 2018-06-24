package pl.nowosielski.weatherinfo.models.weather.current;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class WeatherModel {

    @JsonProperty("main")
    private WeatherMainStats mainStats;

    @JsonProperty("clouds")
    private WeatherCloudsStats cloudsStats;

    @JsonProperty("sys")
    private WeatherSunStats sunStats;

    @JsonProperty("name")
    private String cityName;
}
