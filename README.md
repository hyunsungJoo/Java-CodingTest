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


## 🛠 ArrayList 주요 함수(메서드) 정리

### `ArrayList<E>()`
- 가변 크기의 배열을 생성하는 클래스

```java
ArrayList<Integer> list = new ArrayList<>();
add(E e)
리스트의 마지막에 요소 추가

java
코드 복사
list.add(10);
add(int index, E e)
지정한 위치에 요소 추가

java
코드 복사
list.add(0, 5);
get(int index)
지정한 인덱스의 요소 반환

java
코드 복사
int value = list.get(0);
size()
리스트에 저장된 요소 개수 반환

java
코드 복사
int size = list.size();
contains(Object o)
리스트에 특정 값이 존재하는지 확인

java
코드 복사
if (list.contains(42)) {
    System.out.println("존재함");
}
remove(int index)
지정한 인덱스의 요소 삭제

java
코드 복사
list.remove(0);
remove(Object o)
지정한 값을 삭제 (첫 번째로 발견된 요소)

java
코드 복사
list.remove(Integer.valueOf(10));
clear()
리스트의 모든 요소 삭제

java
코드 복사
list.clear();
isEmpty()
리스트가 비어 있는지 확인

java
코드 복사
if (list.isEmpty()) {
    System.out.println("비어 있음");
}
set(int index, E e)
지정한 인덱스의 값을 변경

java
코드 복사
list.set(0, 99);
indexOf(Object o)
특정 값의 첫 번째 인덱스 반환

값이 없으면 -1 반환

java
코드 복사
int idx = list.indexOf(42);
toString()
리스트 내용을 문자열 형태로 반환

java
코드 복사
System.out.println(list.toString());
