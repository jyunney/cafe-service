package cafe.service.domain;

import cafe.service.domain.*;
import cafe.service.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class MakeCompleted extends AbstractEvent {

    private Long orderId;

    public MakeCompleted(CafeOrder aggregate){
        super(aggregate);
    }
    public MakeCompleted(){
        super();
    }
}
