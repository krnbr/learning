package in.n2w.services;

import in.n2w.dtos.UserDetailsDto;
import in.n2w.entities.User;
import in.n2w.entities.UserDetails;
import in.n2w.repositories.UserDetailsRepository;
import in.n2w.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

/**
 * Created by Karanbir Singh on 6/3/2019.
 **/
@Service
public class UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserDetailsRepository userDetailsRepository;

    @Transactional
    public void createUserDetails(UserDetailsDto userDetailsDto) {

        User user = userRepository.getOne(userDetailsDto.getUserDto().getId());

        UserDetails userDetails = new UserDetails()
                .setUser(user)
                .setDob(LocalDateTime.now())
                .setGender(userDetailsDto.getGender());

        userDetails = userDetailsRepository.save(userDetails);

        user.setUserDetails(userDetails);

        userRepository.save(user);

    }
}
