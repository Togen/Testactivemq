//package com.service;
//
//import org.apache.cxf.Bus;
//import org.apache.cxf.bus.spring.SpringBus;
//import org.apache.cxf.jaxws.EndpointImpl;
//import org.apache.cxf.transport.servlet.CXFServlet;
//import org.springframework.boot.web.servlet.ServletRegistrationBean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import javax.xml.ws.Endpoint;
//
//
///**
// * Created by xlm on 2016/12/13.
// */
//@Configuration
//public class CXFconfig {
//  @Bean
//  public ServletRegistrationBean dispatcherServlet(){
//
//    return new ServletRegistrationBean(new CXFServlet(),"/soap/*");
//  }
//  @Bean(name= Bus.DEFAULT_BUS_ID)
//  public SpringBus springbus(){
//    return new SpringBus();
//  }
//  @Bean
//  public ResendloggingService ResendloggingService(){
//
//      return new ResendloggingServiceImpl();
//  }
//  @Bean
//  public Endpoint endpoint(){
//      EndpointImpl endpoint=new EndpointImpl(springbus(),ResendloggingService());
//      endpoint.publish("/Resendlogging");
//      return endpoint;
//  }
//}
