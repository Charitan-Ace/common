package ace.charitan.common.dto.donation;

import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetDonorsOfTheMonthResponseDto {
  private Map<String, Double> donors;
}
