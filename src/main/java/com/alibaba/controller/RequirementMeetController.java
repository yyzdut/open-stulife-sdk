package com.alibaba.controller;

import com.alibaba.bean.Download;
import com.alibaba.bean.RequirementMeet;
import com.alibaba.bean.Result;
import com.alibaba.service.DownloadServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

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
    private DownloadServiceImpl downloadServiceImpl;

    @ApiOperation(value = "发布需求")
    @PostMapping(value = "/publishRequirement")
    public Result publishRequirement(@RequestBody RequirementMeet requirementMeet) {


        return downloadServiceImpl.findAll(requirementMeet);
    }

}
