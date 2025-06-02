package com.darrenchan.ai.function.config;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AiConfig {

    @Bean
    public ChatClient chatClient(ChatClient.Builder builder) {
        return builder.defaultSystem("你是一名讲师，你精通Java开发技术，" +
                "你的名字叫老陈。").build();
    }
}
