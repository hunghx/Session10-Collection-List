import java.util.*;

public class Main {
    public static void main(String[] args) {
        // arrayList
        List<String> arrString = new ArrayList<>();
        // thêm mới
        arrString.add("hùng");
        arrString.add("nam");
        arrString.add("khánh")
        ;
        List<String> arrString1 = new ArrayList<>();
        // thêm mới
        arrString1.add("hùng");
        arrString1.add("nam");
        arrString1.add("khánh");
        System.out.println(arrString.equals(arrString1));
        System.out.println(arrString);
        // chỉnh sửa
        arrString.set(1,"Nam ok");
        System.out.println(arrString);
        // xóa : có 2 cách
        arrString.remove(1);
        System.out.println(arrString);
        arrString.remove("khánh");
        System.out.println(arrString);
        System.out.println(arrString.get(0));
        System.out.println(arrString.indexOf("hùngg"));

        // tìm kiếm

        // linkedList
        LinkedList<Integer> arrInt = new LinkedList<>();
        // thêm mowis
        arrInt.add(5);
        arrInt.add(10);
        arrInt.add(15);
        // thêm mới theo vị trí
        arrInt.add(1,100);
        System.out.println(arrInt);
        // xóa : 2 cách xóa
        arrInt.remove(1);
        arrInt.remove(Integer.valueOf(15));
        System.out.println(arrInt);
        // sửa
        arrInt.set(0,1000);
        System.out.println(arrInt);
        // lấy ra giá trị theo vị trí
        System.out.println(arrInt.get(0));
        //xóa tất cả

        arrString.clear();
        arrInt.clear();
        System.out.println(arrString);
        System.out.println(arrInt);
    }
}