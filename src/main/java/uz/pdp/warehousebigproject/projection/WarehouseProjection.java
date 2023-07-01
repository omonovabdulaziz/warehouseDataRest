package uz.pdp.warehousebigproject.projection;


import org.springframework.data.rest.core.config.Projection;
import uz.pdp.warehousebigproject.entity.Warehouse;

@Projection(types = Warehouse.class)
public interface WarehouseProjection {
    Integer getId();
    String getName();
    Boolean getActive();
}
