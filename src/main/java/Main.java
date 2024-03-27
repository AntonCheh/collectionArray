import java.util.Arrays;

public class Main {
   static String text = "Учитесь так- словно вы постоянно ощущаете нехватку своих знаний-и так- " +
            "словно вы постоянно боитесь растерять свои знания.";
   static int [] numbers = {15,18,9,1,2,-15};

    public static void main(String[] args) {


         System.out.println(findMinNumberWithMassive(numbers, 17));
    }

    public static int getLength() {
        return text.length();
    }

    public static String register () {
       String lowerCase = text.toLowerCase();
       String upperCase =  text.toUpperCase();
       return lowerCase + "\n" + upperCase;
    }

    public static int indexOfFinalSymbol () {
        return text.indexOf(".");
    }

    public static char index () {
        return text.charAt(120);
    }

    public static String replaceWord () {
        return text.trim().replace("знания", "навыки");
    }

    public static String replaceAll () {
        String cleanedText = text.replaceAll("\\s+", " ");
        return cleanedText.replaceAll("-", ",");
    }

    public static int findMinNumber(int...numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("Необходимо передать хотя бы одно число");
        }
        return Arrays.stream(numbers).min().getAsInt();
//        int min = numbers[0];
//
//        for (int number : numbers) {
//            if (number < min) {
//                min = number;
//            }
//        }
//        return min;
    }

    public static boolean findMinNumberWithMassive(int [] count, int number) {
        if (count.length == 0) {
            throw new IllegalArgumentException("Необходимо передать хотя бы одно число");
        }
        int numbersOfMassive = Arrays.stream(count).max().getAsInt();

        if (numbersOfMassive > number) {
            return true;
        } else {
            return false;
        }
    }




}


