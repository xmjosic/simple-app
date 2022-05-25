package hr.xmjosic.simpleapp.event;

import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ConversionEventPublisher {

  private final ApplicationEventPublisher publisher;

  public void publish(final ConversionEventMsg msg) {
    publisher.publishEvent(msg);
  }
}
