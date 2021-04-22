# Servlet-Learning-Test (서블릿 놀이터) - DispatcherServlet을 등록하는 예시

Dispatcher Servlet만을 등록한 예시

SpringMVC 구조를 Servlet에 올리는 가장 기본적인 예시라고 보면 될 듯 하다.

> 요즘엔 대부분 비즈니스 로직만을 따로 관리하는 IoC 컨테이너 (ApplicationContext)를 따로 Root WebApplicationContext로 두지 않는다고 한다.
> 
> 그래서 이 예시가 어떻게 보면 Servlet에 Spring을 올리는 예시중에 가장 디폴트스러운 예시인 듯하다.

<br>

## 내용
SpringMVC의 핵심인 DispatcherServlet을 Servlet으로 등록해보았다.

ApplicationContext (IoC Container)는 ServletContext와 ServletConfig 모두에 등록할 수 있는데,

이번엔 DispatcherServlet (ServletConfig)에만 등록하였다.

> 만약 ServletContext에도 IoC Container를 등록하고 싶다면 [여기](https://github.com/binghe819/servlet-learning-test/tree/spring-dispatcherservlet-helloworld-ver.extends) 예시를 참조하자.

<br>

## 중요한 내용!
* `Servlet WebApplicationContext` 는 `Root WebApplicationContext` 를 상속받아 사용하므로
    *  **`Controller`에서  `Service`, `Repository` 의 의존성을 주입받을 수 있다.**
* **또한 굳이 상속관계를 만들지 않고 `Servlet WebApplicationContext` 만을 등록해서 모든 빈들을 여기에 담아도 상관 없다.**
    * **하지만 여러 가지의 `Servlet` 이 공유할 자원이 필요하다면 상속 관계를 만드는 것이 좋다.**

> 이 브랜치에서는 Root WebApplicationContext를 따로 만들지 않고, Servlet WebApplicationContext만을 만들어 빈들을 모두 이곳에 담았다.
> * Controller, Service, Repository, ViewResolver, HandlerMapping.. 등을 모두 하나의 IoC 컨테이너에 담았다는 의미

