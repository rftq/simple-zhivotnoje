package v1;

// Дочерний класс - Собака
class Sobaka extends Zhivotnoje {
    private String poroda;
    private boolean umeetPrinosit;

    // Конструктор дочернего класса
    public Sobaka(String imya, int vozrast, String cvet, String poroda, boolean umeetPrinosit) {
        // super() - вызываем конструктор родителя
        // ВАЖНО: super() должен быть ПЕРВОЙ строкой в конструкторе!
        super(imya, vozrast, cvet);
        this.poroda = poroda;
        this.umeetPrinosit = umeetPrinosit;
        System.out.println("Это собака породы: " + poroda);
    }

    // Геттеры и сеттеры для своих полей
    public String getPoroda() {
        return poroda;
    }

    public void setPoroda(String poroda) {
        this.poroda = poroda;
    }

    public boolean isUmeetPrinosit() {  // для boolean используем is вместо get
        return umeetPrinosit;
    }

    public void setUmeetPrinosit(boolean umeetPrinosit) {
        this.umeetPrinosit = umeetPrinosit;
    }

    // Переопределяем метод родителя
    @Override
    public void izdatZvuk() {
        System.out.println(getImya() + " говорит: Гав-гав!");
    }

    // Свой уникальный метод
    public void prinosit() {
        if (umeetPrinosit) {
            System.out.println(getImya() + " принёс мячик!");
        } else {
            System.out.println(getImya() + " ещё не умеет приносить");
        }
    }

    // Переопределяем показ информации, добавляя свои данные
    @Override
    public void pokazatInfo() {
        super.pokazatInfo();  // Вызываем метод родителя
        System.out.println("Порода: " + poroda);
        System.out.println("Умеет приносить: " + (umeetPrinosit ? "Да" : "Нет"));
    }
}