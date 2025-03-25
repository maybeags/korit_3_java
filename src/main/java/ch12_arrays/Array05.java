package ch12_arrays;
/*
    String[] scores = { "A", "B", "C", "D", "F" };
    를 선언하고 반복문을 작성해서
    scores 배열의 결과가 { "A+", "B+", "C+", "D+", "F+" }
    가 되도록 한 후,
    실행 예
    점수 : A+ B+ C+ D+ F+
    가 되도록 코드를 작성하시오.
    main에서만 쓰시면 됩니다.
 */
public class Array05 {

    public static void main(String[] args) {
//        String[] scores = { "A", "B", "C", "D", "F" };
//
//        for (int i = 0 ; i < scores.length ; i++) {
//            scores[i] += "+";
//            System.out.print(scores[i] + " ");
//        }

//        int[] scores2 = { 100, 90, 80, 70, 60, 20, 88, 52, 25, 37, 1, 0 };
//        // 총합과 평균을 계산해서 다음과 같이 출력하시오.
//        // 총점 : 뭐 몇점
//        // 평균 : 뭐 몇점(주의할 점 : double 형변환을 사용할 것)
//
//        int sum = 0;
//        double avg = 0;
//        for (int i = 0 ; i < scores2.length ; i++) {
//            sum += scores2[i];
//        }
//        System.out.println("총점 : " + sum);
//        avg = (double)sum/scores2.length;
//        System.out.println("평균 : " + avg);

        int[] scores3 = { 88, 94, 77, 100, 64, 32, 95, 82, 59 };
        // 합과 평균구하기도 할거고
        // 90 이상은 A
        // 80 이상은 B
        // 70 이상은 C
        // 60 이상은 D
        // 59 이하는 F

        //A가 몇명인지 B가 몇명인 ... F가 몇명인지도 출력해야합니다.

        // 실행 예
        /*
            총합 : 몇점
            평균 : 몇점
            A 학생 수 : 몇명
            B 학생 수 : 몇명
            C 학생 수 : 몇명
            D 학생 수 : 몇명
            F 학생 수 : 몇명
         */

    }
}
