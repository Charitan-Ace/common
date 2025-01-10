package ace.charitan.common.dto.donation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DonationDto {
    private Long id;
    private Double amount;
    private String message;
    private String transactionStripeId;
    private String projectId;
    private String donorId;
    private LocalDate createdAt;
}
