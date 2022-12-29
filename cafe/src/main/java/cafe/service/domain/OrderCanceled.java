package cafe.service.domain;

import cafe.service.domain.*;
import cafe.service.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class OrderCanceled extends AbstractEvent {

    private Long orderId;

    public OrderCanceled(CafeOrder aggregate){
        super(aggregate);
    }
    public OrderCanceled(){
        super();
    }
}
