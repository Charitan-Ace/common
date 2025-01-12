package ace.charitan.common.dto.project;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

public class GetProjectByCharityIdDto {

    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class GetProjectByCharityIdRequestDto implements Serializable {

        private String charityId;

        // If want to query deleted project => add PROJECT_DELETED
        // If want to query completed project => add PROJECT_COMPLETED
        private List<String> shardList;
    }

    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class GetProjectByCharityIdResponseDto implements Serializable {
        private List<ExternalProjectDto> projectDtoList;
    }

}
