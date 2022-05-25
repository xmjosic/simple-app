package hr.xmjosic.simpleapp.event;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

import static hr.xmjosic.simpleapp.config.AsyncConfig.simpleAppAsyncExecutor;

@Component
public class ConversionEventListener {

  @Async(simpleAppAsyncExecutor)
  @EventListener
  public void handle(final ConversionEventMsg msg) {
    System.out.printf("Received msg: %s @ %s%n", msg, LocalDateTime.now());
  }
}
