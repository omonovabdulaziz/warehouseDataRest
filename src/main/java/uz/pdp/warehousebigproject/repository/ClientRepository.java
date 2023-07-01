package uz.pdp.warehousebigproject.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.warehousebigproject.entity.Client;
import uz.pdp.warehousebigproject.projection.ClientProjection;


@RepositoryRestResource(path = "client"  , collectionResourceRel = "clients", excerptProjection = ClientProjection.class)
public interface ClientRepository extends JpaRepository<Client , Integer> {
    boolean existsByPhoneNumber(String phoneNumber);
}
