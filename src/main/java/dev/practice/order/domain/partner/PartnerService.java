package dev.practice.order.domain.partner;

public interface PartnerService {
    PartnerInfo registerPartner(PartnerCommend commend);
    PartnerInfo getPartnerInfo(String partnerToken);
    PartnerInfo enablePartner(String partnerToken);
    PartnerInfo disablePartner(String partnerToken);
}
