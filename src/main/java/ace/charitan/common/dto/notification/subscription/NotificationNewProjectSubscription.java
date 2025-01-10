package ace.charitan.common.dto.notification.subscription;

import java.io.Serializable;
import java.util.List;

import ace.charitan.common.dto.project.ExternalProjectDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

public class NotificationNewProjectSubscription {
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class NotificationNewProjectSubscriptionRequestDto implements Serializable {

        private List<String> donorIdList;

        private ExternalProjectDto project;

    } 
}