package com.binghe;

import org.springframework.stereotype.Service;

/**
 * Service는 RootWebApplicationContext에 등록되어야한다.
 * -> RootWebApplicationContext란 ServletContext에 속성으로 저장되는 IoC 컨테이너를 의미한다.
 */
@Service
public class HelloService {

    public String getName() {
        return "binghe";
    }
}
