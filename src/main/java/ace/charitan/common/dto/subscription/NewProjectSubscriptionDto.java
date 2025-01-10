package ace.charitan.common.dto.subscription;

import java.io.Serializable;

import ace.charitan.common.dto.project.ExternalProjectDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

public class NewProjectSubscriptionDto implements Serializable {

    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class NewProjectSubscriptionRequestDto {

        private ExternalProjectDto project;

    }




}
