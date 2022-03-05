package model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.Embeddable;

@Data
@Embeddable // tą klasę można osadzać w encjach, ale sama encją nie jest
public class Coordinate {
    private double lon;
    private double lat;
}
