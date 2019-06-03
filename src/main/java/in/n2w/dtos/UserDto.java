package in.n2w.dtos;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.function.Supplier;

import static net.andreinc.mockneat.unit.objects.Filler.filler;
import static net.andreinc.mockneat.unit.user.Names.names;

/**
 * Created by Karanbir Singh on 6/2/2019.
 **/
public class UserDto {

    @Getter
    @Setter
    @Accessors(chain = true)
    private long id;

    @Setter
    @Getter
    @Accessors(chain = true)
    private String firstName;

    @Setter
    @Getter
    @Accessors(chain = true)
    private String lastName;

    private static UserDto mockUserDto() {
        UserDto userDto = filler(() -> new UserDto())
                .setter(UserDto::setFirstName, names().first())
                .setter(UserDto::setLastName, names().last())
                .get();
        return userDto;
    }

    public static Supplier<UserDto> USER_DTO_SUPPLIER = UserDto::mockUserDto;

    public static UserDto MOCK_USER_DTO = USER_DTO_SUPPLIER.get();

}
