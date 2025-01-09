package ace.charitan.common.dto.media;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MediaListDto {

    private String projectId;

    private List<ExternalMediaDto> mediaDtoList;

}
