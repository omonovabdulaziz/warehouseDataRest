package uz.pdp.warehousebigproject.projection;


import org.springframework.data.rest.core.config.Projection;
import uz.pdp.warehousebigproject.entity.Supplier;

@Projection(types = Supplier.class)
public interface SupplierProjection {
    Integer getId();
    String getName();
    boolean getActive();
    String getPhoneNumber();
}
