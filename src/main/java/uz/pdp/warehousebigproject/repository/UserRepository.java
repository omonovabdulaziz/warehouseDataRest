package uz.pdp.warehousebigproject.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.warehousebigproject.entity.User;
import uz.pdp.warehousebigproject.projection.UserProjection;

@RepositoryRestResource(path = "user" , excerptProjection = UserProjection.class)

public interface UserRepository extends JpaRepository<User  , Integer> {
    boolean existsByPhoneNumber(String phoneNumber);
}
