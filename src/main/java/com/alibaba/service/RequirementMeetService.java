package com.alibaba.service;

import com.alibaba.bean.RequirementMeet;
import com.alibaba.bean.VisitedData;

import java.util.List;

/**
 * @Author: ModestYjx
 * @Project: open-stulife-sdk
 * @Description:
 * @Version: 1.0.0
 * @Date: 2021/12/10 10:09
 */
public interface RequirementMeetService {
    List<RequirementMeet> findAll();
}
