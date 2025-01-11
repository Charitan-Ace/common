package ace.charitan.common.dto.donation;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
