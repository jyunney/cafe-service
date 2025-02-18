package cafe.service.domain;

import cafe.service.domain.*;
import cafe.service.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class PaymentCanceled extends AbstractEvent {

    private Long id;
    private Long customerId;
    private Long cafeId;
    private Long menuId;
    private Integer qty;
    private Long totalPrice;
    private Date orderDate;
    private Long orderId;
}


