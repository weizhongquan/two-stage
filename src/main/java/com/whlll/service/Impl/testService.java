package com.whlll.service.Impl;

import com.whlll.entity.M_test;
import com.whlll.mapper.Itest;
import com.whlll.service.ItestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Slf4j
@Service("testService")
public class testService implements ItestService {
@Resource
private Itest itest;
    @Override
    public Integer add(M_test m_test) {
        log.debug("进入service");
        return itest.add(m_test);
    }
}
