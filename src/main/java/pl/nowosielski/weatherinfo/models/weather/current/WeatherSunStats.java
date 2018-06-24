package pl.nowosielski.weatherinfo.models.weather.current;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class WeatherSunStats {

    @JsonProperty("sunrise")
    private long sunriseInSeconds;

    @JsonProperty("sunset")
    private long sunsetInSeconds;

    @JsonProperty("country")
    private String country;
}
