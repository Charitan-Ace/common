package ace.charitan.common.dto.donation;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class GetProjectIdsByDonorIdWrapperDto {
    private List<String> projectIds;
}
