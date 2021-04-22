# Servlet-Learning-Test (서블릿 놀이터) - DispatcherServlet을 등록하는 예시

<br>

## 내용
이전에 IoC 컨테이너를 ServletContext에 등록해보았고, 자세한 내용은 [여기](https://github.com/binghe819/servlet-learning-test/tree/listener-IoC-Container-HelloWorld)

이번엔 SpringMVC의 핵심인 DispatcherServlet을 Servlet으로 등록해보았다.

<br>

## 중요한 내용!
* `Servlet WebApplicationContext` 는 `Root WebApplicationContext` 를 상속받아 사용하므로
    *  **`Controller`에서  `Service`, `Repository` 의 의존성을 주입받을 수 있다.**
* **또한 굳이 상속관계를 만들지 않고 `Servlet WebApplicationContext` 만을 등록해서 모든 빈들을 여기에 담아도 상관 없다.**
    * **하지만 여러 가지의 `Servlet` 이 공유할 자원이 필요하다면 상속 관계를 만드는 것이 좋다.**

> 이 브랜치에서는 상속 관계를 설정하도록 코드를 작성해보았다!
> 
> 즉, Root WebApplicationContext (ServletContext)에 등록된 IoC 컨테이너와,
> 
> Servlet WebApplicationContext (DispatcherServlet Config)에 등록된 IoC 컨테이너의 생명주기가 서로 다르게 설정해준 것!
