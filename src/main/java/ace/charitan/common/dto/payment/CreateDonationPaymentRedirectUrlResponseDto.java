package ace.charitan.common.dto.payment;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateDonationPaymentRedirectUrlResponseDto {
  private String redirectUrl;
}
