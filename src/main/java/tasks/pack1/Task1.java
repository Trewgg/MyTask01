package tasks.pack1;

public class Task1 {

    private static final int BEGIN_INDEX = 0;
    private static final int END_INDEX = 10;

    public void printIP(String firstIP, String lastIP) {

        try {
            int lastNumberIP1 = Integer.parseInt(firstIP.substring(END_INDEX));
            int lastNumberIP2 = Integer.parseInt(lastIP.substring(END_INDEX));

            for(int i = lastNumberIP1 + 1; i < lastNumberIP2; i++) {
                System.out.println(firstIP.substring(BEGIN_INDEX, END_INDEX) + i);
            }
        }
        catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Ошибка");
        }

    }
    //это самый простой вариант с изменением только последнего числа IP
    //можно еще добавить проверку для третьего, второго и первого числа в IP
}
