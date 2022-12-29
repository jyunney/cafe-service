package cafe.service.domain;

import cafe.service.domain.*;
import cafe.service.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class MenuAdded extends AbstractEvent {

    private Long id;

    public MenuAdded(Menu aggregate){
        super(aggregate);
    }
    public MenuAdded(){
        super();
    }
}
