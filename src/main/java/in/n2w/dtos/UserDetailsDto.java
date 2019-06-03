package in.n2w.dtos;

import in.n2w.entities.enums.Gender;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

/**
 * Created by Karanbir Singh on 6/3/2019.
 **/
public class UserDetailsDto {

    @Getter
    @Setter
    @Accessors(chain = true)
    private long id;

    @Setter
    @Getter
    @Accessors(chain = true)
    private LocalDateTime dob;

    @Getter
    @Setter
    @Accessors(chain = true)
    private UserDto userDto;

    @Getter
    @Setter
    @Accessors(chain = true)
    private Gender gender;

}
