package ace.charitan.common.dto.payment;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CancelHaltedProjectSubscriptionRequestDto {
  private String projectId;
}
