package HomeWorkSem3;


public class DataException extends Exception {
    public DataException() {
    }

    public void dataException(String i) {
        System.out.println("Exception: DateNotCorrectFormat");
        System.out.printf("Неправильный формат даты: %s", i);
        System.out.println();
    }
}


