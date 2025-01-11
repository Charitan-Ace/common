package ace.charitan.common.dto.donation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetDonorsOfTheMonthResponseDto {
    private Map<String, Double> donors;
}
