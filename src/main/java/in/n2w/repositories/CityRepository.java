package in.n2w.repositories;

import in.n2w.entities.City;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Karanbir Singh on 10/13/2019.
 **/
public interface CityRepository extends JpaRepository<City, Integer> {

}