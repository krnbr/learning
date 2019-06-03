package in.n2w.services;

import in.n2w.dtos.UserDto;
import in.n2w.entities.User;
import in.n2w.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Karanbir Singh on 6/1/2019.
 **/
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Transactional
    public UserDto createUser(final UserDto userDto){

        User user = new User();
        user.setFirstName(userDto.getFirstName()).setLastName(userDto.getLastName());

        user = userRepository.save(user);

        userDto.setId(user.getUserId());

        return userDto;

    }


}
