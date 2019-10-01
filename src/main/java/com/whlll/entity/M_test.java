package com.whlll.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class M_test {
    private Integer mId;
    private String mUsername;
    private String mPassword;
    private Integer mInvite;
}
