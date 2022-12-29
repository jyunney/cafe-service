package cafe.service.domain;

import cafe.service.domain.MakeStarted;
import cafe.service.domain.OrderApproved;
import cafe.service.domain.MakeCompleted;
import cafe.service.domain.OrderCanceled;
import cafe.service.CafeApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="CafeOrder_table")
@Data

public class CafeOrder  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long cafeOrderId;
    
    
    
    
    
    private Long customerId;
    
    
    
    
    
    private Long cafeId;
    
    
    
    
    
    private Long menuId;
    
    
    
    
    
    private Integer qty;
    
    
    
    
    
    private Date orderDate;
    
    
    
    
    
    private String status;
    
    
    
    
    
    private Long orderId;

    @PostPersist
    public void onPostPersist(){


        MakeStarted makeStarted = new MakeStarted(this);
        makeStarted.publishAfterCommit();



        OrderApproved orderApproved = new OrderApproved(this);
        orderApproved.publishAfterCommit();



        MakeCompleted makeCompleted = new MakeCompleted(this);
        makeCompleted.publishAfterCommit();



        OrderCanceled orderCanceled = new OrderCanceled(this);
        orderCanceled.publishAfterCommit();

    }

    public static CafeOrderRepository repository(){
        CafeOrderRepository cafeOrderRepository = CafeApplication.applicationContext.getBean(CafeOrderRepository.class);
        return cafeOrderRepository;
    }




    public static void addToCafeOrder(Paid paid){

        /** Example 1:  new item 
        CafeOrder cafeOrder = new CafeOrder();
        repository().save(cafeOrder);

        */

        /** Example 2:  finding and process
        
        repository().findById(paid.get???()).ifPresent(cafeOrder->{
            
            cafeOrder // do something
            repository().save(cafeOrder);


         });
        */

        
    }
    public static void changeCafeOrder(PaymentCanceled paymentCanceled){

        /** Example 1:  new item 
        CafeOrder cafeOrder = new CafeOrder();
        repository().save(cafeOrder);

        */

        /** Example 2:  finding and process
        
        repository().findById(paymentCanceled.get???()).ifPresent(cafeOrder->{
            
            cafeOrder // do something
            repository().save(cafeOrder);


         });
        */

        
    }


}
