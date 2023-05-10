package task6;

public class isComposite {
    private boolean check = false;
    public isComposite(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                check = true;
                break;
            }
        }
    }
    public void Check() {
        if (check) {
            System.out.println("Введенное число не является простым");
        } else {
            System.out.println("Введенное число является простым");
        }
    }
}
