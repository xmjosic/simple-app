package hr.xmjosic.simpleapp.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;

@Validated
@ConstructorBinding
@ConfigurationProperties(prefix = "simple-app.config.async")
public record AsyncProperties(@NotNull Integer corePoolSize, @NotNull Integer maxPoolSize, @NotNull Integer queueCapacity) {}
