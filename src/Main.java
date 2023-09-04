public class Main {
    public static void main(String[] args) {

        System.out.println(sibir(20, 12));
        System.out.println(sibir(0, 30));
        System.out.println(sibir(14, 23));
        System.out.println(sibir(66, -10));
        System.out.println(sibir(25, 15));

        System.out.println("");

        System.out.println("ДЗ НА СООБРАЗИТЕЛЬНОСТЬ");
        System.out.println(sibir(generateRandomAge(),10));
    }
    public static String sibir( int age, int temperature){
        if ((age >= 20 && age <= 45) && (temperature >= -20 && temperature <= 30 )) {
            return "Можно идти гулять.";
        } else if (age < 20 && (temperature >= 0 && temperature <= 28)) {
            return "Можно идти гулять.";
        } else if (age > 45 && (temperature > -10 && temperature < 25)){
            return "Можно идти гулять.";
        } else {
            return "Оставайся дома.";
        }
    }

    // НА СООБРАЗИТЕЛЬНОСТЬ
    public static int generateRandomAge() {
        int randomAge = (int) (Math.random() * 100);
        return randomAge;
    }

}