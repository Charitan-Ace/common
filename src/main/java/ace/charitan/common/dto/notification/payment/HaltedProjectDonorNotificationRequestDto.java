package ace.charitan.common.dto.notification.payment;

import ace.charitan.common.dto.project.ExternalProjectDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HaltedProjectDonorNotificationRequestDto {
    private List<String> donorIds;
    private ExternalProjectDto project;
}
