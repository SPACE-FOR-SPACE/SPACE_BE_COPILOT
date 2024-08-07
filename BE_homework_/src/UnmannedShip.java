import java.util.ArrayList;

public class UnmannedShip extends Spaceship{
    public UnmannedShip(String name) {
        super(name);
    }
    public void showSpaceship(){
        System.out.println("우주선 속 탐사대원이 존재하지 않습니다.\n");
    }
}
