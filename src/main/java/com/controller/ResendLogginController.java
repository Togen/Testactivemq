package com.controller;

import com.pojo.Resendlogging;
import com.service.ResendloggingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by xlm on 2016/12/13.
 */
@RestController
@RequestMapping("/resendLoggin")
public class ResendLogginController {

    @Autowired
    private ResendloggingService resendloggingService;

    @RequestMapping("get/list")
    public List<Resendlogging> getList(){
        return resendloggingService.getErrorList();
    }
}
