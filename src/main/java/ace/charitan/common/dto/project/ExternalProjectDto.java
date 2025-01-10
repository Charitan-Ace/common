package ace.charitan.common.dto.project;

import java.time.ZonedDateTime;

import ace.charitan.common.dto.project.ProjectEnum.CategoryType;
import ace.charitan.common.dto.project.ProjectEnum.StatusType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ExternalProjectDto {

    private String id;

    private String title;

    private String description;

    private Double goal;

    private ZonedDateTime startTime;

    private ZonedDateTime endTime;

    private String statusType;

    private String categoryType;

    private String countryIsoCode;

    private String charityId;

}
