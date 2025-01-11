package ace.charitan.common.dto.donation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetCharityDonorsOfTheMonthRequestDto {
    private GetCharityDonorsOfTheMonthWrapperDto wrapper;
}
