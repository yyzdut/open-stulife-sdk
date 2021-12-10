package com.alibaba.service;

import com.alibaba.bean.RequirementMeet;
import com.alibaba.bean.Result;
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
    Result findAll();
    Result findRequirementById(Long requirementMeetId);
    Result deteleRequirementById(Long requirementMeetId);
    Result updateRequirement(RequirementMeet requirementMeet);
}
