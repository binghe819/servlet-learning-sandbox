package com.binghe;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;

/**
 * WebConfig: DispatcherServlet에 등록되는 IoC 컨테이너 설정 (Controller, ViewResolver, HandlerMapping)
 *
 * Servlet WebApplicationContext는 웹(DispatcherServlet)에 대한 빈을 등록해준다.
 * 그러므로, Controller와 관련된 빈만 포함(includeFilters)시킨다.
 */
@Configuration
@ComponentScan(useDefaultFilters = false, includeFilters = @ComponentScan.Filter(Controller.class))
public class WebConfig {
}
