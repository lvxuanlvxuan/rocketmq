package com.example.rocketmq.producer.web;

import com.example.rocketmq.producer.dto.RocketMqMessageDTO;
import com.example.rocketmq.producer.send.SendDemoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @Author: lvxuan
 * @program:
 * @Date: 2022/12/18 0:26
 * @Version: 1.0
 * @motto: 而后乃将图南
 * @Description: des
 * ░░░░░░░░░░░░░░░░░░░░░░░░▄░░
 * ░░░░░░░░░▐█░░░░░░░░░░░▄▀▒▌░
 * ░░░░░░░░▐▀▒█░░░░░░░░▄▀▒▒▒▐
 * ░░░░░░░▐▄▀▒▒▀▀▀▀▄▄▄▀▒▒▒▒▒▐
 * ░░░░░▄▄▀▒░▒▒▒▒▒▒▒▒▒█▒▒▄█▒▐
 * ░░░▄▀▒▒▒░░░▒▒▒░░░▒▒▒▀██▀▒▌
 * ░░▐▒▒▒▄▄▒▒▒▒░░░▒▒▒▒▒▒▒▀▄▒▒
 * ░░▌░░▌█▀▒▒▒▒▒▄▀█▄▒▒▒▒▒▒▒█▒▐
 * ░▐░░░▒▒▒▒▒▒▒▒▌██▀▒▒░░░▒▒▒▀▄
 * ░▌░▒▄██▄▒▒▒▒▒▒▒▒▒░░░░░░▒▒▒▒
 * ▀▒▀▐▄█▄█▌▄░▀▒▒░░░░░░░░░░▒▒▒
 * You are not expected to understand this
 */
@RestController
@RequestMapping("/send-demo")
public class SendDemoController {

    @Resource
    private SendDemoService sendDemoService;

    @PostMapping("/sendString")
    public ResponseEntity sendString(@RequestParam("message") String messsage) {
        sendDemoService.send(messsage);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/sendMessage")
    public ResponseEntity sendMessage(@RequestBody RocketMqMessageDTO rocketMqMessageDTO) {
        sendDemoService.sendMessage(rocketMqMessageDTO);
        return ResponseEntity.ok().build();
    }
}
