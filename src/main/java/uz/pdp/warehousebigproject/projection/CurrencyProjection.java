package uz.pdp.warehousebigproject.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.warehousebigproject.entity.Currency;

@Projection(types = Currency.class)
public interface CurrencyProjection {
    Integer getId();
    String getName();
    boolean getActive();
}
