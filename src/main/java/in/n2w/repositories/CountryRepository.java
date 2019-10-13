package in.n2w.repositories;

import in.n2w.entities.Country;
import in.n2w.entities.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Karanbir Singh on 10/13/2019.
 **/
public interface CountryRepository extends JpaRepository<Country, Integer> {

}