package uz.pdp.warehousebigproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.warehousebigproject.entity.Attachment;
import uz.pdp.warehousebigproject.projection.AttachmentProjection;

@RepositoryRestResource(path = "attachment" , excerptProjection = AttachmentProjection.class)
public interface AttachmentRepository extends JpaRepository<Attachment , Integer> {
}
