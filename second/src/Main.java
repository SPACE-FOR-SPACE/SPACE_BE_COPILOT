public class Main {
    public static void main(String[] args) {
        Spaceship sp1 = new Spaceship("Apollo","manned");
        Spaceship sp2 = new Spaceship();

        sp2.setSpaceshipName("Odyssey");
        sp2.setSpaceshipHumanStatus("unmanned");

        Astronaut as1 = new Astronaut("Hello");
        Astronaut as2 = new Astronaut();

        as2.setAstronautName("Bye");
        //이름을 새로 입력하면 가장 최근에 입력된 이름으로 변경된다.
        as2.setAstronautName("GoodBye");

        //유인 탐사선 sp1 에 탐사대원을 탑승시킨다.
        sp1.addAstronaut(as1);
        sp1.addAstronaut(as2);
        sp1.spaceshipPrintInformation();

        //무인탐사선에는 탐사대원이 탑승 불가
        sp2.addAstronaut(as1);
        sp2.spaceshipPrintInformation();

        //탐사대원이 탐사선에서 내린다.
        sp1.removeAstronaut(as1);
        //내린 탐사대원의 이름은 출력결과에서 사라진다.
        sp1.spaceshipPrintInformation();

    }
}