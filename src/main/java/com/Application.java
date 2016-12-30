package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by xlm on 2016/12/13.
 */
@SpringBootApplication
@EnableScheduling
public class Application {

  public static void main(String[] args){
      SpringApplication.run(Application.class,args);
  }
}
