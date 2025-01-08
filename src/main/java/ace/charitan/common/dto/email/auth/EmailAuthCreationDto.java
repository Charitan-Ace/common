package ace.charitan.common.dto.email.auth;

public record EmailAuthCreationDto(String recipient, String subject, String body) {}
