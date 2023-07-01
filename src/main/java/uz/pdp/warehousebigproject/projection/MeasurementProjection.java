package uz.pdp.warehousebigproject.projection;


import org.springframework.data.rest.core.config.Projection;
import uz.pdp.warehousebigproject.entity.Measurement;

@Projection(types = Measurement.class)
public interface MeasurementProjection {
    Integer getId();
    String getName();
    boolean getActive();
}
