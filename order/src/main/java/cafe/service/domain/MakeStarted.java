package cafe.service.domain;

import cafe.service.infra.AbstractEvent;
import lombok.Data;
import java.util.*;


@Data
public class MakeStarted extends AbstractEvent {

    private Long orderId;
}
