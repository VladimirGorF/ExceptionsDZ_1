// Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
// Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить? 

public class ExceptionDZ_1_1 {
    public static void main(String[] args) {
        System.out.println(method1(new int[10])); // тут помимо превышения границ массива,можно получить ошибку как в
                                                  // method3.
        System.out.println(method2('a', 0)); // здесь помимо деления на 0, можно получить позицию char 'a' в алфавите
        method3(-20, 21); // тут можно помимо создания массива отрицательной длины, еще можно за границы
                          // вылететь
    }

    public static int method1(int[] arr) {
        return arr[11]; // вызов элемента за пределами границ массива
    }

    public static int method2(int a, int b) {
        return a / b; // деление на 0 в типе int
    }

    public static void method3(int a, int b) {
        int[] arr = new int[a]; // создание массива с отрицательным размером длины
        System.out.println(arr[b]);

    }

}
