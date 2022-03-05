package model;

// openweathermap.org/current

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

// model opisujący pobierane dane

//@Data ta adnotacja nie powinna być prze encjach, zamiasr niej powinno być equals i hashcode
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true) // wygyneruj tylko dla zaznaczonych przeze mnie pól

@Entity
public class CurrentWeather {
    @Embedded
    private Coordinate coord;
    @Embedded
    private Clouds clouds;
    @Embedded
    private Main main;
    @Embedded
    private Sys sys;
    @Embedded
    private Wind wind;
    transient //wykluczenie pola poniżej
    private List<Weather> weather; // lista będzie nullem
    private String base;
    private int visibility;
    private long dt;
    private int timezone;
    @Id
    @Column(insertable = false)
    @EqualsAndHashCode.Include // to wliczam do liczenia
    private long id;
    private String name;
    private int cod;
}