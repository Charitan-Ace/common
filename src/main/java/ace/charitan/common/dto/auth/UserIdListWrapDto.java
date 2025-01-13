package ace.charitan.common.dto.auth;

import java.util.List;
import java.util.UUID;

public record UserIdListWrapDto(List<UUID> userIds) {}
