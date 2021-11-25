package Gun29;

import java.util.HashMap;
import java.util.Map;

public class _01_JavaMap {
    public static void main(String[] args) {
        // Maps
        // Maps ailesinden HashMap tanımlandı.

        Map<Integer, Integer> m =new HashMap<>(); // Key i ve value si INTEGER olan bir MAP tanımladım.
        m.put(2,11); // 2 KEY ine 11 atandı
        m.put(3,12);
        m.put(6,13);
        m.put(2,14); // 2 anahtarındaki değer güncellendi

        System.out.println("m.get(2) = " + m.get(2)); // 2 anahtarındaki değer alındı. m.get(2) = 14
        System.out.println("m.keySet() = " + m.keySet()); // anahtar listesi m.keySet() = [2, 3, 6]
        System.out.println("m.values() = " + m.values()); // m.values() = [14, 12, 13]
        System.out.println("m = " + m); // m = {2=14, 3=12, 6=13}
        
        //2. Yöntemler
        for (Integer ky: m.keySet() ) {
            System.out.println("ky = " + ky); // ky = 2 ky = 3 ky = 4
        }
        for (Integer vl: m.values() ) {
            System.out.println("vl = " + vl); // vl = 14 vl = 12 vl = 13
        }
        for (Map.Entry<Integer,Integer> anahtarValue : m.entrySet()  ) {
            System.out.println("anahtarValue.getKey() = " + anahtarValue.getKey()); // Bu anahtarı veriyor
            System.out.println("anahtarValue.getValue() = " + anahtarValue.getValue()); // Bu ise değeri veriyor
        }

        boolean buAnahtarVarMi=m.containsKey(2); // 2 anahtarı var mı?
        boolean buDegerVarMi=m.containsValue(12); // 12 değeri var mı?

        System.out.println("buAnahtarVarMi = " + buAnahtarVarMi);
        System.out.println("buDegerVarMi = " + buDegerVarMi);

        m.remove(2);
        System.out.println("remove(2) den sonra m = " + m);

        m.clear();
        System.out.println("clear den sonra m = " + m);

    }
}
//        m.get(2) = 14
//        m.keySet() = [2, 3, 6]
//        m.values() = [14, 12, 13]
//        m = {2=14, 3=12, 6=13}
//        ky = 2
//        ky = 3
//        ky = 6
//        vl = 14
//        vl = 12
//        vl = 13
//        anahtarValue.getKey() = 2
//        anahtarValue.getValue() = 14
//        anahtarValue.getKey() = 3
//        anahtarValue.getValue() = 12
//        anahtarValue.getKey() = 6
//        anahtarValue.getValue() = 13
//        buAnahtarVarMi = true
//        buDegerVarMi = true
//        remove(2) den sonra m = {3=12, 6=13}
//        clear den sonra m = {}

