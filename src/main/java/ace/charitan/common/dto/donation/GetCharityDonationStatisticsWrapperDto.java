package ace.charitan.common.dto.donation;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetCharityDonationStatisticsWrapperDto {
  private List<String> projectIds;
}
