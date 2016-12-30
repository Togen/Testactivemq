package com.test;

import com.Application;
import com.pojo.Resendlogging;
import com.service.ResendloggingService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by xlm on 2016/12/14.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
public class Tests {

    @Autowired
    private ResendloggingService resendloggingService;

    @Test
    public void saveTest(){
        Resendlogging resendlogging=new Resendlogging();
        resendlogging.setSend_num(0);
        resendlogging.setSend_status("-1");
        resendlogging.setCreate_time(new SimpleDateFormat("yy-MM-dd HH:mm:ss").format(new Date()));
        resendlogging.setUpdate_time(new SimpleDateFormat("yy-MM-dd HH:mm:ss").format(new Date()));
        resendlogging.setId(5);
        resendloggingService.saveErrorMsg(resendlogging);
    }
}
