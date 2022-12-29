package cafe.service.domain;

import cafe.service.infra.AbstractEvent;
import lombok.Data;
import java.util.*;


@Data
public class OrderCanceled extends AbstractEvent {

    private Long orderId;
}
