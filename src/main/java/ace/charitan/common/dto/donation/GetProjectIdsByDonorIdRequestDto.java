package ace.charitan.common.dto.donation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetProjectIdsByDonorIdRequestDto {
    private String donorId;
}
