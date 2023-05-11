package com.zihao.task1.mapper;

import com.zihao.task1.entity.Guarantee;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GuaranteeMapper {
    @Insert("INSERT INTO guarantee" +
            "(cptanpomono,cpnamemei,cpnamesei,cpbirthdateyear,cpbirthdate,cpmoushikomi,cprentaisaimushatoonaji,cpphone,cphonninshokugyocode,cphonninkinmusakiname,cpreason,cpsame,userid)"+
            " VALUES"+
            "(#{cptanpomono},#{cpnamemei},#{cpnamesei},#{cpbirthdateyear},#{cpbirthdate},#{cpmoushikomi},#{cprentaisaimushatoonaji},#{cpphone},#{cphonninshokugyocode},#{cphonninkinmusakiname},#{cpreason},#{cpsame},#{userid})")
    void insertGuarantee(Guarantee guarantee);
}
