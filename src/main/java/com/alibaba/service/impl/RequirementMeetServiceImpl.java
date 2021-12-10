package com.alibaba.service.impl;

import com.alibaba.bean.RequirementMeet;
import com.alibaba.bean.Result;
import com.alibaba.dao.RequirementMeetRespority;
import com.alibaba.service.RequirementMeetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

/**
 * @Author: ModestYjx
 * @Project: open-stulife-sdk
 * @Description:
 * @Version: 1.0.0
 * @Date: 2021/12/10 10:18
 */
@Service
public class RequirementMeetServiceImpl implements RequirementMeetService {

    @Resource
    @Autowired
    private RequirementMeetRespority requirementMeetRespority;

    @Override
    public Result findAll() {
        Result result = new Result();
        result.setSuccess(false);
        result.setDetail(null);
        try {
            List<RequirementMeet> requirementMeetList = requirementMeetRespority.findAll();
            result.setDetail(requirementMeetList);
        }catch (Exception e)
        {
            result.setMsg(e.getMessage());
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public Result findRequirementById(Long requirementMeetId){
        Result result = new Result();
        result.setSuccess(false);
        result.setDetail(null);
        try {
            Optional<RequirementMeet> requirementMeet = requirementMeetRespority.findById(requirementMeetId);
            result.setDetail(result);
        }catch (Exception e)
        {
            result.setMsg(e.getMessage());
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public Result deteleRequirementById(Long requirementMeetId){
        Result result = new Result();
        result.setSuccess(false);
        result.setDetail(null);
        try {
            requirementMeetRespority.deleteById(requirementMeetId);
            result.setMsg("删除成功");
        }catch (Exception e)
        {
            result.setMsg(e.getMessage());
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public Result updateRequirement(RequirementMeet requirementMeet){
        Result result = new Result();
        result.setSuccess(false);
        result.setDetail(null);
        try {
            requirementMeetRespority.save(requirementMeet);
            result.setMsg("更新需求成功！");
        }catch (Exception e)
        {
            result.setMsg(e.getMessage());
            e.printStackTrace();
        }
        return result;
    }
}
