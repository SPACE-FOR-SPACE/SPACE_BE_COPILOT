//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Resource resource = new Resource();
        Creature creature = new Creature();
        resource.add("식량", "100");
        resource.add("물", "1000");
        resource.use("식량", "100");
        resource.show();

        creature.add("Zeta", "온순한 외계 생명체");
        creature.add("Zeta", "주로 물 근처에 서식");
        creature.add("Alpha", "공격적인 외계 생명체");
        creature.show();
        creature.show("Zeta");
    }
}