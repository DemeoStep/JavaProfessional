package homework4.task3;

import java.time.*;

public class Main {
    public static void main(String[] args) {
        LocalDateTime myBirth = LocalDateTime.of(1980, 10, 21, 23, 30);

        getPeriod(myBirth);
    }

    public static void getPeriod(LocalDateTime birthDate) {
        LocalDateTime now = LocalDateTime.now();
        LocalTime birthTime = LocalTime.of(birthDate.getHour(), birthDate.getMinute(), birthDate.getSecond());

        Period period = Period.between(birthDate.toLocalDate(), now.toLocalDate());
        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();

        Duration duration = Duration.between(birthTime, now.toLocalTime());
        if (duration.isNegative()) {
            duration = duration.plusDays(1);
        }

        int hours = (int) (duration.getSeconds() / 3600);
        duration = duration.minus(Duration.ofHours(hours));

        int minutes = (int) (duration.getSeconds() / 60);
        duration = duration.minusMinutes(minutes);

        System.out.println("Вам исполнилось: \n\t" + years + " лет, " + months +
                " месяцев, " + days + " дней, " + hours + " часов, " + minutes +
                " минут и " + duration.getSeconds() + " секунд");
    }
}
