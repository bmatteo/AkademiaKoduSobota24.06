package pl.nowosielski.weatherinfo.models.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.nowosielski.weatherinfo.models.entities.ApplicationPropertiesEntity;

@Repository
public interface ApplicationPropertiesRepository extends CrudRepository<ApplicationPropertiesEntity, Integer>{

}
