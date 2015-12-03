package hello;

import org.springframework.boot.actuate.health.AbstractHealthIndicator;
import org.springframework.boot.actuate.health.Health;

/**
 * User: tylermendenhall
 * Date: 12/2/15
 */
public class StaticHealthIndicator extends AbstractHealthIndicator  {

    @Override
    protected void doHealthCheck(Health.Builder builder) throws Exception {
        builder.up().withDetail("groovy","yeah");
    }
}
