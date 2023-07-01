package uz.pdp.warehousebigproject.projection;


import org.springframework.data.rest.core.config.Projection;
import uz.pdp.warehousebigproject.entity.Attachment;

@Projection(types = Attachment.class)
public interface AttachmentProjection {
    Integer getId();
    String getName();
    long getSize();
    String getContentType();
}
