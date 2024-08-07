import java.util.ArrayList;

public class MannedShip extends Spaceship{

    private ArrayList<Crew> crew; //탐사대원

    public MannedShip(String name) {
        super(name);
        this.crew =  new ArrayList<>();
    }

    public void joinCrew(Crew crew){
        this.crew.add(crew);
    }

    public void quitCrew(Crew crew){
        if(this.crew.contains(crew)){
            this.crew.remove(crew);
        } else {
            System.out.println("해당 우주선에 " + crew.getName() + " 탐사선이 존재하지 않습니다.\n");
        }
    }

    public void showSpaceship(){
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
