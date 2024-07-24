public class Main {
    public static void main(String[] args) {
        Information in1 = new Information();
        in1.astronautId=1108;
        in1.astronautName="가은";

        //Information.Spaceship [] spaceshipCount = new Information.Spaceship[100];
        Information.Spaceship sp1 = in1.new Spaceship();
        //spaceshipCount[in1.astronautCountSpaceship-1]=sp1;
        sp1.spaceshipName="Apollo";
        sp1.spaceshipModel="Model-X";
        sp1.spaceshipMission="태양계 탐사";
        sp1.spaceshipPower=200;
        sp1.spaceshipChargeByPercent(10);
        sp1.spaceshipChargeByNum(100);
        sp1.spaceshipUseByPercent(10);
        sp1.spaceshipUseByNum(100);
        sp1.spaceshipInformationPrint();
        sp1.spaceshipQuit();
        sp1.spaceshipInformationPrint();
    }
}

//예시에는 타려는 모든 탐사선에 대한 정보를 같이 출력할 수 있게 되어있어서 
//class 담는 배열을 만들고 거기에 인덱스 값을 담을 변수를 information 클래스에 만들었어요.
//그리고 spaceship 클래스가 시작될때 마다 +1 되게 만들었는데 
//계속 이 부분에서 에러가 나는데 왜 그런지 잘모르겠어요. 
//또 인텔리제이에서 코드 작성하면 연료 충전하고 사용하는 부분의 함수의 매개변수에 
//노란줄이 생기는데 실행은 되지만 왜 여기도 이렇게 되어있는지 잘 모르겠습니다.
//실행하는데 문제는 없지만 왜 이런지 알고싶어요.