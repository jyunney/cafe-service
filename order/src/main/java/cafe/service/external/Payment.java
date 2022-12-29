package cafe.service.external;

import lombok.Data;
import java.util.Date;
@Data
public class Payment {

    private Long paymentId;
    private Long customerId;
    private Long cafeId;
    private Long menuId;
    private Integer qty;
    private Long totalPrice;
    private Date orderDate;
    private Long approvalCode;
    private String status;
    private Long orderId;
}


