package pl.nowosielski.weatherinfo.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import pl.nowosielski.weatherinfo.models.services.ApplicationPropertiesService;

import java.util.HashMap;
import java.util.Map;

public class ApplicationPropertiesBean {

    public final String API_KEY = "openweathermap.api_key";
    public final String API_URL = "api_url";

    @Autowired
    ApplicationPropertiesService applicationPropertiesService;

    public void setApplicationPropertiesService(ApplicationPropertiesService applicationPropertiesService) {
        this.applicationPropertiesService = applicationPropertiesService;
    }

    final public Map<String,String > properties = new HashMap<>();

    public void loadProperties() {
        applicationPropertiesService.loadProperties().forEach(s -> properties.put(s.getName(), s.getValue()));
    }
}
