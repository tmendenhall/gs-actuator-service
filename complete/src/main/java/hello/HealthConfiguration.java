package hello;

import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * User: tylermendenhall
 * Date: 12/2/15
 */
@Configuration
public class HealthConfiguration {


    @Bean
    public HealthIndicator createAllGoodHealthIndicator(){

     return new StaticHealthIndicator();
    }

    @Bean HealthIndicator createAllBadHealthIndicator() {
      return new BadStaticHealthIndicator();
    }
}
