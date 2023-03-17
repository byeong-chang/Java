# Web을 위한 Java 기초 내용정리입니다.

### 프로그램 실행 구조 및 개발 방법

![image](https://user-images.githubusercontent.com/43203949/225478770-ba64ad07-b9d6-4a23-8975-0623b6795590.png)

- 자바는 완벽한 객체지향형 프로그램을 목표로 한다.

![image](https://user-images.githubusercontent.com/43203949/225478830-026194da-3402-413e-95be-6a3f8d3cf092.png)

### 디버깅 하는 법

- 중단점 설정
- Debug main 클릭해서 실행
- F6 누르면서 변수 들어오는 거 확인

```java
package mycome.test;

// main 문을  쓸 때는 main하고 바로 
public class Main {

    public static void main(String[] args) {

        //Data
        int x = 30; // x라는 주소에 3이라는 값을 올린다.
        int y = 40; // y라는 주소에 4라는 값을 올린다.
        int z = 0; // x + y를 z라는 값을 올린다.(메모리(주기억장치))

        // string은 큰 따옴표, character는 작은 따옴표

        //명령어들의 집합 sys.out하고 컨트롤 스페이스 엔터
        z = x + y;
        System.out.println(z);

        //콘솔은 문자기반의 출력장치
        //디버깅 하는 법(강제 브레이크)
        //브레이킹 포인트 클릭하고, RUN - step into/ step over
        // step into는 함수 만나면 함수로 따라 들어가고
        // step over는 함수 만나면 건너뜀
        // 단축키 F6
        // 종료하고 싶으면 TERMIANTE
    }
}
```

### 객체지향형 모델(In Java)

- main class(진입점, 한개만 있어야한다.)
- 다수의 object로 구성

대(대신하는)수학 ex)선형 대수학

수학의 수는 약속이고 기호이다.

### SW 공학 (비용절감이 가장 중요)

- 최소한의 비용으로 최대한효과
- SW의 생성부터 폐기까지 (Life cycle)에서 발생되는 비용을 최소화
- 프로젝트 진행 방법론(폭포수 모델, 에자일 모델) - Dead line을 지키는 것이 중요함
- 프로그래밍 방법론(효율적인 방법론)
    - 함수 지향형 방법론
    - 객체 지향 방법론

### 비용절감 평가기준

- 코드 개발 시간이 줄어들면 됨 → SW의 코드 재사용성이 높으면 됨

---

# 1.컴퓨터의 구성

컴퓨터 = HW + SW

![image](https://user-images.githubusercontent.com/43203949/225478841-0eea6abf-1ed9-4e6f-91d9-5c5105f3b3b0.png)

**CPU에 의해 수행을 원하는 모든 명령어는 필요로 하는 데이터와 함께 반드시
주기억장치에 적재(load)되어 있어야 한다. 만약 명령어를 수행할 때 필요로 하
는 데이터가 메모리에 없을 경우 프로그램을 정상적으로 실행 할 수 없다.**

SW란 원하는 산출물을 얻기 위해 **HW를 조작하기 위한 명령어들의 집합체**로 프로그램이라고도 한다.

- 명령어들을 해석하고 수행하는 **주체는 CPU 이기 때문에 CPU가 할 수 있는 명령어를 어떤 순서로 어떻게 전달할 것인가가 프로그램 작성의 핵심이다.**
- CPU가 할 수 있는 기능
    - 메모리에 저장된 데이터 및 명령어 읽고 쓰기
    
    ![image](https://user-images.githubusercontent.com/43203949/225478846-cfeff052-23b9-4c50-8c2e-e9426900b3ce.png)
    

![image](https://user-images.githubusercontent.com/43203949/225478867-5662e393-60ea-45e1-b784-7ef100222486.png)

- 연산 기능
- 제어 기능

### 프로세스와 메모리의 관계

- 메모리를 실행시킨다. → 해당 메모리 공간에 대해서, 원래 이 메모리 공간을 해당 프로세스가 도점하고 있었던 것
- 프로세스를 종료한다 → 해당 공간을 다른 프로세스가 쓸 수 있게 이 권한을 해제하는 것.
- 메모리를 쓰던 놈이 정리를 해놓진 않음. 어차피 들어오는 놈이 덮어 씌우면 지워짐(시간을 효율적으로 사용하기 위해)
- 메모리 확보와 함께 항상 해야하는게, 항상 초기화 해야한다(변수 x = 20)을 설정하는 것처럼
- 결론 : **반드시 데이터를 선언할 때는 데이터 초기화를 고민해두고 선언한다.**

# 2.개발환경

DK = 유틸 + 라이브러리 + JVM(실행환경)

JVM = 실행 환경

![image](https://user-images.githubusercontent.com/43203949/225478878-b2cd2846-e83d-48df-848d-1f75f261e0c8.png)

- 자바 실행 과정

![image](https://user-images.githubusercontent.com/43203949/225478884-82820d77-b365-4600-91e3-891945b321db.png)

프로그램 = 명령어(실행 중 변경 불가) + 데이터(실행 중 변경 가능)

- 작성 순서

1) 데이터를 명령 수행 전에 미리 준비

2) 데이터를 이용한 명령어 작성

![image](https://user-images.githubusercontent.com/43203949/225478898-34c30e5c-d89e-4087-91a7-974981549f32.png)

# 3. 타입과 연산자

### 변수와 데이터 타입(자료형)

- 기본형( 한개만 담음)
    - 정수형(byte, short, int, long)
    - 실수형(float , double)
    - 문자형(char)
    - 논리형(boolean)
- 참조형(여러 개를 담음)
    - 배열 , 문자열,  class 등
    - 배열은 메모리 상에 첫번째 메모리 값을 가져오고, 이후 쭉 나열되어 있는 변수를 부름

```java
package mycom.test;
// 자바는 클래스명과 파일명이 일치해야한다.
// 어차피 자동으로 잡아줌
// 하나의 클래스를 하나의 .java 파일로 선언하는 걸 원칙으로 하나,
// 하나의 파일 안에 여러 개의 클래스를 선언할 수는 있으나,
// 방법을 모른다면 그냥 1대 1로 매칭하는게 가장 안정적이다.
public class Main{
    public static void main(String[] args) {
    // 전체 카테고리 에서 이렇게 main 두개 두면 터진다.
    // 근데 커서 여기두고 하면 안 터진다. 다른 곳을 검색하지 않기 때문
    int i = 10;
    double d = 17.5;
    double result = 0.0;

    result = d; //double = int;(암묵적 형변환을 지원)
    // 원칙적으로 오른쪽에 있는 변수와 오른쪽에 변수의 데이터타입이 항상 일치해야한다.
    // 그런데 에러가 안나? 왜냐하면, result = 0.0 integer 메모리 공간이 있기 때문에 가능
    i = (int)result;
    // 에러남 4바이트 공간에 8바이트 꾸겨넣으려니까 당연히 안됨
    // 그러니까 cast 해줘야함 -> (자료형)(강제 형변환)

    int ch = 'c'; //문자를 숫자로 하는 거 될까? 되네 아스키 코드인듯
    System.out.println(ch);

    System.out.println("result = " + result);
    // 두 항이 모두 숫자면 산술 연산
    // character, 문자열 하나라도 포함되어있으면 문자열 concat
    }
}
```

### 자료형의 형변환

![image](https://user-images.githubusercontent.com/43203949/225478915-1388457a-7740-4592-8012-c1174747f5c5.png)

### 연산자

![image](https://user-images.githubusercontent.com/43203949/225478927-523af0d4-9b31-4793-8886-adfb07de14c4.png)

# 4.제어문

![image](https://user-images.githubusercontent.com/43203949/225478945-6c487aba-5ead-428f-bb25-72644fef1d24.png)

# 5.메모리

### 메모리에 대용량 데이터 관리하기

- 여러개의 변수 선언을 이용하는 경우
    
    ![image](https://user-images.githubusercontent.com/43203949/225478964-5d22fabe-af6f-446a-b4c3-c79837761d14.png)
    
- 하나의 변수를 선언해 이용하는 경우

![image](https://user-images.githubusercontent.com/43203949/225478981-772cbb45-51db-42be-bbe4-0385753dd280.png)

## 배열

- 배열이란 여러 변수들을 하나로 묶어 하나의 이름으로 다룰 수 있도록 물리적으로 연속된 메모리에 저장하는 구조를 말한다. 단, 하나의 이름으로 여러 개의 데이터를 한꺼번에 다루기 위해 반드시 메모리를 연속적으로 할당하고 값을 저장하도록 하고 있으며, 이러한 원리로 인해 배열의 이름에는 전체 메모리 공간을 다루기 어려우므로 시작 주소만 저장하도록 한다

![image](https://user-images.githubusercontent.com/43203949/225478994-c1042a21-47ba-4b39-b1d4-c4f407a10cae.png)

### 배열의 종류

1. 정적 배열 = 실행 돚우 배열의 크기를 변화시킬 수 없는 배열
    
    ![image](https://user-images.githubusercontent.com/43203949/225479001-e5af2d43-d7f1-464d-b64f-938efec4fb36.png)
    

![image](https://user-images.githubusercontent.com/43203949/225479014-fa9d2143-01c5-4d6e-8d13-526282804e8a.png)

1. 동적 배열  = 실행 도중 배열의 크기를 변화시킬 수 있는 배열 ← Collection Framework에서 관련 기능 제공

![image](https://user-images.githubusercontent.com/43203949/225479024-ae2dde19-6a5d-4583-be43-0a9b0b487b0d.png)

1. 다차원 배열 : 2차원 이상의 배열을 의미.  2차원, 3차원 배열을 총칭해서 다차원 배열이라 한다.

![image](https://user-images.githubusercontent.com/43203949/225479035-3ed3fbfc-06ce-4d92-86a8-d34402b6ae82.png)

# 6.함수

## 함수

**함수** = **프로시저의 일종으로** 프로그램 내에서 공통으로 반복되는 부분은 메인에서 분리해 선언하는 기능적 단위

![image](https://user-images.githubusercontent.com/43203949/225479051-988fadf6-b154-4e7d-a6b4-266e6a3d3bff.png)

- 프로그램을 작성할 때 프로그램을 기능에 따라 여러 개의 단위로 분해하여 작성하면 쉽게 작성할 수 있고, 수정 및 관리가 쉬워지고, 분리된 단위로 다른 곳에서 재사용이 가능해진다.

# 7. Class

### 구조적 프로그래밍의 단

- 컴퓨터 소프트웨어의 계획-개발-검사-보수-관리 등을 위한 기술과 그것을 연구하는 SW공학분야에서 구조적 방식의 프로그래밍은 함수간의 연관성이 높아져 유지보수가 어려워진다는 단점이 발견되었다.

![image](https://user-images.githubusercontent.com/43203949/225479072-2c16512d-db32-4288-8204-68a28e13cfb8.png)

### 객체지향 프로그래밍

- 하나의 객체는 하나의 역할만 수행하도록 정의하여 객체간 연관성을 줄여 재사용성 및 유지보수비용을 줄인다.
- 객체간의 통신으로 연산을 처리하고 객체간 연관은 없도록 하는 방식.

![image](https://user-images.githubusercontent.com/43203949/225479092-84018514-b0e1-427f-82f2-6465143e63ce.png)

![image](https://user-images.githubusercontent.com/43203949/225479099-cf35db78-08df-4f6c-85df-407f46e4037e.png)

- Object = 단일 책임 = **단일 역할 = 관련된 다수의 기능 + 관련된 다수의 데이터** = 독립적 실행 단위 = Code + Data

![image](https://user-images.githubusercontent.com/43203949/225479115-b6575fa6-279f-4a5e-8166-47532422d3b0.png)

### 객체지향 패러다임의 원리

1. 캡슐화
2. 추상화 : 꼭 필요한 근본적인 특성에 집중하여 여타의 부분이나 상세 내역들을 없애 나가는 과정( 함수 내부를 몰라도 실행해달라고 하면 실행가능한)
3. 다형성(같은이름의(같은 식별자의) method가 있는 경우 매개변수의 개수와 매개변수의 타입 차이가 있다면 다른 기능을 수행할 수 있도록 구현하는 것을 허락함)

함수 = 코드를 묶어서 만든 덩어리 = 함수

배열 = 데이터를 묶어서 만든 덩어리 = 배열

### 객체 = 함수 + 배열

- 자신의 데이터를 사용해 하나의 역할을 수행할 수 있는 독립된 단위
- 객체지향 방법론의 핵심은 바로 객체이다. 모든 관점을 객체라는 단
위로 바라봐야 한다
- 객체 간의 결합도는 낮도록 만들면 좋은 프로그램이다.
- 객체안의 속성과 method의 응집도는 높게 만들수록 좋은 프로그램이다.

## 객체와 클래스의 관계

클래스란 : 객체를 생성하는데 사용되는 틀 

![image](https://user-images.githubusercontent.com/43203949/225479127-b02694c3-1926-439c-9814-ab285ffb8b14.png)

인스턴스 = 실행 가능한(실행된) 객체

### 클래스 정의

![image](https://user-images.githubusercontent.com/43203949/225479140-1fc2521b-6d71-4251-9445-8cfafaffcf70.png)

### 클래스와 인스턴스의 메모리 관계

![image](https://user-images.githubusercontent.com/43203949/225479678-8ba28216-58eb-48f0-8838-855b1e12b14a.png)

![image](https://user-images.githubusercontent.com/43203949/225479707-1178c0a3-9b0e-4537-af64-cd26d09a8a7a.png)

- 속성의 초기화가 필요함 = 생성자의 역할 = 반드시 public, 주소값을 return하도록 정해져 있기 때문에 return값을 지정해주면 안됨. , 클래스명과 메서드명이 동일해야한다.

### 자바의 new

- 일반적인 변수의 경우 {}(brace)가 닫히면 알아서 수거해가는 stack 메모리 영역제 저장하지만 자바의 new를 사용하여 선언한 경우 heap 메모리에 올려준다.
- heap 메모리는 통짜 메모리로 미리 쪼개져 있는 크기가 아니라 마음대로 쓸 수 있도록 할당함 ← 일정한 크기를 사용할 것이라고 정해져있는 기본형 데이터와 다르게 사용자 정의에 떄라 객체의 크기가 다르기 때문에 (메모리를 얼마나 사용할지 확신할 수 없기 때문에) 통짜 메모리를 줄 수 밖에 없다.
- 그래서 new로 메모리를 할당한 경우 메모리 수거하는 과정이 필요하다
- 다만 java는 c보다 쉽게 만들기 위해 여러 기능을 추상화 했기 때문에 딥하게 최적화를 하는 개발자에게는 최적화 명령을 내려도 JVM이 하고싶은 순간에 메모리를 놓아주는 방식이기 때문(그래서 C나 C++이 더 딥한 프로그래머에게 좋은언어임)
- method area는 함수와 같은 코드들이 올라가는 메모리공간이다.(Data공간이 아니라 Code 공간임)

# 8.클래스 설계

### 클래스의 설계

![image](https://user-images.githubusercontent.com/43203949/225852444-28cc585d-d373-4f97-876c-6d498dae6616.png)

### 설계도(UML) 구현방식

1. 객체 추출
2. 객체 모델링(객체 역할을 정의 → Class Digram)
- 유사한 기능을 하는 Class는 같은 부분을 부모 클래스로 만든 후 상속을 통해 재사용성을 높일 수 있다.

@ Override = 부모 클래스의 메소드를 자식 클래스에서 원하는대로 수정할 수 있음 @ = annotation(컴퓨터도 볼 수 있는 주석)

abstract 클래스는 설계를 위한 목적으로 하위 클래스들이 전부 특정 메소드르 가졌으면 좋겠을 때 abstract타입을 지정할 수 있다.

- 사람들이 짜둔 라이브러리도 상속할 수 있다.

# UML

**Unified Modeling Language로 코딩 전 프로그램 설계도 작성시에 사용하는 툴이다.**

## Static

- 변수, 메소드, 클래스 앞에 모두 붙일 수 있다.
- 모든 자식들이 같은 상수 인수를 가지고 만들어질 경우, 메모리낭비이기 때문에 static으로 class하나에만 상수값을 갖도록 할 수 있다. (= 메모리의 효율적 관리가 가능해진다.)
- Static을 부여한 변수 또는 함수 또는 클래스는 new로 메모리 할당하지 않더라도 실행시 static영역에 자동으로 올라간다.

## final

- 변수 , 메소드 , 클래스 앞에 모두 붙일 수 있다.
- 본래의 속성을 못하게 만든다는 뜻을 가진다.(변수앞에 붙이면 변수의 속성(변경가능한 수)를 못하게 만들어 상수로만 사용할 수 있다.
- public과 함께 사용하여 getter없이 읽기 전용으로 변수 , 메소드, 클래스를 만들 때 사용한다.
- ex) **public** **static** **final** **int** ***DUCK_SIZE*** = 50;

## 자바 클래스간의 형변

### 권장 하지 않는 클래스 설계

![image](https://user-images.githubusercontent.com/43203949/225852550-a8afbfaa-87da-4fa0-8871-aca4aa01f267.png)

### 권장하는 클래스 설계

![image](https://user-images.githubusercontent.com/43203949/225852610-9302b3f0-d44b-42fc-bd55-6fba66345932.png)

- sub클래스에 의존하는 코드를 구현하지 말고, super 클래스에 의존하는 코드를 작성해야, 변경에 민감하지 않게 작성할 수 있다.

상속은 2가지의 효과를 위해 사용하게 된다.

1. 코드의 재사용성(sub클래스간의 공통코드를 재활용성)
2. 부모를 통해 모든 자식을 한꺼번에 **제어**하는데 사용한다.
- 이와 같이 부모에 의존하는 코드를 작성하려면(구현하려면) 필요로하는 문법이 **클래스간의 형변환**이라는 기술입니다.

### 각 자식 클래스별로 제어하는 나쁜 코드

![image](https://user-images.githubusercontent.com/43203949/225852685-0ec40d2d-5412-40dc-b7f0-9a9081ed0b8f.png)

### 부모로 제어하는 좋은 코드

![image](https://user-images.githubusercontent.com/43203949/225852736-39742c55-cafe-4a19-9abd-28abf410e980.png)

# 자바 자료형의 형변환

### 기본형

- 메모리상의 값 영역에 **값 자체가 저장**되는 형태
- ex) 8가지(숫자,문자,논리)
    - **논리형을 제외한 7가지형은 모두 서로간의 암묵적,명시적 형변환을 지원**

### 참조형

- 메모리상의 값 영역에 값이 아닌 주소를 다루는 형태
- ex) Class = Custom Type

    ![image](https://user-images.githubusercontent.com/43203949/225852795-b7271cad-ebaa-49dc-8031-4b8c24ef253a.png)
    

참조형(Class)끼리 형변환이 가능한가? = A aobj = new B(); 가 가능한가?

→ 선언시 A타입을 선언했지만 실체는 B instance를 생성 한 것을 Class의 형변환 이라 하는데 이것이 가능한가? 

**일반적으로 불가능하다 → 클래스간의 형변환을 지원하지 않는다.**

**단, 상속관계의 경우는 자식을 한번에 제어하기 위해 허용한다.**

![image](https://user-images.githubusercontent.com/43203949/225852855-1d12dd18-9c98-46f4-b82a-c8abcd8b5a9b.png)

- 다운캐스팅의 경우 cobj.pi는 메모리에 올라가 있으므로 문제없이 수행되지만 cobj.ci는 메모리에 없기 때문에 문제가 발생한다.
- 따라서 다운 캐스팅은 제공하지 않으며, 업캐스팅만 암묵적으로 제공한다
- 업캐스팅 : super(부모) 클래스의 참조변수가 sub(자식) 클래스의 인스턴스를 가르키도록 형을 변환하는 것.
- 업캐스팅이 일어나면 자식에서 확장한 기능은 not visible 상태로 변환되어 부모의 참조변수로 참조 할 수 없다. 부모가 가진(물려준) 함수,변수만 사용가능하다.
- 단, 추상 메소드는 자식에서 재정의하더라도 부모가 부를 수 있습니다. 왜냐하면 super 클래스에서 method body가 선언되어 있지 않기 때문에 자식의 method와 연결해준다.
    - 예외) 단, 다운 캐스팅을 지원하는 경우가 하나 있다. 명시적으로 형변환을 지정하여 다운 캐스팅한다.
    
![image](https://user-images.githubusercontent.com/43203949/225852906-8ada17a5-14b4-47b9-950a-6d50b6f85187.png)
