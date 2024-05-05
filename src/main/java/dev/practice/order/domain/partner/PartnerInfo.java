package dev.practice.order.domain.partner;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Builder;
import lombok.Getter;

@Getter
public class PartnerInfo {
    private final Long id;
    private final String token;
    private final String name;
    private final String businessNo;
    private final String email;
    private final Partner.Status status;

    public PartnerInfo(Partner partner) {
        this.id = partner.getId();
        this.token = partner.getToken();
        this.name = partner.getName();
        this.businessNo = partner.getBusinessNo();
        this.email = partner.getEmail();
        this.status = partner.getStatus();

    }
}
