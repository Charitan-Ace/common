package ace.charitan.common.dto.auth;

import java.util.Map;
import java.util.UUID;

public record AuthCreationDto(UUID id, String email, String roleId, Map<String, String> profile) {}
