package ace.charitan.common.dto.statistics.charity;

import ace.charitan.common.dto.donation.DonationsDto;

import java.util.List;
import java.util.UUID;

public record CharityStatisticDto(DonationsDto donations) {
}
