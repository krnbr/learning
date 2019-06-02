package in.n2w;

import in.n2w.dtos.UserDto;
import in.n2w.services.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static in.n2w.dtos.UserDto.USER_DTO_SUPPLIER;

@SpringBootApplication
public class ConsoleApplication implements CommandLineRunner {

    @Autowired
    private UserService userService;

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

        userService.createUser(USER_DTO_SUPPLIER.get());
    }
}