class Exploration {
    static class Crew { //탐사 대원
        String name;
        String ID;
        Probe[] probes;

        void show() {
            System.out.println("탐사 대원 " +name+ "의 정보:");
            System.out.println();
            System.out.println("소속된 탐사선:");
            for (Probe probe : probes) {
                probe.show();
            }
            System.out.println();
        }


        static class Neil extends Crew{ //Neil의 정보
            Neil(){
                name = "Neil";
                ID = "100A";
                probes = new Probe[] {new Probe.Apollo()};;
            }
        }
    }

    static class Probe {
        String name;
        String model;
        String missions;
        int Power;

        void show() {
            System.out.println("- " + name + " 탐사선");
            System.out.println("\t- 모델: " + model);
            System.out.println("\t- 임무: " + missions);
            System.out.println("\t- 연료 수준: " + Power);
            System.out.println();
        }

        static class Apollo extends Probe {
            Apollo() {
                name = "Apollo";
                model = "Model-X";
                missions = "태양계 탐사";
                Power = 130;
            }
        }

        static class Odyssey extends Probe {
            Odyssey() {
                name = "Odyssey";
                model = "Voyager";
                missions = "외계 생명체 탐사";
                Power = 190;
            }
        }
    }
}
