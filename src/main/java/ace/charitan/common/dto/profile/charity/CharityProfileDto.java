package ace.charitan.common.dto.profile.charity;

import java.util.UUID;

public record CharityProfileDto(
    UUID charityId,
    String companyName,
    String address,
    String taxCode,
    OrganizationType organizationType,
    String stripeId,
    String assetKey) {}
