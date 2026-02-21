package v1;

// Родительский класс
class Zhivotnoje {
    private String imya;
    private int vozrast;
    private String cvet;

    // Конструктор - вызывается при создании объекта
    public Zhivotnoje(String imya, int vozrast, String cvet) {
        this.imya = imya;
        this.vozrast = vozrast;
        this.cvet = cvet;
        System.out.println("Создано животное: " + imya);
    }

    // Геттеры - получаем значения приватных полей
    public String getImya() {
        return imya;
    }

    public int getVozrast() {
        return vozrast;
    }

    public String getCvet() {
        return cvet;
    }

    // Сеттеры - устанавливаем значения с проверкой
    public void setImya(String imya) {
        if (imya != null && !imya.isEmpty()) {
            this.imya = imya;
        } else {
            System.out.println("Ошибка: имя не может быть пустым!");
        }
    }

    public void setVozrast(int vozrast) {
        if (vozrast > 0 && vozrast < 50) {
            this.vozrast = vozrast;
        } else {
            System.out.println("Ошибка: некорректный возраст!");
        }
    }

    public void setCvet(String cvet) {
        this.cvet = cvet;
    }

    // Обычные методы
    public void est() {
        System.out.println(imya + " кушает");
    }

    public void spat() {
        System.out.println(imya + " спит");
    }

    public void izdatZvuk() {
        System.out.println(imya + " издаёт звук");
    }

    public void pokazatInfo() {
        System.out.println("=== Информация ===");
        System.out.println("Имя: " + imya);
        System.out.println("Возраст: " + vozrast + " лет");
        System.out.println("Цвет: " + cvet);
    }
}



