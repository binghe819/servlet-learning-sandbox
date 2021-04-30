# Servlet-Learning-Test (서블릿 놀이터)
> DispatcherServlet을 WebApplicationInitializer로 Servlet에 등록하는 예시 (web.xml을 사용하지 않는 예시)

# 스프링MVC 등록하는 방법

<br>

## 1 스프링 부트 사용하지 않는 스프링MVC
> 이 브랜치는 WebApplicationInitializer를 사용한 예시이다.

```java
public class WebXML implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext servletContext) throws ... {
      // web.xml에 등록할 내용들을 자바 코드로 설정.
    }
}
```

* 서블릿 컨테이너(ex. 톰캣)에 등록한 웹 애플리케이션 컨텍스트에 `DispatcherServlet` 을 등록한다.
    * `web.xml` 에 서블릿 등록
    * 혹은 `WebApplicationInitializer` 에 자바 코드로 서블릿 등록
* 세부 구성 요소는 빈 설정하기 나름

<br>

## 2 스프링 부트로 사용하는 스프링MVC
* 자바 애플리케이션에 내장 톰캣을 만들고 그 안에 `DispatcherServlet` 을 등록한다.
    * 스프링 부트 자동 설정이 자동으로 해준다.
* **스프링 부트의 주관에 따라 여러 인터페이스 구현체를 빈으로 등록한다.**
    * DispatcherServlet에서 사용하는 여러 구성 요소들의 기본 값들이 일반 스프링 MVC보다 더 많이 정의해놓았다.

