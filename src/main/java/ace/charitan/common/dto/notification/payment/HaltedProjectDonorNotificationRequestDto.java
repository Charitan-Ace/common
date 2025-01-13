package ace.charitan.common.dto.notification.payment;

import ace.charitan.common.dto.project.ExternalProjectDto;

import java.util.List;

public class HaltedProjectDonorNotificationRequestDto {
    private List<String> donorIds;
    private ExternalProjectDto project;
}
