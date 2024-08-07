public class Main {
    public static void main(String[] args) {
        Spaceshipmanned sp1 = new Spaceshipmanned("Apollo");
        Spaceshipunmanned sp2 = new Spaceshipunmanned("Odyssey");

        Astronaut as1 = new Astronaut("Hello");
        Astronaut as2 = new Astronaut("Bye");

        //탐사선 이름 수정하기
        sp1.setName("apollo");
        sp2.setName("odyssey");

        //탐사 대원 이름 수정하기
        as1.setName("hello");
        as2.setName("bye");

        //탐사 대원 탐사선에 탑승
        sp1.addAstronaut(as1);
        sp1.addAstronaut(as2);

        //탐사선 정보 출력
        sp1.spaceshipPrintInformation();
        sp2.spaceshipPrintInformation();

        //탐사 대원 탐사선에서 내리기
        sp1.removeAstronaut(as1);

        //탐사 대원이 탐사선에서 내리면 탐사 대원 목록에서 사라진다.
        sp1.spaceshipPrintInformation();
    }
}