package com.darrenchan.ai.controller;

import groovy.transform.AutoClone;
import org.springframework.ai.chat.model.ChatModel;
import org.springframework.ai.openai.OpenAiChatModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeepSeekController {

    @Autowired
    private OpenAiChatModel chatModel;

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "message", defaultValue = "hello")
                            String message) {
        String result = chatModel.call(message);
        System.out.println(result);
        return  result;
    }

    @RequestMapping(value = "/springboot_hello")
    public Object handle(){
        //编写方法处理逻辑
        System.out.println("收到了请求，已经处理完毕...");
        return "ok";
    }

}
