package in.n2w;

import in.n2w.dtos.UserDetailsDto;
import in.n2w.dtos.UserDto;
import in.n2w.entities.enums.Gender;
import in.n2w.services.LocationService;
import in.n2w.services.UserDetailsService;
import in.n2w.services.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static net.andreinc.mockneat.unit.objects.From.from;

import static in.n2w.dtos.UserDto.MOCK_USER_DTO;

@SpringBootApplication
public class ConsoleApplication implements CommandLineRunner {

    @Autowired
    private UserService userService;

    @Autowired
    private UserDetailsService userDetailsService;

    @Autowired
    private LocationService locationService;

    private static Logger LOG = LoggerFactory.getLogger(ConsoleApplication.class);

    public static void main(String[] args) {
        LOG.info("STARTING THE APPLICATION");
        SpringApplication.run(ConsoleApplication.class, args);
        LOG.info("APPLICATION FINISHED");
    }

    @Override
    public void run(String... args) {
        LOG.info("EXECUTING : command line runner");

        for (int i = 0; i < args.length; ++i) {
            LOG.info("args[{}]: {}", i, args[i]);
        }

        UserDto userDto = userService.createUser(MOCK_USER_DTO);

        UserDetailsDto userDetailsDto = new UserDetailsDto();
        userDetailsDto.setUserDto(userDto);
        userDetailsDto.setGender(from(Gender.class).val());

        userDetailsService.createUserDetails(userDetailsDto);

        locationService.saveStateCities();
    }
}