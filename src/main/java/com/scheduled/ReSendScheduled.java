package com.scheduled;

import com.pojo.Resendlogging;
import com.service.ResendloggingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by rj-wyh on 2016/12/13.
 */
@Component
public class ReSendScheduled {

    @Autowired
    private ResendloggingService resendloggingService;

//    fixedRate = 1800000
    @Scheduled(cron = "0/1 0/30 * * * ?" )
    public List<Resendlogging> reportCurrentTime() {
        return resendloggingService.getErrorList();
    }
}
