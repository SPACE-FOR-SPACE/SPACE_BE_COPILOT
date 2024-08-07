public class Crew {
    private String name; //탐사대원의 이름

    public Crew(String name){
        this.name=name;
    }

    public void setName(String newName){
        this.name=newName;
    }

    public String getName(){
        return this.name;
    }
}
