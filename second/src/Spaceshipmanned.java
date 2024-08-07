import java.util.ArrayList;
import java.util.List;

public class Spaceshipmanned extends Information {
    private List<Astronaut> astronauts = new ArrayList<>(); //탑승한 탐사 대원 리스트

    Spaceshipmanned(String informationName){
        super(informationName);
    }

    //탐사대원을 추가하는 메소드
    void addAstronaut(Astronaut astronaut){
        this.astronauts.add(astronaut);
    }

    //탐사대원이 탐사선에서 내릴 수 있게 만드는 메소드
    void removeAstronaut(Astronaut astronaut){
        this.astronauts.remove(astronaut);
    }

    //탐사선의 정보를 출력하는 메소드
    //탐서선 이름, 유인인지 무인인지, 탑승한 탐사 대원들의 이름 출력
    void spaceshipPrintInformation(){
        System.out.println("\n--------------------------------------\n");
        System.out.println("탐사선 정보:");
        System.out.println("\t- 이름: "+informationName);
        System.out.println("\t- 종류: 유인 탐사선");
        System.out.println("\t- 탐사 대원: ");
        for (Astronaut astronaut : astronauts) {
            System.out.print("\t\t- ");
            astronaut.getName();
        }
        System.out.println("\n--------------------------------------\n");
    }
}
