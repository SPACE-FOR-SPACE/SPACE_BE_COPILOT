public class Main {
    public static void main(String[] args) {
        Spaceship ship1 = new Spaceship("bssm", SpaceshipType.MANNED);
        Spaceship ship2 = new Spaceship("qwerty", SpaceshipType.UNMANNED);
        Crew crew1 = new Crew("sseunyang");
        Crew crew2 = new Crew("racoon");
        ship1.joinCrew(crew1);
        ship1.joinCrew(crew2);
        crew2.setName("raccoon");
        ship1.showSpaceship();
        ship2.joinCrew(crew2);
        ship1.quitCrew(crew2);
        ship2.setName("wasd");
        ship2.showSpaceship();
    }
}