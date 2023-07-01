package uz.pdp.warehousebigproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.warehousebigproject.entity.Warehouse;
import uz.pdp.warehousebigproject.projection.WarehouseProjection;


@RepositoryRestResource(path = "warehouse" , excerptProjection = WarehouseProjection.class)
public interface WarehouseRepository extends JpaRepository<Warehouse , Integer> {
    boolean existsByName(String name);

}
