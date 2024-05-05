package dev.practice.order.application.partner;

import dev.practice.order.domain.partner.PartnerCommend;
import dev.practice.order.domain.partner.PartnerInfo;
import dev.practice.order.domain.partner.PartnerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class PartnerFacade {
    private final PartnerService partnerService;

    public PartnerInfo registerPartner(PartnerCommend commend) {
        var partnerInfo = partnerService.registerPartner(commend);




        return partnerInfo;
    }
}
