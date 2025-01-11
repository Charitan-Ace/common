package ace.charitan.common.dto.email.subscription;

import ace.charitan.common.dto.project.ExternalProjectDto;
import java.io.Serializable;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

public class EmailNewProjectSubscription {

    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class EmailNewProjectSubscriptionRequestDto implements Serializable {

        private List<String> donorIdList;

        private ExternalProjectDto project;

    }

}
