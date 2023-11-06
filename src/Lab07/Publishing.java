package Lab07;

public class Publishing {
    public static void main(String[] args) {
        // Создание материала
        Note noteVasilev1 =new Note("Создание классов Java", "Sidorik", 3.6);
        Note noteEugene1 =new Note("Среда разработки IJ", "Gedrevich", 3.6);

        // Создание журнала
        System.out.println("\nЖурналы:");
        Note[] notes = new Note [10]; // массив статей
        notes[0] = noteVasilev1;
        notes[1] = noteEugene1;
        Magazine magazine = new Magazine("Программирование", 1, 2016,
                notes, "PUBLISHING_HOUSE", "PUBLISHING_LOCATION");
        System.out.println(magazine);
    }
}
