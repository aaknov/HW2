public class Homework2 {
    public static void main (String [] args) {

        stringAmount(5,10);
        compareNumbers(0);
        festNumber(5);
        nameString("Hello", 5);
        numberYear(2020);

    }


//    1. �������� �����, ����������� �� ���� ��� ����� ����� � �����������,
//    ��� �� ����� ����� � �������� �� 10 �� 20 (������������), ���� �� � ������� true,
//    � ��������� ������ � false.
    public static boolean stringAmount(int a, int b){
        return  10 <= a + b && a + b <= 20;
    }



//   2. �������� �����, �������� � �������� ��������� ���������� ����� �����,
//    ����� ������ ���������� � �������, ������������� �� ����� �������� ��� �������������.
//    ���������: ���� ������� ������������� ������.
    public static void compareNumbers(int a) {
        if (a>=0) {
            System.out.println("����� a �������������");
        }
        else { System.out.println("����� a �������������");
        }
    }



//   3. �������� �����, �������� � �������� ��������� ���������� ����� �����.
//    ����� ������ ������� true, ���� ����� �������������, � ������� false ���� �������������.
    public static boolean festNumber(int i) {
        return i<0;
    }



//  4. �������� �����, �������� � �������� ���������� ���������� ������ � �����,
//    ����� ������ ���������� � ������� ��������� ������, ��������� ���������� ���;
    public  static void nameString (String name, int value) {
        for (int i = 0; i < value; i++) {
            System.out.println(name);
        }
    }

//    5.�������� �����, ������� ����������, �������� �� ��� ����������,
//    � ���������� boolean (���������� - true, �� ���������� - false).
//    ������ 4-� ��� �������� ����������, ����� ������� 100-��, ��� ���� ������ 400-� � ����������.
    public static boolean numberYear(int year) {
        return (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
    }


}





