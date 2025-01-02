package ace.charitan.common.dto;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// @Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TestKafkaMessageDto implements Serializable {
  private String name;
  private String description;
}
