package javaBasic;

public class DataTypes {
    public static void main(String[] args) {
//        boolean: хранит значение true или false
        boolean isActive = false;
        boolean isAlive = true;
//        byte: хранит целое число от -128 до 127 и занимает 1 байт
        byte a = 3;
        byte b = 8;
//        short: хранит целое число от -32768 до 32767 и занимает 2 байта
        short c = 3;
        short d = 8;
//        int: хранит целое число от -2147483648 до 2147483647 и занимает 4 байта
        int e = 4;
        int f = 9;
//        long: хранит целое число от –9 223 372 036 854 775 808 до 9 223 372 036 854 775 807 и занимает 8 байт
        long g = 5;
        long i = 10;
//        double: хранит число с плавающей точкой от ±4.9*10-324 до ±1.7976931348623157*10308 и занимает 8 байт
        double k = 8.5;
        double l = 2.7;
//        float: хранит число с плавающей точкой от -3.4*1038 до 3.4*1038 и занимает 4 байта
        float m = 8.5F;
        float n = 2.7F;
//        char: хранит одиночный символ в кодировке UTF-16 и занимает 2 байта, поэтому диапазон хранимых значений от 0 до 65535
        char o = 31232;

        String text = "Вот мысль, которой весь я предан,\n"+
                "Итог всего, что ум скопил.\n"+
                "Лишь тот, кем бой за жизнь изведан,\n"+
                "Жизнь и свободу заслужил.";
        System.out.println(text);


        String name = "Tom";
        int age = 30;
        float height = 1.7f;

        System.out.printf("Name: %s  Age: %d  Height: %.2f \n", name, age, height);
    }
}
