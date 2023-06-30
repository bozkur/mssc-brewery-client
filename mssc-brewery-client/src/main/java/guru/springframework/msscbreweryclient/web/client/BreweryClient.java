package guru.springframework.msscbreweryclient.web.client;

import guru.springframework.msscbreweryclient.web.model.BeerDto;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.UUID;

@Component
public class BreweryClient {

    public static final String BEER_ROOT = "/api/v1/beer";
    private final RestTemplate restTemplate;
    private final BreweryConfiguration configuration;

    public BreweryClient(RestTemplateBuilder restTemplateBuilder, BreweryConfiguration configuration) {
        this.restTemplate = restTemplateBuilder.build();
        this.configuration = configuration;
    }


    public BeerDto getBeerById(UUID id) {
        String url = configuration.getApiHost() + BEER_ROOT + "/" + id;
        return restTemplate.getForObject(url, BeerDto.class);
    }

    public URI saveNewBeer(BeerDto beer) {
        String url = configuration.getApiHost() + BEER_ROOT;
        return restTemplate.postForLocation(url, beer);
    }

    public void updateBeer(UUID id, BeerDto beer) {
        String url = configuration.getApiHost() + BEER_ROOT + "/" + id;
        restTemplate.put(url, beer);
    }

    public void deleteBeer(UUID id) {
        String url = configuration.getApiHost() + BEER_ROOT + "/" + id;
        restTemplate.delete(url);
    }
}
