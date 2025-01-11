package ace.charitan.common.dto.subscription;

import java.io.Serializable;

import ace.charitan.common.dto.project.ExternalProjectDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

public class NewProjectSubscriptionDto  {

    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class NewProjectSubscriptionRequestDto  implements Serializable {

        private ExternalProjectDto project;

    }




}
