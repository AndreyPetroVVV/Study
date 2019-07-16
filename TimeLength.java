package lection4_OOP;

/**
 * Создать класс, описывающий промежуток времени.
 * Сам промежуток времени должен задаваться тремя свойствами:
 * секундами, минутами и часами.
 * Создать метод для получения полного количества секунд в объекте
 * Создать два конструктора: первый принимает общее количество секунд,
 * второй - часы, минуты и секунды по отдельности.
 * Создать метод для вывода данных.
 * Написать программу для тестирования возможностей класса.
 */

class TimeLength {
    public String name;
    public int seconds;
    public int minutes;
    public int hours;

    public String getName() {
        return name;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public TimeLength(String name, int hours, int minutes, int seconds) {
        this.name = name;
        this.hours = Math.abs(hours);
        this.minutes = Math.abs(minutes) % 60;
        this.seconds = Math.abs(seconds) % 60;
    }

    public TimeLength(String name, int seconds) {
        this.name = name;
        convertSecondsToTime(seconds);
    }

    public int getShareSeconds() { // метод для получения полного кол-ва секунд в объекте
        return this.hours * 3600 + this.minutes * 60 + this.seconds;
    }

    public void convertSecondsToTime(int seconds) {
        seconds = Math.abs(seconds);
        this.hours = seconds / 3600;
        seconds %= 3600;
        this.minutes = seconds / 60;
        this.seconds = seconds % 60;
    }

    @Override
    public String toString() {
        return String.format("%d h. %d m. %d s.", this.hours, this.minutes, this.seconds);
    }
}
