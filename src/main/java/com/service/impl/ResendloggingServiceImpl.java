package com.service.impl;

import com.pojo.Resendlogging;
import com.repository.ResendloggingRepository;
import com.service.ResendloggingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by xlm on 2016/12/13.
 */
@Service
public class ResendloggingServiceImpl implements ResendloggingService {

    @Autowired
    private ResendloggingRepository resendloggingRepository;

    SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Override
    public void saveErrorMsg(Resendlogging resendlogging) {

        if(resendlogging!=null){
            if(resendlogging.getId()==null){
                resendlogging.setSend_num(0);
                resendlogging.setCreate_time(sdf.format(new Date()));
                resendloggingRepository.save(resendlogging);
            }else{
                Resendlogging resendLoggingUpdate= resendloggingRepository.findOne(resendlogging.getId());
                if(resendLoggingUpdate.getSend_num()<5){
                    resendLoggingUpdate.setSend_num(resendLoggingUpdate.getSend_num()+1);
                    resendLoggingUpdate.setUpdate_time(sdf.format(new Date()));
                    resendloggingRepository.save(resendLoggingUpdate);
                }else{
                    System.out.println("WebService_url为：["+resendlogging.getWebservice_url()+"] 发送次数已超过五次，请人为处理！");
                }
            }
        }
    }

    @Override
    public List<Resendlogging> getErrorList() {
        return resendloggingRepository.findErrorList();
    }

}
