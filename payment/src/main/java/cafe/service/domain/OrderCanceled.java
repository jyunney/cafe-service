package cafe.service.domain;

import cafe.service.domain.*;
import cafe.service.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class OrderCanceled extends AbstractEvent {

    private Long orderId;
}


