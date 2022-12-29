package cafe.service.domain;

import cafe.service.domain.OrderPlaced;
import cafe.service.domain.CustomerOrderCanceled;
import cafe.service.OrderApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


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

        //Following code causes dependency to external APIs
        // it is NOT A GOOD PRACTICE. instead, Event-Policy mapping is recommended.


        cafe.service.external.Payment payment = new cafe.service.external.Payment();
        // mappings goes here
        OrderApplication.applicationContext.getBean(cafe.service.external.PaymentService.class)
            .startPayment(payment);

        OrderPlaced orderPlaced = new OrderPlaced(this);
        orderPlaced.publishAfterCommit();

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
