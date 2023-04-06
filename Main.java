// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] grades = {50,60,40,10,38,65,87,56,90,100,66,80,88,40,98};

        int sum = 0;
        for(int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }

        double average = (double)sum / grades.length;
        System.out.println("معدل الدرجات: " + average);
    }
}