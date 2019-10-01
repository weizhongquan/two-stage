package com.whlll.controller;

import com.whlll.entity.M_test;
import com.whlll.service.ItestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Slf4j
@RestController
@RequestMapping("/Demo")
public class Demo {
    @Resource
    private ItestService itestService;
    @RequestMapping("/add")
    public String add(){
        M_test m_test = new M_test();
        m_test.setMUsername("admin");
        m_test.setMPassword("admin");
        m_test.setMInvite(123);
        Integer rSet = itestService.add(m_test);
        System.out.println(rSet);
        return "添加成功";
    }
}
