package cafe.service.domain;

import cafe.service.domain.*;
import cafe.service.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class CustomerOrderCanceled extends AbstractEvent {

    private Long id;
    private Long orderId;
    private Long customerId;
    private Long cafeId;
    private Long menuId;
    private Integer qty;
    private Long totalPrice;
    private String status;
    private Date orderDate;
}


