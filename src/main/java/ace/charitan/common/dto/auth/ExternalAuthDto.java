package ace.charitan.common.dto.auth;

public record ExternalAuthDto(String email, String roleId, Boolean active) {}
