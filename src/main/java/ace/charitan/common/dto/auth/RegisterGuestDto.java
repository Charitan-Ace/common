package ace.charitan.common.dto.auth;

import java.util.Map;

public record RegisterGuestDto(String email, Map<String, String> profile) {}
