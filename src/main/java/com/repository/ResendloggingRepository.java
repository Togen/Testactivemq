package com.repository;

import com.pojo.Resendlogging;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by xlm on 2016/12/13.
 */
@Repository
public interface ResendloggingRepository extends JpaRepository<Resendlogging,Integer >{

    @Query(value = "select * from Resendlogging r where r.send_num<5 and r.send_status=-1",nativeQuery = true)
   List<Resendlogging> findErrorList();

}
