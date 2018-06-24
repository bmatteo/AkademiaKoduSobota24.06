package pl.nowosielski.weatherinfo.models.weather.current;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class WeatherCloudsStats {

    @JsonProperty("all")
    private double percentageCloudiness;
}
