package ace.charitan.common.dto.email.auth;

public record EmailAuthVerificationDto(String recipient, String subject, String body) {}
