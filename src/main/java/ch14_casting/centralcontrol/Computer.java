package ch14_casting.centralcontrol;

public class Computer implements Power {
    @Override
    public void on() {
        System.out.println("컴퓨터의 전원을 켭니다.");
    }

    @Override
    public void off() {
        System.out.println("컴퓨터의 전원을 끕니다.");
    }
}

//LED 클래스를 생성하고 Power를 상속받아서 동일하게 작성하시오.
//Mouse 클래스를 생성하고 Power를 상속받아서 동일하게 작성하시오.
