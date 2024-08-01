import java.util.ArrayList;
import java.util.List;

public class Spaceship {
    private String spaceshipName; //탐사선이름
    private String spaceshipHumanStatus; //탐사선이 무인인지 유인인지
    private List<Astronaut> astronauts = new ArrayList<>(); //탑승한 탐사 대원 리스트

    Spaceship(){}

    Spaceship(String spaceshipName, String spaceshipHumanStatus){
        this.spaceshipName = spaceshipName;
        this.spaceshipHumanStatus = spaceshipHumanStatus;
    }

    //탐사선 이름을 입력받는 메소드
    void setSpaceshipName(String spaceshipName){
        this.spaceshipName = spaceshipName;
    }

    //탐사선이 유인인지 무인인지 입력받는 메소드
    void setSpaceshipHumanStatus(String spaceshipHumanStatus){
        this.spaceshipHumanStatus = spaceshipHumanStatus;
    }

    //탐사대원을 추가하는 메소드
    //무인일 경우 탑승불가
    void addAstronaut(Astronaut astronaut){
        if (spaceshipHumanStatus.equals("manned")){
            this.astronauts.add(astronaut);
        }
        else{
            System.out.println("\n--------------------------------------\n");
            System.out.println("선택하신 탐사선 "+spaceshipName+"은 무인 탐사선 입니다.");
            System.out.println("무인 탐사선에는 탐사 대원이 탑승할 수 없습니다.");
            System.out.println("\n--------------------------------------\n");
        }
    }

    //탐사대원이 탐사선에서 내릴 수 있게 만드는 메소드
    void removeAstronaut(Astronaut astronaut){
        this.astronauts.remove(astronaut);
    }

    //탐사선의 정보를 출력하는 메소드
    //탐서선 이름, 유인인지 무인인지, 탑승한 탐사 대원들의 이름 출력
    void spaceshipPrintInformation(){
        System.out.println("\n--------------------------------------\n");
        System.out.println("탐사전 정보:");
        System.out.println("\t- 이름: "+spaceshipName);
        if (spaceshipHumanStatus.equals("manned")){
            System.out.println("\t- 종류: 유인 탐사선");
            System.out.println("\t- 탐사 대원: ");
            for (Astronaut astronaut : astronauts){
                System.out.print("\t\t- 탐사 대원: ");
                astronaut.getAstronautName();
            }
        }
        else{
            System.out.println("\t- 종류: 무인 탐사선");
            System.out.println("\t- 탐사 대원: 없음");
        }
        System.out.println("\n--------------------------------------\n");
    }
}
