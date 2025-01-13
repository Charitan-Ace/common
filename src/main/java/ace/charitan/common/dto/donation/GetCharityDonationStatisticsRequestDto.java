package ace.charitan.common.dto.donation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetCharityDonationStatisticsRequestDto {
    private String time;
    private GetCharityDonationStatisticsWrapperDto dto;
}
