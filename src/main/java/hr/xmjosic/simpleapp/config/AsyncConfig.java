package hr.xmjosic.simpleapp.config;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

@Configuration
@EnableAsync
@EnableConfigurationProperties({AsyncProperties.class})
@ConditionalOnProperty(
    name = "simple-app.config.async.enabled",
    havingValue = "true",
    matchIfMissing = true)
@RequiredArgsConstructor
public class AsyncConfig {

  public static final String simpleAppAsyncExecutor = "simpleAppAsyncExecutor";

  @Bean(simpleAppAsyncExecutor)
  public Executor executor(AsyncProperties properties) {
    ThreadPoolTaskExecutor retVal = new ThreadPoolTaskExecutor();
    retVal.setCorePoolSize(properties.getCorePoolSize());
    retVal.setMaxPoolSize(properties.getMaxPoolSize());
    retVal.setQueueCapacity(properties.getQueueCapacity());
    return retVal;
  }
}
