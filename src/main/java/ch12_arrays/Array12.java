package ch12_arrays;
/*
    여태까지 배운 Java 클래스
    String
    Scanner
    Arrays
    Integer
    Double
    Comparator
    Random
    방금 배운거
    Math

    지시 사항
    배열 이름은 numbers[]

    1. index가 10개인 빈 배열을 만들고, Math.random()을 활용하여 값을 넣을겁니다.
        : 1 이상 10 이하의 int 값으로 만들어서.

    2. 1을 끝내게 되면 numbers 배열 안에는 1 ~ 10의 element를 가지게 될겁니다(중복)
        1) 배열 전체 출력 -> Arrays를 사용하면 되겠지만
        2) 각 요소에 10씩 곱해서 한 줄에 출력 -> element별로 뽑아내서 연산
    3. 해당 배열의 합의 크기를 구할 것
        (랜덤으로 element 집어넣으니까 실행할때마다 값이 다를 예정)
    4. 짝수만 출력해서 합을 구할 것

    5. 배열을 오름 차순으로 정렬해서 출력
    6. 내림 차순으로 정렬해서 출력
 */
public class Array12 {

    public static void main(String[] args) {
        // Math 클래스를 사용한 임의의 실수 대입
        double a = Math.random();   // 0.0초과 1.0미만의 난수 생성해서 반환
        System.out.println(a);
    }


}
