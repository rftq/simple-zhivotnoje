package v1;

// Дочерний класс - Кошка
class Koshka extends Zhivotnoje {
    private boolean lyubitLaskatsa;
    private int urovneLeni;  // от 1 до 10

    public Koshka(String imya, int vozrast, String cvet, boolean lyubitLaskatsa, int urovneLeni) {
        super(imya, vozrast, cvet);  // Вызываем конструктор родителя
        this.lyubitLaskatsa = lyubitLaskatsa;
        this.urovneLeni = urovneLeni;
        System.out.println("Это кошка с уровнем лени: " + urovneLeni);
    }

    public boolean isLyubitLaskatsa() {
        return lyubitLaskatsa;
    }

    public void setLyubitLaskatsa(boolean lyubitLaskatsa) {
        this.lyubitLaskatsa = lyubitLaskatsa;
    }

    public int getUrovneLeni() {
        return urovneLeni;
    }

    public void setUrovneLeni(int urovneLeni) {
        if (urovneLeni >= 1 && urovneLeni <= 10) {
            this.urovneLeni = urovneLeni;
        } else {
            System.out.println("Уровень лени должен быть от 1 до 10!");
        }
    }

    @Override
    public void izdatZvuk() {
        System.out.println(getImya() + " говорит: Мяу!");
    }

    public void murlychat() {
        if (lyubitLaskatsa) {
            System.out.println(getImya() + " мурлычет: мур-мур-мур");
        } else {
            System.out.println(getImya() + " не в настроении");
        }
    }

    @Override
    public void pokazatInfo() {
        super.pokazatInfo();
        System.out.println("Любит ласкаться: " + (lyubitLaskatsa ? "Да" : "Нет"));
        System.out.println("Уровень лени: " + urovneLeni + "/10");
    }
}