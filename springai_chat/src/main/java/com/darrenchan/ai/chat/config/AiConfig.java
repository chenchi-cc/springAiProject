package com.darrenchan.ai.chat.config;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class  AiConfig {

    @Bean
    public ChatClient chatClient(ChatClient.Builder builder) {
        return builder.defaultSystem("你是百度的一名软件架构师，你精通大数据和Java开发技术，" +
                "你的名字叫陈驰。").build();
    }
}
