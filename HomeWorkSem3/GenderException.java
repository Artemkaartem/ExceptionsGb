package HomeWorkSem3;

public class GenderException extends Exception {
    public GenderException() {
        }
        public void GenderException(String i) {
            System.out.println("Exception: GenderNotCorrectData");
            System.out.printf("Не праввильно введен пол: %s", i);
            System.out.println();
        }
    }

