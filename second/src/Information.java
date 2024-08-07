public class Information {
    String informationName;

    Information (String informationName){
        this.informationName=informationName;
    }

    void getName(){
        System.out.println(informationName);
    }

    void setName(String informationName){
        this.informationName = informationName;
    }
}