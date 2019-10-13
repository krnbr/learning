package in.n2w.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import javax.persistence.*;

import static in.n2w.entities.City.ENTITY_NAME;
import static in.n2w.entities.City.TABLE_NAME;

/**
 * Created by Karanbir Singh on 10/13/2019.
 **/
@Table(name = ENTITY_NAME)
@Entity(name = TABLE_NAME)
@ToString
public class City {

    private static final String CITY = "city";
    public static final String ENTITY_NAME = CITY;
    public static final String TABLE_NAME = CITY;

    @Id
    @Getter
    @Setter
    @Accessors(chain = true)
    @Column(name = "id", updatable = false, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Getter
    @Setter
    @Accessors(chain = true)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "state_id")
    private State state;

    @Setter
    @Getter
    @Accessors(chain = true)
    private String name;

    @Setter
    @Getter
    @Accessors(chain = true)
    @Column(name = "centralized_postal_code")
    private String centralizedPostalCode;

}
