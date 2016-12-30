package com.pojo;


import javax.persistence.*;

@Entity
public class Resendlogging {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;
  private String source;
  private String project_name;
  private String queue_name;
  private String message;
  private String message_properties;
  private int send_num;
  private String send_status;
  private String create_time;
  private String update_time;
  private String webservice_url;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public String getProject_name() {
    return project_name;
  }

  public void setProject_name(String project_name) {
    this.project_name = project_name;
  }

  public String getQueue_name() {
    return queue_name;
  }

  public void setQueue_name(String queue_name) {
    this.queue_name = queue_name;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public String getMessage_properties() {
    return message_properties;
  }

  public void setMessage_properties(String message_properties) {
    this.message_properties = message_properties;
  }

  public int getSend_num() {
    return send_num;
  }

  public void setSend_num(int send_num) {
    this.send_num = send_num;
  }

  public String getSend_status() {
    return send_status;
  }

  public void setSend_status(String send_status) {
    this.send_status = send_status;
  }

  public String getCreate_time() {
    return create_time;
  }

  public void setCreate_time(String create_time) {
    this.create_time = create_time;
  }

  public String getUpdate_time() {
    return update_time;
  }

  public void setUpdate_time(String update_time) {
    this.update_time = update_time;
  }

  public String getWebservice_url() {
    return webservice_url;
  }

  public void setWebservice_url(String webservice_url) {
    this.webservice_url = webservice_url;
  }
}
