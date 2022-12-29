package cafe.service.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Date;
import lombok.Data;


@Entity
@Table(name="OrderList_table")
@Data
public class OrderList {

        @Id
        //@GeneratedValue(strategy=GenerationType.AUTO)
        private Long orderId;
        private Long custumerId;
        private Long cafeId;
        private Long menuId;
        private Integer qty;
        private Long totalPrice;
        private String status;
        private Date orderDate;


}
