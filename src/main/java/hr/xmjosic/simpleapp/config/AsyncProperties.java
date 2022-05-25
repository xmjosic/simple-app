package hr.xmjosic.simpleapp.config;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;

@Getter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@Validated
@ConstructorBinding
@ConfigurationProperties(prefix = "simple-app.config.async")
public class AsyncProperties {
  @NotNull private final Integer corePoolSize;
  @NotNull private final Integer maxPoolSize;
  @NotNull private final Integer queueCapacity;
}
