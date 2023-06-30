package guru.springframework.msscbreweryclient.web.client;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "sfg.brewery", ignoreInvalidFields = false)
public class BreweryConfiguration {
    private String apiHost;

    public void setApiHost(String apiHost) {
        this.apiHost = apiHost;
    }

    String getApiHost() {
        return this.apiHost;
    }
}
