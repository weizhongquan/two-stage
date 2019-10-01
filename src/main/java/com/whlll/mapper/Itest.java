package com.whlll.mapper;

import com.whlll.entity.M_test;
import org.apache.ibatis.annotations.Param;

public interface Itest {
    Integer add(@Param("Test")M_test m_test);
}
