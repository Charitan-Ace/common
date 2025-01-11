package ace.charitan.common.dto.project;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

public class GetProjectByCharitanIdDto {

    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class GetProjectByCharitanIdRequestDto implements Serializable {

        private String charitanId;
    }

    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class GetProjectByCharitanIdResponseDto implements Serializable {
        private List<ExternalProjectDto> projectDtoList;
    }

}
