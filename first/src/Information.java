class Information{
    String astronautName; //탐사원의 이름
    int astronautId; //탐사원 아이디
    int astronautCountSpaceship=0;
    class Spaceship{
        String spaceshipName; //탐사선명
        String spaceshipModel; //모델명
        String spaceshipMission; //임무
        double spaceshipPower=0; //연료양
        int spaceshipBoardingStatus=1;
        //astronautCountSpaceship+=1;
        void spaceshipChargeByNum(double spaceshipChargePower){
            if (spaceshipChargePower+spaceshipPower > 300){
                System.out.println("연료는 300이 넘을 수 없습니다.");
            }
            else{
                spaceshipPower+=spaceshipChargePower;
                System.out.print("현재 연료는 ");
                System.out.print(spaceshipPower);
                System.out.println("입니다.");
            }
        }
        void spaceshipChargeByPercent(double spaceshipChargePower){
            if (spaceshipChargePower+spaceshipPower > 300){
                System.out.println("연료는 300이 넘을 수 없습니다.");
            }
            else{
                spaceshipPower+=(spaceshipPower*(spaceshipChargePower/100));
                System.out.print("현재 연료는 ");
                System.out.print(spaceshipPower);
                System.out.println("입니다.");
            }
        }
        void spaceshipUseByNum(double spaceshipUsePower){
            if (spaceshipPower-spaceshipUsePower < 0){
                System.out.println("연료는 0보다 작을 수 없습니다.");
            }
            else{
                spaceshipPower-=spaceshipUsePower;
                System.out.print("현재 연료는 ");
                System.out.print(spaceshipPower);
                System.out.println("입니다.");
            }
        }
        void spaceshipUseByPercent(double spaceshipUsePower){
            if (spaceshipPower-spaceshipUsePower < 0){
                System.out.println("연료는 0보다 작을 수 없습니다.");
            }
            else{
                spaceshipPower-=(spaceshipPower*(spaceshipUsePower/100));
                System.out.print("현재 연료는 ");
                System.out.print(spaceshipPower);
                System.out.println("입니다.");
            }
        }
        void spaceshipQuit(){
            spaceshipBoardingStatus=0;
        }
        void spaceshipInformationPrint(){
            if (spaceshipBoardingStatus==1){
                System.out.println(" ");
                System.out.println("---------------------------------");
                System.out.print("탐사 대원 ");
                System.out.print(astronautName);
                System.out.println("의 정보: ");
                System.out.println(" ");
                System.out.print("소속된 탐사선:\n- ");
                System.out.print(spaceshipName);
                System.out.println("탐사선");
                System.out.print("\t-모델: ");
                System.out.println(spaceshipModel);
                System.out.print("\t-임무: ");
                System.out.println(spaceshipMission);
                System.out.print("\t-연료 수준: ");
                System.out.println(spaceshipPower);
                System.out.println("---------------------------------");
                System.out.println(" ");
            }
            else{
                System.out.println(" ");
                System.out.println("---------------------------------");
                System.out.print(astronautName);
                System.out.print("(이)는 ");
                System.out.print(spaceshipName);
                System.out.println("에 탑승해 있지 않습니다.");
                System.out.println("---------------------------------");
                System.out.println(" ");
            }
        }
    }
}
