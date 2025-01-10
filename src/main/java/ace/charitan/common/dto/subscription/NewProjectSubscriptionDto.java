package ace.charitan.common.dto.subscription;

import ace.charitan.common.dto.project.ExternalProjectDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

public class NewProjectSubscriptionDto {

    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class NewProjectSubscriptionRequestDto {

        private ExternalProjectDto project;

    }




}
