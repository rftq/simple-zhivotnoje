package v1;

// Главный класс
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Создаём животных ===\n");

        // Создаём собаку через конструктор
        Sobaka reks = new Sobaka("Рекс", 3, "Коричневый", "Овчарка", true);
        System.out.println();

        // Создаём кошку через конструктор
        Koshka murka = new Koshka("Мурка", 2, "Рыжая", true, 8);
        System.out.println();

        // Показываем информацию
        System.out.println("\n=== Информация о животных ===\n");
        reks.pokazatInfo();
        System.out.println();
        murka.pokazatInfo();

        // Используем методы
        System.out.println("\n=== Действия животных ===\n");
        reks.izdatZvuk();
        reks.prinosit();
        reks.est();

        System.out.println();

        murka.izdatZvuk();
        murka.murlychat();
        murka.spat();

        // Используем сеттеры для изменения данных
        System.out.println("\n=== Изменяем данные через сеттеры ===\n");
        reks.setVozrast(4);
        System.out.println("Новый возраст Рекса: " + reks.getVozrast());

        murka.setUrovneLeni(10);
        System.out.println("Новый уровень лени Мурки: " + murka.getUrovneLeni());

        // Проверка валидации в сеттерах
        System.out.println("\n=== Проверка валидации ===\n");
        reks.setVozrast(100);  // Вызовет ошибку
        murka.setImya("");     // Вызовет ошибку

        // Полиморфизм в действии
        System.out.println("\n=== Полиморфизм ===\n");
        Zhivotnoje[] zhivotnyje = {reks, murka};

        for (Zhivotnoje zh : zhivotnyje) {
            zh.izdatZvuk();  // Каждый издаст свой звук!
        }
    }
}