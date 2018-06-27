package pl.nowosielski.weatherinfo.models.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table(name = "app")
@Entity
public class ApplicationPropertiesEntity {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String value;
    private String comment;
}
