package com.alibaba.dao;

import com.alibaba.bean.VisitedData;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: ModestYjx
 * @Project: open-stulife-sdk
 * @Description:
 * @Version: 1.0.0
 * @Date: 2021/12/10 10:21
 */
public interface RequirementMeet extends JpaRepository<VisitedData, Long> {
}
