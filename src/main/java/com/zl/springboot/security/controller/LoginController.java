package com.zl.springboot.security.controller;

import com.zl.springboot.security.entity.Users;
import com.zl.springboot.security.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class LoginController {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private UserService service ;

    @RequestMapping(value="/index",method = RequestMethod.GET)
    public String index(Model model){
        model.addAttribute("username","暂无用户");
        List<Users> list =  service.queryAll();
        logger.info("====>查询到了数据:"+list);
        model.addAttribute("list",list);
        return "login";
    }
    @RequestMapping(value="/login",method = RequestMethod.POST)
    @ResponseBody
    public String login(Model model,String username,String password){
        return username+"-"+password;
    }
}
