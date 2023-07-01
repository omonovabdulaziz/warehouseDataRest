package uz.pdp.warehousebigproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.warehousebigproject.entity.Supplier;
import uz.pdp.warehousebigproject.projection.SupplierProjection;


@RepositoryRestResource(path = "supplier" , excerptProjection = SupplierProjection.class)
public interface SupplierRepository extends JpaRepository<Supplier , Integer> {
}
