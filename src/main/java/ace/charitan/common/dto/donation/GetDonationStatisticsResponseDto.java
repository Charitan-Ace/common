package ace.charitan.common.dto.donation;

import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetDonationStatisticsResponseDto {
  private Map<String, Double> donorStatistics;
}
