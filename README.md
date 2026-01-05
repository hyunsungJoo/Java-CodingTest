# Java-CodingTest

26/01/01
- 2292, 2798(26/01/04 완)

26/01/04
- 2798(o)

26/01/05
- 2675(x)

## 🛠 사용한 함수(메서드) 정리

### `nextInt()`
- 정수형 입력을 받기 위한 메서드

```java
int R = sc.nextInt();
next()
공백 기준으로 문자열을 입력받는 메서드

java
코드 복사
String S = sc.next();
length()
문자열의 길이를 반환하는 메서드

java
코드 복사
int len = S.length();
charAt(int index)
문자열의 index번째 문자를 반환하는 메서드

인덱스는 0부터 시작

java
코드 복사
char ch = S.charAt(0);
StringBuilder
문자열을 효율적으로 이어 붙이기 위한 클래스

java
코드 복사
StringBuilder sb = new StringBuilder();
append(char c)
StringBuilder에 문자 또는 문자열을 추가하는 메서드

java
코드 복사
sb.append(ch);
toString()
StringBuilder의 내용을 String으로 변환하는 메서드

java
코드 복사
String result = sb.toString();

