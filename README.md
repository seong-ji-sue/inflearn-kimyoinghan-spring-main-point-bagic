# (inflearn 김영한)스프링 기본편 - 핵심 원리

<aside>
📢 자바를 완벽하게 이해했다는 가정하에 들으시면 좋습니다.
Optional, List, Interface 등 내용이 나옵니다.
</aside>
<br>
<aside>
📢 해당 강의를 완주하면 아래와 같은 능력을 얻게 됩니다.
<br>스프링 기본 기능 학습
<br>스프링 본질 깊은 이해
<br>객체 지향 설계를 고민하는 개발자로 성장
</aside>
<br>
<aside>

[강의 링크](https://www.inflearn.com/course/%EC%8A%A4%ED%94%84%EB%A7%81-%ED%95%B5%EC%8B%AC-%EC%9B%90%EB%A6%AC-%EA%B8%B0%EB%B3%B8%ED%8E%B8/dashboard)

[노션링크](https://typical-wallet-2b3.notion.site/inflearn-e81b6f2567c140c38ae901762d1a5919)

## Summary

1. 스프링 특징과 원칙
2. Spring 없이 코드 개발 및 문제점 해결
3. 용어 설명 및 스프링 코드로 변경
4. 스프링 컨테이너 생성부터 빈 등록까지 개념 정리 및 실습
5. 싱글톤 패턴과 @Configuration을 사용하는 이유
6. 스프링에서 컴포넌트 스캔과 의존관계 주입 하는 방법, 발생하는
7. 상황에 따른 다양한 의존관계 종류와 롬복
8. 빈 초기화 시점과 다양한 빈 스코프

## 스프링 특징과 원칙

<aside>
📢 개념 설명 위주

</aside>

### 알게 된 것

1. 스프링을 왜 사용해야 되는지(이전에 문제점, 어떤 부분을 해결해 주는지)
2. 좋은 객체지향 설계 5가지 원칙(SOLID)
3. 객체 지향 설계 시 역할과 구현으로 분리하는 방법

### 정리

[객체 지향과 스프링](https://www.notion.so/dbd7aee4fea340cd9cea95f13533f98c)

## Spring 없이 코드 개발 및 문제점 해결

<aside>
📢 GitHub branch : feature/1011-non-spring-test-code

</aside>

### 알게 된 것

1. 회원과 주문 기능으로 간단한 코드를 작성할 수 있습니다.
2. Spring 없이 코드 작성 시 문제점을 알고 해결할 수 있습니다.
3. 관심사 분리(AppConfig 구성)를 하지 않을 때 DIP, OCP 원칙이 왜 위반 되는지 이해하고 있습니다.

### 정리

[Spring 없이 코드 개발 및 문제점 해결](https://www.notion.so/Spring-0a122eab9ab440da9b0e0e760db5506b)

## 용어 설명 및 스프링 코드로 변경

<aside>
📢 GitHub branch : feature/1014-change-spring-test-code

</aside>

### 알게 된 것

1. 지금까지 배운 개념들로 IoC, DI, 컨테이너의 개념과 특징을 이해한다.
2. 순수 자바 코드로 AppConfig를 사용해서 문제를 해결했다면 스프링으로 변경 시 컨테이너에서 어떻게 관리되는지 변경되는 코드가 어떤 것이 있는지 파악한다.

### 정리

[스프링 코드 적용](https://www.notion.so/225d88a026de456c8498df2145fe1470)


## 스프링 컨테이너 생성부터 빈 등록까지 개념 정리 및 실습

<aside>
📢 GitHub branch : feature/1014-spring-bean-detail-code

</aside>

### 알게 된 것

1. 스프링 컨테이너가 등록된 AppConfig를 읽고 빈을 등록, 의존관계 설정까지 모든 과정을 설명할 수 있습니다.
2. 스프링 컨테이너가 자바 또는 XML로 빈을 생성할 수 있는지 내부 구조를 파악하고 이유를 알 수 있습니다.
3. 직접 스프링 빈을 등록(자바 기반, XML 기반)하고 빈을 조회하여 원하는 빈 객체를 가져올 수 있습니다. 그리고 예외 처리까지 할 수 있습니다.
4. 기존 순수 자바코드 AppConfig로 사용했을 때와 다르게 개선된 점을 이야기 할 수 있습니다.

### 정리

[스프링 빈 등록, 원리 및 조회](https://www.notion.so/3542279ce75848a5a063264ce8549ed0)

[(실습)스프링 빈 조회 및 예외 처리 방법](https://www.notion.so/604e349b693342e8a8b3ea06add5bc18)


## 싱글톤 패턴과 @Configuration을 사용하는 이유

<aside>
📢 GitHub branch : feature/1014-spring-single

</aside>

### 알게 된 것

1. 싱글톤 패턴이 무엇이고 왜 사용하는지 인지하고 있습니다.
2. 스프링에서 싱글톤 컨테이너의 역활을 명확하게 알고 있습니다.
3. @Configuration을 썼을 때와 안 썼을 때 차이점을 파악하고 이유를 명확하게 알고 있습니다.

### 정리

[싱글톤 패턴과 @Configuration](https://www.notion.so/Configuration-ee954ecd0a39436a8cab8b98b52024da)


## 스프링에서 컴포넌트 스캔과 의존관계 주입 하는 방법, 발생하는 문제

<aside>
📢 GitHub branch : feature/1019-spring-component-scan

</aside>

### 알게 된 것

1. 기존 AppConfig 설정 정보의 문제점을 명확하게 파악합니다
2. 스프링이 컴포넌트 스캔, 의존관계 주입하는 과정을 알고 있습니다.
3. @ComponentScan, @Component, @Autowired 가 어떤 역할을 하는지 알고 있습니다.
4. @ComponentScan 하는 애노테이션과 스캔을 제외하고 추가하는 속성을 알고 있습니다.
5. 자동 빈 등록, 수동 빈 등록에서 충동이 났을 경우 대처 방법을 알고 있습니다.

### 정리

[컴포넌트 스캔과 의존관계 주입 방법](https://www.notion.so/c57bd691dcee4e56b749b5bf78d7374f)


## 상황에 따른 다양한 의존관계 종류와 롬복

<aside>
📢 GitHub branch : feature/1019-spring-autowired

</aside>

### 알게 된 것

1. 생성자 주입 외에 수정자 주입, 필드 주입, 일반 메서드 주입에 대해 사용 방법을 알고 어느 상황에 사용하는지 알고 있습니다.
2. 롬복을 왜 사용하는지 명확하게 알고 있습니다.
3. 자동 주입과 수동 주입을 언제 사용하는지 이해했습니다.

### 정리

[상황에 따른 다양한 의존 관계 주입과 롬복](https://www.notion.so/fd1f5e02efe74553ad99774a33cb47aa)

[롬복 설정 방법](https://www.notion.so/7677a492b8894d5f99ddd202207862f4)


## 빈 초기화 시점과 다양한 빈 스코프

<aside>
📢 GitHub branch : feature/1204-spring-bean-detail

</aside>

### 알게 된 것

1. 싱글톤, 프로토타입 스코프의 개념과 초기화 종료 시점을 알고 있습니다.
2. DI와 DL의 차이점을 알고 사용해야 되는 상황과 어떻게 쓰는지 알고 있습니다.
3. 웹 스코프 중 request 스코프에 대해 발생 시점부터 기존 싱글톤과 맞지 않는 문제점을 해결할 수 있습니다.

### 정리

[빈의 초기화 시점과 다양한 빈 스코프](https://www.notion.so/249e549370e5439095f9263e7bf6316b)

[스프링 초기화, 종료 메서드 실행을 아는 방법](https://www.notion.so/94d9ac81d1b24df1ae6465f6f0088320)

[DL 기능을 제공해주는 제공자](https://www.notion.so/DL-f142a60184604552b5fcb10f15345c1f)

[request 스코프에 맞춰서 지연 시키는 방법](https://www.notion.so/request-802cd370ecae4f5cab761c5f8545fa4b)
