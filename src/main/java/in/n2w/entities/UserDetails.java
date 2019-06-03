package in.n2w.entities;

import in.n2w.entities.enums.Gender;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.time.LocalDateTime;

import static in.n2w.entities.UserDetails.ENTITY_NAME;
import static in.n2w.entities.UserDetails.TABLE_NAME;

/**
 * Created by Karanbir Singh on 6/3/2019.
 **/
@Entity(name = ENTITY_NAME)
@Table(name = TABLE_NAME)
@ToString
public class UserDetails {

    private static final String USERDETAILS = "USER_DETAILS";
    public static final String ENTITY_NAME = USERDETAILS;
    public static final String TABLE_NAME = USERDETAILS;

    @Id
    @Getter
    @Setter
    @Accessors(chain = true)
    @Column(name = "USER_DETAILS_ID", updatable = false, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userDetailsId;

    @Setter
    @Getter
    @Accessors(chain = true)
    @Column(name = "DOB")
    private LocalDateTime dob;

    @Setter
    @Getter
    @Accessors(chain = true)
    @OneToOne
    @JoinColumn(name = "USER_ID")
    //@MapsId
    private User user;

    @Setter
    @Getter
    @Accessors(chain = true)
    @Enumerated(EnumType.STRING)
    private Gender gender;


}
