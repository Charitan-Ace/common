package ace.charitan.common.dto.profile.charity;

import java.util.List;
import java.util.UUID;

public record GetCharityProfileByIdsRequestDto(List<UUID> charityIdList) {}
