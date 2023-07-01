package uz.pdp.warehousebigproject.projection;


import org.springframework.data.rest.core.config.Projection;
import uz.pdp.warehousebigproject.entity.Client;

@Projection(types = Client.class)
public interface ClientProjection {
    Integer getId();

    String getName();
    boolean getActive();

    String getPhoneNumber();

}
