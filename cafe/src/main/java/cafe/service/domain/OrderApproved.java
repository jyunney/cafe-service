package cafe.service.domain;

import cafe.service.domain.*;
import cafe.service.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class OrderApproved extends AbstractEvent {

    private Long orderId;

    public OrderApproved(CafeOrder aggregate){
        super(aggregate);
    }
    public OrderApproved(){
        super();
    }
}
