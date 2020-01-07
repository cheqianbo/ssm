package com.cheqianbo.ssm.service.impl;

import com.cheqianbo.ssm.dao.TestDao;
import com.cheqianbo.ssm.model.Test;
import com.cheqianbo.ssm.service.ITestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TestServiceImpl implements ITestService {
    @Resource
    private TestDao testDao;

    @Override
    public Test getModelById(int id) {
        return testDao.getModelById(id);
    }
}
