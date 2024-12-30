package ace.charitan.common.dto.country;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class GetCountryByIsoCode {
    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class GetCountryByIsoCodeRequestDto {

        private String isoCode;

    }

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public class GetCountryByIsoCodeResponseDto {

        private Long id;

        private String isoCode;

        private String regionName;
    }

}
