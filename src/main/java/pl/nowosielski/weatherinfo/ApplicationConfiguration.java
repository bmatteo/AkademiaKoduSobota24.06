package pl.nowosielski.weatherinfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import pl.nowosielski.weatherinfo.models.ApplicationPropertiesBean;
import pl.nowosielski.weatherinfo.models.entities.ApplicationPropertiesEntity;
import pl.nowosielski.weatherinfo.models.repository.ApplicationPropertiesRepository;
import pl.nowosielski.weatherinfo.models.services.ApplicationPropertiesService;

import java.util.Optional;

@Configuration
@EnableAutoConfiguration
@ComponentScan("pl.nowosielski")
public class ApplicationConfiguration {

    @Bean(name = "appPropertiesBean")
    @Autowired
    public ApplicationPropertiesBean getApplicationPropertiesBean(ApplicationPropertiesService prop_service) {
        ApplicationPropertiesBean applicationPropertiesBean = new ApplicationPropertiesBean();
        applicationPropertiesBean.setApplicationPropertiesService(prop_service);
        applicationPropertiesBean.loadProperties();
        return applicationPropertiesBean;
    }
}
