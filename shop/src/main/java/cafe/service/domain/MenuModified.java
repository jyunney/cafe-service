package cafe.service.domain;

import cafe.service.domain.*;
import cafe.service.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class MenuModified extends AbstractEvent {

    private Long id;

    public MenuModified(Menu aggregate){
        super(aggregate);
    }
    public MenuModified(){
        super();
    }
}
