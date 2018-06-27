package pl.nowosielski.weatherinfo.models.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.nowosielski.weatherinfo.models.entities.ApplicationPropertiesEntity;
import pl.nowosielski.weatherinfo.models.repository.ApplicationPropertiesRepository;

import java.util.HashMap;
import java.util.Map;

@Service(value = "prop_service")
public class ApplicationPropertiesService {

    @Autowired
    ApplicationPropertiesRepository applicationPropertiesRepository;

    public Iterable<ApplicationPropertiesEntity> loadProperties() {
        return applicationPropertiesRepository.findAll();
    }
}
