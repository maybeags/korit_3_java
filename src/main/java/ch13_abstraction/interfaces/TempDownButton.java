package ch13_abstraction.interfaces;

public class TempDownButton extends Button {
    @Override
    public void onPressed() {
        System.out.println("온도를 한 칸 내립니다.");
    }

    @Override
    public void onDown() {
        System.out.println("온도를 계속 내립니다.");
    }
}
