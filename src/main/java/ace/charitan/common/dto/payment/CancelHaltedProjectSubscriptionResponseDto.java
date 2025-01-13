package ace.charitan.common.dto.payment;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CancelHaltedProjectSubscriptionResponseDto {
    private List<String> donorIds;
}
