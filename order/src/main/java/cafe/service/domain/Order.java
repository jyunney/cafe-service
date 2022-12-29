package cafe.service.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PostPersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

import cafe.service.OrderApplication;
import lombok.Data;


@Entity
@Table(name="Order_table")
@Data

public class Order  {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long orderId;
    
    private Long customerId;
    
    private Long cafeId;
    
    private Long menuId;
    
    private Integer qty;
    
    private Long totalPrice;
    
    private String status;
    
    private Date orderDate;

    @PostPersist
    public void onPostPersist(){
        OrderPlaced orderPlaced = new OrderPlaced(this);
        orderPlaced.publish();

        //Following code causes dependency to external APIs
        // it is NOT A GOOD PRACTICE. instead, Event-Policy mapping is recommended.
        cafe.service.external.Payment payment = new cafe.service.external.Payment();
        // mappings goes here
        payment.setOrderId(getOrderId());
        payment.setCustomerId(getCustomerId());
        payment.setCafeId(getCafeId());
        payment.setMenuId(getMenuId());
        payment.setQty(getQty());
        payment.setTotalPrice(getTotalPrice());
        payment.setStatus("paid");
        payment.setOrderDate(getOrderDate());

        OrderApplication.applicationContext.getBean(cafe.service.external.PaymentService.class)
            .startPayment(payment);

    }
    @PreUpdate
    public void onPreUpdate(){


        CustomerOrderCanceled customerOrderCanceled = new CustomerOrderCanceled(this);
        customerOrderCanceled.publishAfterCommit();

    }

    public static OrderRepository repository(){
        OrderRepository orderRepository = OrderApplication.applicationContext.getBean(OrderRepository.class);
        return orderRepository;
    }






}
