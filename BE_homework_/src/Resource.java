import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public class Resource implements ManageSystem {
    private Map<String, Integer> items=new HashMap<>();

    public void add(String name, String amount){ //자원 추가
        int amountValue = Integer.parseInt(amount);

        System.out.println("자원 관리 시스템 - 자원 추가 후 상태:");

        if(items.containsKey(name)){
            items.put(name, items.get(name)+amountValue);
        } else {
            items.put(name, amountValue);
        }
        get();
    }



    public void use(String name, String amount){ //자원 사용
        int amountValue = Integer.parseInt(amount);

        System.out.println("자원 관리 시스템 - 자원 사용 후 상태:");

        if(!items.containsKey(name)){ //아이템에 자원 키가 없을 때 예외발생
            throw new NoSuchElementException("자원을 찾을 수 없습니다.");
        }

        if(items.get(name)-amountValue<0){ //자원이 부족할 때 예외발생
            throw new IllegalArgumentException("자원이 부족합니다.");
        }

        if(items.get(name)==0){ //자원의 갯수가 없으면 없애기
            items.remove(name);
        }

        items.put(name, items.get(name)-amountValue);

        get();
    }

    public void show(){
        System.out.println("자원 관리 시스템 - 자원 조회:");
        get();
    }

    public void get(){
        for(String key : items.keySet()){
            System.out.println("\t\t - " + key + ": " + items.get(key));
        }
        System.out.println();
    }
}
