package guru.springframework.msscbreweryclient.web.client;

import guru.springframework.msscbreweryclient.web.model.BeerDto;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BreweryClientTest {

    @Autowired
    private BreweryClient client;

    @Test
    @DisplayName("Get a beer by Id")
    void shouldGetBeerById() {
        BeerDto actualBeer = client.getBeerById(UUID.randomUUID());
        assertNotNull(actualBeer);
    }

}