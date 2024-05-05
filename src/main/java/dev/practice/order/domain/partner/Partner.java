package dev.practice.order.domain.partner;

import dev.practice.order.common.util.TokenGenerator;
import dev.practice.order.domain.AbstractEntity;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

@Slf4j
@Getter
@Entity
@NoArgsConstructor
@Table(name = "partners")
public class Partner extends AbstractEntity {
    private static final String PREFIX_PARTNER = "ptn_";
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String token;
    private String name;
    private String businessNo;
    private String email;

    @Enumerated(EnumType.STRING)
    private Status status;

    @Getter
    @RequiredArgsConstructor
    public enum Status {
        ENABLED, DISABLED;
        //private final String description;
    }

    @Builder
    public Partner(String name, String businessNo, String email) {
        if (StringUtils.isEmpty(name)) throw new RuntimeException("empty name");
        if (businessNo == null) throw new RuntimeException("empty businessNo");
        if (email == null) throw new RuntimeException("empty email");
        this.name = name;
        this.token = TokenGenerator.randonCharacterWithPrefix(PREFIX_PARTNER);
        this.businessNo = businessNo;
        this.email = email;
        this.status = Status.ENABLED;
    }

    public void enable() {
        this.status = Status.ENABLED;
    }

    public void disable() {
        this.status = Status.DISABLED;
    }
}
