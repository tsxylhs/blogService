package com.blog.edu.admin.config;


import com.blog.edu.core.service.MqttPushClient;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @ClassName MqttConfiguration
 * @Author lvhoushuai(tsxylhs @ outlook.com)
 * @Date 2018-12-06
 **/

@Component
@Configuration
@PropertySource("classpath:config/config.properties")
@ConfigurationProperties(prefix = "mqtt")
public class MqttConfiguration {
    private String host;
    private String clientid;
    private String username;
    private String password;
    private String topic;
    private int timeout;
    private int keepalive;

    public String getClientid() {
        return clientid;
    }

    public void setClientid(String clientid) {
        this.clientid = clientid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public int getTimeout() {
        return timeout;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    public int getKeepalive() {
        return keepalive;
    }

    public void setKeepalive(int keepalive) {
        this.keepalive = keepalive;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }
    @Bean
    public MqttPushClient getMqttPushClient(){
        MqttPushClient mqttPushClient = new MqttPushClient();
        System.out.println("mqttconnection");
        mqttPushClient.connect(host, clientid, username, password, timeout,keepalive);
        return mqttPushClient;
    }

}
