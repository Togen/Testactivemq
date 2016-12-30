package com.utils;

import com.pojo.Resendlogging;
import com.service.ResendloggingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by rj-wyh on 2016/12/14.
 */
@Component
public class SaveMsgUtil {

    @Autowired
    private ResendloggingService resendloggingService;

    public void saveMsg(Resendlogging resendlogging) {
        resendloggingService.saveErrorMsg(resendlogging);
    }

}
