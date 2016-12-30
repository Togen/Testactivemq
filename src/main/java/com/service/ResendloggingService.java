package com.service;

import com.pojo.Resendlogging;

import java.util.List;

/**
 * Created by xlm on 2016/12/13.
 */
public interface ResendloggingService {

    void saveErrorMsg(Resendlogging resendlogging);

    List<Resendlogging> getErrorList();
}
