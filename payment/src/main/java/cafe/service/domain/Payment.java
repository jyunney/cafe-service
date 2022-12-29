package cafe.service.domain;

import cafe.service.domain.Paid;
import cafe.service.domain.PaymentCanceled;
import cafe.service.PaymentApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="Payment_table")
@Data

public class Payment  {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
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

    @PostPersist
    public void onPostPersist(){
        Paid paid = new Paid(this);
        paid.publishAfterCommit();

    }
    @PreUpdate
    public void onPreUpdate(){


        PaymentCanceled paymentCanceled = new PaymentCanceled(this);
        paymentCanceled.publishAfterCommit();

    }

    public static PaymentRepository repository(){
        PaymentRepository paymentRepository = PaymentApplication.applicationContext.getBean(PaymentRepository.class);
        return paymentRepository;
    }




    public static void cancelPayment(CustomerOrderCanceled customerOrderCanceled){

        /** Example 1:  new item 
        Payment payment = new Payment();
        repository().save(payment);

        */

        /** Example 2:  finding and process
        
        repository().findById(customerOrderCanceled.get???()).ifPresent(payment->{
            
            payment // do something
            repository().save(payment);


         });
        */

        
    }
    public static void cancelPayment(OrderCanceled orderCanceled){

        /** Example 1:  new item 
        Payment payment = new Payment();
        repository().save(payment);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderCanceled.get???()).ifPresent(payment->{
            
            payment // do something
            repository().save(payment);


         });
        */

        
    }


}
