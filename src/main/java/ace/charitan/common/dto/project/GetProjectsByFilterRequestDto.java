package ace.charitan.common.dto.project;

public record GetProjectsByFilterRequestDto(String category, String isoCode, String continent, String status) {
}
