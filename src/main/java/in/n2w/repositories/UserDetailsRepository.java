package in.n2w.repositories;

import in.n2w.entities.User;
import in.n2w.entities.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Karanbir Singh on 6/3/2019.
 **/
public interface UserDetailsRepository extends JpaRepository<UserDetails, Long> {

}