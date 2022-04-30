public class Homework2 {
    public static void main (String [] args) {

        stringAmount(5,10);
        compareNumbers(0);
        festNumber(5);
        nameString("Hello", 5);
        numberYear(2020);

    }


//    1. Написать метод, принимающий на вход два целых числа и проверяющий,
//    что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true,
//    в противном случае – false.
    public static boolean stringAmount(int a, int b){
        return  10 <= a + b && a + b <= 20;
    }



//   2. Написать метод, которому в качестве параметра передается целое число,
//    метод должен напечатать в консоль, положительное ли число передали или отрицательное.
//    Замечание: ноль считаем положительным числом.
    public static void compareNumbers(int a) {
        if (a>=0) {
            System.out.println("Число a положительное");
        }
        else { System.out.println("Число a отрицательное");
        }
    }



//   3. Написать метод, которому в качестве параметра передается целое число.
//    Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
    public static boolean festNumber(int i) {
        return i<0;
    }



//  4. Написать метод, которому в качестве аргументов передается строка и число,
//    метод должен отпечатать в консоль указанную строку, указанное количество раз;
    public  static void nameString (String name, int value) {
        for (int i = 0; i < value; i++) {
            System.out.println(name);
        }
    }

//    5.Написать метод, который определяет, является ли год високосным,
//    и возвращает boolean (високосный - true, не високосный - false).
//    Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    public static boolean numberYear(int year) {
        return (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
    }


}





