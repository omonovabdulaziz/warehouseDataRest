package uz.pdp.warehousebigproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.warehousebigproject.entity.Currency;
import uz.pdp.warehousebigproject.projection.CurrencyProjection;


@RepositoryRestResource(path = "currency" , excerptProjection = CurrencyProjection.class)
public interface CurrencyRepository extends JpaRepository<Currency , Integer> {
boolean existsByName(String name);
}
