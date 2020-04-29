package com.ydw;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * @Author yindwe@yonyou.com
 * @Date 2020/4/29
 */
@RestController
@RequestMapping("test")
public class TestController {
    @GetMapping
    public Mono get(String str){
        return Mono.just(str);
    }
}
