package ace.charitan.common.dto.donation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateMonthlyDonationDto {
    private Double amount;
    private String message;
    private String transactionStripeId;
    private String projectId;
    private String donorId;
}
