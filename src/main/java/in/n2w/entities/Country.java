package in.n2w.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import javax.persistence.*;

import java.util.HashSet;
import java.util.Set;

import static in.n2w.entities.Country.ENTITY_NAME;
import static in.n2w.entities.Country.TABLE_NAME;

/**
 * Created by Karanbir Singh on 10/13/2019.
 **/
@Table(name = ENTITY_NAME)
@Entity(name = TABLE_NAME)
@ToString
public class Country {

    private static final String COUNTRY = "country";
    public static final String ENTITY_NAME = COUNTRY;
    public static final String TABLE_NAME = COUNTRY;

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
    private String name = "India";

    @Getter
    @Setter
    @Accessors(chain = true)
    @Column(name = "code", updatable = false, nullable = false)
    private String code = "IN";

    @Setter
    @Getter
    @Accessors(chain = true)
    @OneToMany(mappedBy = "country", fetch = FetchType.LAZY)
    private Set<State> states = new HashSet<>();

}
