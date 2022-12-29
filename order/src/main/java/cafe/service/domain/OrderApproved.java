package cafe.service.domain;

import cafe.service.infra.AbstractEvent;
import lombok.Data;
import java.util.*;


@Data
public class OrderApproved extends AbstractEvent {

    private Long orderId;
}
