import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<Integer>();

        MyList<Integer> listInteger1 = new MyList<Integer>(10);
        //Thêm phần tử
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(4);
        listInteger.add(5);
        listInteger.add(6);
        //Hiển thị phần tử
        System.out.println("Array include: ");
        for (int i = 0; i < listInteger.size(); i++) {
            System.out.print(listInteger.get(i) + "\t");
        }
        System.out.println("");
        //Xóa phần tử đầu tiên
        listInteger.remove(0);
        //Hiển thị phần tử
        System.out.println("Array include: ");
        for (int i = 0; i < listInteger.size(); i++) {
            System.out.print(listInteger.get(i) + "\t");
        }
        System.out.println("");
        //Hiển thị kích cỡ mảng
        System.out.println("Size of array: " + listInteger.size());
        //Kiểm tra phần tử nếu có trả về true
        System.out.println(listInteger.contains(10));
        //Trả về vị trị của giá trị đã cho
        System.out.println(listInteger.indexOf(5));//Ví dụ mảng bao gồm 2 3 4 5 6 thì giá trị 5 nằm ở ví trị số 3
        //Thêm 1 phẩn tử
        listInteger.add(10);
        //Hiển thị phần tử
        System.out.println("Array include: ");
        for (int i = 0; i < listInteger.size(); i++) {
            System.out.print(listInteger.get(i) + "\t");
        }
        //Xóa sạch phần tử
        System.out.println("");
        listInteger.clear();
        //Hiển thị phần tử
        System.out.println("Array include: ");
        for (int i = 0; i < listInteger.size(); i++) {
            System.out.print(listInteger.size());
        }
        //Clone 1 list
//        MyList<Integer> myList = (MyList<Integer>) listInteger.cloneObject();
//        myList.add(5);
//        System.out.println("Array clone include: ");
//        for (int i = 0; i < myList.size(); i++) {
//            System.out.print(myList.get(i) + "\t");
//        }

    }
}
