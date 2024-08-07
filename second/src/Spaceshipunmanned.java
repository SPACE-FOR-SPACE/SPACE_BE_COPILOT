public class Spaceshipunmanned extends Information {

    Spaceshipunmanned(String informationName){
        super(informationName);
    }

    //탐사선의 정보를 출력하는 메소드
    //탐서선 이름, 유인인지 무인인지, 탑승한 탐사 대원들의 이름 출력
    void spaceshipPrintInformation(){
        System.out.println("\n--------------------------------------\n");
        System.out.println("탐사선 정보:");
        System.out.println("\t- 이름: "+informationName);
        System.out.println("\t- 종류: 무인 탐사선");
        System.out.println("\t- 탐사 대원: 없음");
        System.out.println("\n--------------------------------------\n");
    }
}