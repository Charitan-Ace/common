package ace.charitan.common.dto.statistics.donor;

import java.util.List;
import java.util.UUID;

public record GetDonorsStatisticsRequestDto(List<UUID> donorId) {
}
