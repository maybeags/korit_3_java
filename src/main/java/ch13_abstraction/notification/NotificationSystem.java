package ch13_abstraction.notification;
/*
    추상 클래스 : NotificationSystem
    서브 클래스 : EmailNotification / SMSNotification
    1. 추상 클래스는 공통된 필드를 가집니다.
        1) String sender : 알림 발신자
        2) String recipient : 알람 수신자
        3) String message : 알람 메시지
        4) int priority : 알람 우선순위(1-5 범위)
        5) AllArgsConstructor로 생성자 생성


    2. 다음과 같은 메서드를 가집니다.
        void pirntNotificationInfo() : 알람 정보 출력
            실행 예
            [ 알림 정보 ]
            From : admin@test.com
            To : user@example.com
            Message : 가입을 축하합니다!
            Priority : 2

        void updateMessage(String newMessage) : 메시지 수정
            실행 예
            updateMessage("가입 승인"); 으로 호출했을 때
            '가입 대기'가 '가입 승인'으로 변경되었습니다!
        priority 관련 setter / getter
            setPriority에서 주의할 점 :
                1 ~5의 범위를 가집니다. 내부에 로직을 작성할 필요가 있겠죠

        추상 메서드
        void send() : 알람 전송
        void validateRecipient() : 수신자 유효성 검증
        void formatMessage() : 메시지 포맷 처리
 */
public class NotificationSystem {
}
