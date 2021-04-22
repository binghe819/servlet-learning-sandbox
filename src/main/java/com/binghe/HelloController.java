package com.binghe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * DispatcherServlet의 핸들러인 HelloController는 Servlet WebApplicationContext에 빈으로 저장되어야한다.
 */
@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping("/hello")
    public String hello() {
        return "Hello " + helloService.getName();
    }
}
