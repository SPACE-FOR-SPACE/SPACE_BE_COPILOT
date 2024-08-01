public class Astronaut {
    private String astronautName; //탐사 대원 이름

    Astronaut (String astronautName){
        this.astronautName = astronautName;
    }

    Astronaut(){}

    void setAstronautName(String astronautName){
        this.astronautName = astronautName;
    }

    void getAstronautName(){
        System.out.println(astronautName);
    }

}
