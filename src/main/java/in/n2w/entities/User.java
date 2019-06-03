package in.n2w.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import javax.persistence.*;

import static in.n2w.entities.User.ENTITY_NAME;
import static in.n2w.entities.User.TABLE_NAME;

/**
 * Created by Karanbir Singh on 5/31/2019.
 **/
@Table(name = ENTITY_NAME)
@Entity(name = TABLE_NAME)
@ToString
public class User {

    private static final String USER = "USER";
    public static final String ENTITY_NAME = USER;
    public static final String TABLE_NAME = USER;

    @Id
    @Getter
    @Setter
    @Accessors(chain = true)
    @Column(name = "USER_ID", updatable = false, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userId;

    @Setter
    @Getter
    @Accessors(chain = true)
    private String firstName;

    @Setter
    @Getter
    @Accessors(chain = true)
    private String lastName;

    @Setter
    @Getter
    @Accessors(chain = true)
    @OneToOne
    @JoinColumn(name = "USER_DETAILS_ID")
    private UserDetails userDetails;

}
