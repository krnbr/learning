package in.n2w.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

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
    @Column(name = "USER_ID")
    @Getter
    @Setter
    @Accessors(chain = true)
    private long userId;

    @Setter
    @Getter
    @Accessors(chain = true)
    private String firstName;

    @Setter
    @Getter
    @Accessors(chain = true)
    private String lastName;

}
