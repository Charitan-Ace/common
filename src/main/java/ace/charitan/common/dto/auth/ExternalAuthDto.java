package ace.charitan.common.dto.auth;

public record ExternalAuthDto(String id, String email, String roleId, Boolean active) {}
