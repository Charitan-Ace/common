package ace.charitan.common.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TestKafkaMessageDto implements Serializable {
    private String name;
    private String description;
}
