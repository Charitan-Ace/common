package ace.charitan.common.dto.donation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetProjectIdsByDonorIdResponseDto {
  private GetProjectIdsByDonorIdWrapperDto wrapper;
}
