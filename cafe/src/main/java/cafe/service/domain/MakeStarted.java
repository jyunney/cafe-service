package cafe.service.domain;

import cafe.service.domain.*;
import cafe.service.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class MakeStarted extends AbstractEvent {

    private Long orderId;

    public MakeStarted(CafeOrder aggregate){
        super(aggregate);
    }
    public MakeStarted(){
        super();
    }
}
