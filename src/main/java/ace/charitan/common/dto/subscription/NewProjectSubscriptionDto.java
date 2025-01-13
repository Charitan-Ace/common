package ace.charitan.common.dto.subscription;

import ace.charitan.common.dto.project.ExternalProjectDto;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

public class NewProjectSubscriptionDto {

  @Getter
  @NoArgsConstructor
  @AllArgsConstructor
  public static class NewProjectSubscriptionRequestDto implements Serializable {

    private ExternalProjectDto project;
  }
}
