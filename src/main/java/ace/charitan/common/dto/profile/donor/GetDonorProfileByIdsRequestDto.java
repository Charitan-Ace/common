package ace.charitan.common.dto.profile.donor;

import java.util.List;
import java.util.UUID;

public record GetDonorProfileByIdsRequestDto(List<UUID> donorIdList) {}
