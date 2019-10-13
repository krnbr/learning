package in.n2w.services;

import in.n2w.dtos.downstream.CitiesResponse;
import in.n2w.dtos.downstream.DownstreamCity;
import in.n2w.dtos.downstream.DownstreamState;
import in.n2w.dtos.downstream.StatesResponse;
import in.n2w.entities.City;
import in.n2w.entities.Country;
import in.n2w.entities.State;
import in.n2w.repositories.CityRepository;
import in.n2w.repositories.CountryRepository;
import in.n2w.repositories.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by Karanbir Singh on 10/13/2019.
 **/
@Service
public class LocationService {

    @Autowired
    private CountryRepository countryRepository;

    @Autowired
    private StateRepository stateRepository;

    @Autowired
    private CityRepository cityRepository;

    private final String secret_key = "WILL NOT COMMIT IT, urls are still there";

    private final RestTemplate restTemplate = new RestTemplate();

    public void saveStates(){
        Optional<Country> optionalCountry = countryRepository.findById(101);

        try {
            URI uri = new URI("https://api.jsonbin.io/b/5da2229da29a916e01acf12b");

            MultiValueMap<String, String> headers = new LinkedMultiValueMap<>();
            headers.set("secret-key",secret_key);

            RequestEntity requestEntity = new RequestEntity(headers, HttpMethod.GET, uri);

            ResponseEntity<StatesResponse> statesResponseRE = restTemplate.exchange(requestEntity, StatesResponse.class);

            System.out.println(statesResponseRE.getBody());

            Set<DownstreamState> states = statesResponseRE.getBody().getIncluded().stream().sorted(Comparator.comparing(DownstreamState::getStateName)).collect(Collectors.toCollection(LinkedHashSet::new));

            states.stream().forEach(
                    s-> {
                        State state = new State();
                        state.setCountry(optionalCountry.get()).setName(s.getStateName());
                        stateRepository.save(state);
                    });

        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

    }

    public void saveStateCities(){
        Optional<State> optionalState = stateRepository.findById(36);
        try {
            URI uri = new URI("https://api.jsonbin.io/b/5da23a4c5fa9966eec31d0e4");

            MultiValueMap<String, String> headers = new LinkedMultiValueMap<>();
            headers.set("secret-key",secret_key);

            RequestEntity requestEntity = new RequestEntity(headers, HttpMethod.GET, uri);

            ResponseEntity<CitiesResponse> citiesResponseRE = restTemplate.exchange(requestEntity, CitiesResponse.class);

            System.out.println(citiesResponseRE.getBody());

            Set<DownstreamCity> cities = citiesResponseRE.getBody().getIncluded().stream().sorted(Comparator.comparing(DownstreamCity::getCityName)).collect(Collectors.toCollection(LinkedHashSet::new));

            cities.stream().forEach(
                    c -> {
                        City city = new City();
                        city.setState(optionalState.get()).setName(c.getCityName()).setCentralizedPostalCode(c.getCentralizedPostalCode());
                        cityRepository.save(city);
                    });

        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

}
