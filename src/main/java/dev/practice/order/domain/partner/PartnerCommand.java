package dev.practice.order.domain.partner;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString
public class PartnerCommand {
    private final String name;
    private final String businessNo;
    private final String email;

    public Partner toEntity() {
        return Partner.builder()
                .name(name)
                .businessNo(businessNo)
                .email(email)
                .build();
    }
}
