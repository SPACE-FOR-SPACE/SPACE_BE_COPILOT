import java.util.ArrayList;

public class Spaceship {
    private String name; //탐사선의 이름
    private final boolean isManned; // 유인/무인
    private ArrayList<Crew> crew; //탐사대원

    public Spaceship(String name, boolean isManned){
        this.name=name;
        this.isManned=isManned;
        this.crew=new ArrayList<>();
    }

    public void setName(String newName){
        this.name=newName;
    }

    public void joinCrew(Crew crew){
        if(this.isManned){
            this.crew.add(crew);
        } else {
            System.out.println("무인 탐사선에 탑승할 수 없습니다.\n");
        }
    }

    public void quitCrew(Crew crew){
        if(this.crew.contains(crew)){
            this.crew.remove(crew);
        } else {
            System.out.println("해당 우주선에 " + crew.getName() + " 탐사선이 존재하지 않습니다.\n");
        }
    }

    public void showSpaceship(){
        System.out.println("Spaceship: " + this.name);
        if(this.crew.isEmpty()){
            System.out.println("우주선 속 탐사대원이 존재하지 않습니다.\n");
        } else {
            for(Crew crewName : this.crew){
                System.out.print(crewName.getName()+" ");
            }
            System.out.println("우주대원이 탐사중입니다.\n");
        }
    }
}
