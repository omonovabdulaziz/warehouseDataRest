package uz.pdp.warehousebigproject.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.warehousebigproject.entity.User;

@Projection(types = User.class)
public interface UserProjection {
    Integer getId();
    String getFirstName();
    String getLastName();
    String getPhoneNumber();
    String getCode();
    String getPassword();
    boolean getActive();
}
