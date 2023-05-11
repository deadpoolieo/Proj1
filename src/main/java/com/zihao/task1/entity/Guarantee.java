package com.zihao.task1.entity;

import lombok.Data;

@Data
public class Guarantee {
        private String id;//GuaranteeID
        private String cptanpomono;//GuaranteeThing
        private String cpnamemei;//GuaranteeMei
        private String cpnamesei;//GuaranteeSei
        private String cpbirthdateyear;//GuaranteeBirthdate
        private String cpbirthdate;//GuaranteeAge
        private String cpmoushikomi;//WhyToBeGuarantee
        private String cprentaisaimushatoonaji;//Relationship with Guarantee
        private String cpphone;//GuaranteePhonenumber
        private String cphonninshokugyocode;//Guarantee's job
        private String cphonninkinmusakiname;//Guarantee's work address
        private String cpreason;//Reason for Guarantee
        private String cpsame;//Whether Guarantee and applier is the same
        private String userid;//applierId
}
