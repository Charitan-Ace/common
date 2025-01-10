package ace.charitan.common.dto.profile.donor;

import java.util.UUID;

public record DonorProfileDto(UUID donorId, String lastName, String firstName,
                              String address, String stripeId, String assetsKey){
}
