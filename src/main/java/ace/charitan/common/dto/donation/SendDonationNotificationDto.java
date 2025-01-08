package ace.charitan.common.dto.donation;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SendDonationNotificationDto {
  private Long donationId;
  private Float amount;
  private String message;
  private String projectName;
  private String donorName;
  private LocalDate createdAt;
}
