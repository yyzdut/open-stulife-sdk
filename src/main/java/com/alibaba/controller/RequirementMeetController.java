package com.alibaba.controller;

import com.alibaba.bean.RequirementMeet;
import com.alibaba.bean.Result;
import com.alibaba.service.RequirementMeetService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: ModestYjx
 * @Description:
 * @Version: 1.0.0
 * @Date: 2021/12/10 10:00
 */

@RestController
@Api(tags = "RequirementMeet 业务")
public class RequirementMeetController {
    @Autowired
    private RequirementMeetService requirementMeetService;

    @ApiOperation(value = "发布需求")
    @PostMapping(value = "/publishRequirement")
    public Result publishRequirement(@RequestBody RequirementMeet requirementMeet) {
        return requirementMeetService.findAll();
    }

    @ApiOperation(value = "通过需求名查找需求")
    @RequestMapping(value = "/findRequirementById", method = RequestMethod.POST)
    public Result findRequirementByIdle(@RequestBody RequirementMeet requirementMeet) {
        Long requirementMeetId = requirementMeet.getId();
        return requirementMeetService.findRequirementById(requirementMeetId);
    }

    @ApiOperation(value = "查看所有需求")
    @RequestMapping(value = "/getAllRequirement", method = RequestMethod.GET)
    public Result getAllRequirement() {
        return (Result) requirementMeetService.findAll();
    }

    @ApiOperation(value = "删除需求")
    @RequestMapping(value = "/deteleRequirement", method = RequestMethod.POST)
    public Result deteleRequirementById(@RequestBody RequirementMeet requirementMeet) {
        Long requirementMeetId = requirementMeet.getId();
        return requirementMeetService.deteleRequirementById(requirementMeetId);
    }

    @ApiOperation(value = "更改需求")
    @RequestMapping(value = "/updateRequirement", method = RequestMethod.POST)
    public Result updateRequirement(@RequestBody RequirementMeet requirementMeet) {
        return requirementMeetService.updateRequirement(requirementMeet);
    }

}
