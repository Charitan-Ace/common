package ace.charitan.common.dto.payment;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateDonationPaymentRedirectUrlRequestDto {
    private String userId;
    private Long donationId;
    private Double amount;
    private String successUrl;
    private String cancelUrl;
}
