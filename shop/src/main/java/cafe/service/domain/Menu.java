package cafe.service.domain;

import cafe.service.domain.MenuAdded;
import cafe.service.domain.MenuModified;
import cafe.service.domain.MenuDeleted;
import cafe.service.ShopApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="Menu_table")
@Data

public class Menu  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;

    @PostPersist
    public void onPostPersist(){


        MenuAdded menuAdded = new MenuAdded(this);
        menuAdded.publishAfterCommit();



        MenuModified menuModified = new MenuModified(this);
        menuModified.publishAfterCommit();



        MenuDeleted menuDeleted = new MenuDeleted(this);
        menuDeleted.publishAfterCommit();

    }

    public static MenuRepository repository(){
        MenuRepository menuRepository = ShopApplication.applicationContext.getBean(MenuRepository.class);
        return menuRepository;
    }






}
