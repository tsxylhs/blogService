package com.blog.edu.admin.model;


/**
 * @ClassName Mqtt
 * @Author lvhoushuai(tsxylhs @ outlook.com)
 * @Date 2018-12-06
 **/

public class Mqtt {
    private String topic;
    private String messsage;

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getMesssage() {
        return messsage;
    }

    public void setMesssage(String messsage) {
        this.messsage = messsage;
    }

    @Override
    public String toString() {
      return   "mqtt topic:"+this.getTopic()+"mqtt message"+this.getMesssage();

    }
}

