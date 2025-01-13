package ace.charitan.common.dto.donation;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GetProjectIdsByDonorIdWrapperDto {
  private List<String> projectIds;
}
