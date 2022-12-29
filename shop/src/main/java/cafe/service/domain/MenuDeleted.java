package cafe.service.domain;

import cafe.service.domain.*;
import cafe.service.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class MenuDeleted extends AbstractEvent {

    private Long id;

    public MenuDeleted(Menu aggregate){
        super(aggregate);
    }
    public MenuDeleted(){
        super();
    }
}
