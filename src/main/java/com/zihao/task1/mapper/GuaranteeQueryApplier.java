package com.zihao.task1.mapper;

import com.zihao.task1.entity.Guarantee;
import com.zihao.task1.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface GuaranteeQueryApplier {
    @Select("<script>Select id,xing,ming,sei,mei,romasei,romamei,country,sex,birth,tel,phone,job,address from users where xing = #{xing} and ming = #{ming} </script>")
    List<User> GuaranteeQueryApplier(String xing, String ming);
}
