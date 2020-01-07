package com.cheqianbo.ssm.controller;

import com.cheqianbo.ssm.model.Test;
import com.cheqianbo.ssm.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    private ITestService testService;

    @RequestMapping("/index_page")
    public String showIndex(HttpServletRequest request, Model model) {
        int id = Integer.parseInt(request.getParameter("id"));
        Test test = this.testService.getModelById(id);
        //绑定对象到test/index.jsp
        model.addAttribute("test", test);
        return "test/index";
    }

    @RequestMapping("/index_api")
    @ResponseBody
    public Test Index(HttpServletRequest request,Model model) {
        int id = Integer.parseInt(request.getParameter("id"));
        return this.testService.getModelById(id);
    }
}