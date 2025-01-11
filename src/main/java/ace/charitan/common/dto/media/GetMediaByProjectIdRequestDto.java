package ace.charitan.common.dto.media;

import java.io.Serializable;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetMediaByProjectIdRequestDto implements Serializable {
  private List<String> projectIdList;
}
