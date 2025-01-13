
package ace.charitan.common.dto.project;

import ace.charitan.common.dto.media.ExternalMediaDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

public class UpdateProjectMediaDto  {

    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class UpdateProjectMediaRequestDto implements  Serializable {

        private String projectId;

        private List<ExternalMediaDto> mediaDtoList;
    }

}
