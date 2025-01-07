package ace.charitan.common.dto.donation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SendDonationEmailConfirmationDto {
    private Long donationId;
    private Float amount;
    private String message;
    private String projectName;
    private String donorName;
    private LocalDate createdAt;
}
