import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Exploration.Crew.Neil neil = new Exploration.Crew.Neil();
        Exploration.Probe.Apollo apollo = new Exploration.Probe.Apollo();
        Exploration.Probe.Odyssey odyssey = new Exploration.Probe.Odyssey();
        Main main = new Main();
        int chargePower = 30;
        int usePower = 100;
        main.joinProbe(neil, odyssey);
        main.showProbe(apollo);
        main.chargeProbe(chargePower, apollo);
        main.useProbe(usePower, apollo);
        main.showCrew(neil);
        main.quitProbe(neil, odyssey);
    }

    void showCrew(Exploration.Crew.Neil crew){
        crew.show();
    }
    void showProbe(Exploration.Probe.Apollo probe){
        probe.show();
    }
    void chargeProbe(int chargePower, Exploration.Probe.Apollo probe) {
        if (probe.Power >= 300) {
            System.out.println("충전할 수 없습니다.");
        }
        else {
            probe.Power += chargePower;
            if (probe.Power > 300) {
                System.out.println("더 이상 충전할 수 없습니다.");
                probe.Power = 300;
            }
        }
    }
    void useProbe(int usePower, Exploration.Probe.Apollo probe){
        if (probe.Power <= 0) {
            System.out.println("소모할 수 없습니다.");
        }
        else{
            probe.Power-=usePower;
            if(probe.Power < 0){
                System.out.println("더 이상 소모할 수 없습니다.");
                probe.Power = 0;
            }
        }
    }
    void joinProbe(Exploration.Crew.Neil crew, Exploration.Probe.Odyssey probe){
        Exploration.Probe[] probesCopy = Arrays.copyOf(crew.probes, crew.probes.length+1);
        probesCopy[crew.probes.length]=probe;
        crew.probes=probesCopy;
    }
    void quitProbe(Exploration.Crew.Neil crew, Exploration.Probe.Odyssey probe){
        ArrayList<Exploration.Probe> dynamicArray = new ArrayList<>(Arrays.asList(crew.probes));
        dynamicArray.remove(probe);
        crew.probes = dynamicArray.toArray(new Exploration.Probe[0]);
    }
}
