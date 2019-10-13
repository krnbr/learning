package in.n2w.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import javax.persistence.*;

import java.util.HashSet;
import java.util.Set;

import static in.n2w.entities.State.ENTITY_NAME;
import static in.n2w.entities.State.TABLE_NAME;

/**
 * Created by Karanbir Singh on 10/13/2019.
 **/
@Table(name = ENTITY_NAME)
@Entity(name = TABLE_NAME)
@ToString
public class State {

    private static final String STATE = "state";
    public static final String ENTITY_NAME = STATE;
    public static final String TABLE_NAME = STATE;

    @Id
    @Getter
    @Setter
    @Accessors(chain = true)
    @Column(name = "id", updatable = false, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Setter
    @Getter
    @Accessors(chain = true)
    private String name;

    @Getter
    @Setter
    @Accessors(chain = true)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "country_id")
    private Country country;

    @Setter
    @Getter
    @Accessors(chain = true)
    @OneToMany(mappedBy = "state", fetch = FetchType.LAZY)
    private Set<City> cities = new HashSet<>();

}
