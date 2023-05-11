package com.zihao.task1.service.impl;

import com.zihao.task1.entity.Guarantee;
import com.zihao.task1.mapper.GuaranteeMapper;
import com.zihao.task1.service.GuaranteeSerive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GuaranteeServiceImpl implements GuaranteeSerive {
    @Autowired
    private GuaranteeMapper guaranteeMapper;

    @Override
    public void saveguarantee(Guarantee guarantee){guaranteeMapper.insertGuarantee(guarantee);}
}
