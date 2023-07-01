package guru.springframework.msscbreweryclient.web.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "sfg.brewery.client")
public class ClientConfiguration {
    private Integer maxTotalConnections;
    private Integer maxTotalPerRoute;
    private Integer connectionRequestTimeoutInMillies;
    private Integer responseTimeoutInMillies;

    public void setMaxTotalConnections(Integer maxTotalConnections) {
        this.maxTotalConnections = maxTotalConnections;
    }

    public void setMaxTotalPerRoute(Integer maxTotalPerRoute) {
        this.maxTotalPerRoute = maxTotalPerRoute;
    }

    public void setConnectionRequestTimeoutInMillies(Integer connectionRequestTimeoutInMillies) {
        this.connectionRequestTimeoutInMillies = connectionRequestTimeoutInMillies;
    }

    public void setResponseTimeoutInMillies(Integer responseTimeoutInMillies) {
        this.responseTimeoutInMillies = responseTimeoutInMillies;
    }

    public Integer getMaxTotalConnections() {
        return maxTotalConnections;
    }

    public Integer getMaxTotalPerRoute() {
        return maxTotalPerRoute;
    }

    public Integer getConnectionRequestTimeoutInMillies() {
        return connectionRequestTimeoutInMillies;
    }

    public Integer getResponseTimeoutInMillies() {
        return responseTimeoutInMillies;
    }
}
