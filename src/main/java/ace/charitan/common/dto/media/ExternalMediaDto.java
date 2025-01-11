package ace.charitan.common.dto.media;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExternalMediaDto {
  private String mediaUrl;

  private String publicId;

  private String mediaType;

  private String mediaFormat;

  private String resourceType;

  private String projectId;
}
