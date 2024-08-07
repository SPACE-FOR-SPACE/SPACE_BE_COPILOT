import java.util.ArrayList;


public class Spaceship {
    private String name; //탐사선의 이름

    public Spaceship(String name){
        this.name=name;
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public void showSpaceship(){
        System.out.println("Spaceship: " + getName());
    }

}
