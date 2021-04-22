package com.binghe;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;

/**
 * AppConfig: 서블릿 컨텍스트에 저장되는 IoC 컨테이너 설정 (Service, Repository를 포함)
 *
 * RootWebApplicationContext(ServletContext에 저장되는 IoC 컨테이너)에는 비즈니스 로직만을 수행하는
 * Service와 Repository만을 빈으로 등록해준다.
 * 그러므로, Controller와 관련된 빈은 제외(exclude)시킨다.
 */
@Configuration
@ComponentScan(excludeFilters = @ComponentScan.Filter(Controller.class))
public class AppConfig {

}
