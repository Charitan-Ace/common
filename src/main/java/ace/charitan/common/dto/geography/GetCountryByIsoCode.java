package ace.charitan.common.dto.geography;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class GetCountryByIsoCode {
  @Getter
  @Setter
  @NoArgsConstructor
  @AllArgsConstructor
  public static class GetCountryByIsoCodeRequestDto implements Serializable {

    private String isoCode;
  }

  @Getter
  @Setter
  @NoArgsConstructor
  @AllArgsConstructor
  public static class GetCountryByIsoCodeResponseDto implements Serializable {

    private String isoCode;

    private String regionName;
  }
}
