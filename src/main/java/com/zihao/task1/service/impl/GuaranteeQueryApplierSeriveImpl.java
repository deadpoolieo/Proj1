package com.zihao.task1.service.impl;

import com.zihao.task1.entity.Guarantee;
import com.zihao.task1.entity.User;
import com.zihao.task1.mapper.GuaranteeQueryApplier;
import com.zihao.task1.service.GuaranteeQueryApplierService;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuaranteeQueryApplierSeriveImpl implements GuaranteeQueryApplierService {
    @Autowired
    private GuaranteeQueryApplier guaranteeQueryApplier;

    @Override
    public List<User> QueryApplier(String xing, String ming){
        return guaranteeQueryApplier.GuaranteeQueryApplier(xing, ming);
    }
}
