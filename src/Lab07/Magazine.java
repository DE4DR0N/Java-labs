package Lab07;
/**
 * Define the class Magazine
 *
 * @author Gedrevich E.A.
 * @version 1.0 01.11.2023
 */
public class Magazine {
    private String magazineTitle;   // название журнала
    private int numberMagazine;   // номер выпуска
    private int publishingYear;   // Год издания
    private Note[] notes;   // массив статей
    private String publishingHouse;   // Издательство
    private String publishingLocation;   // Город
    private int numberPage;   // Кол‐во страниц
    Contents contents;

    /**
     * Конструктор для создания экземпляра журнала
     * @param magazineTitle ‐ название
     * @param numberMagazine ‐ номер выпуска
     * @param publishingYear ‐ год издания
     * @param notes ‐ массив статей
     * @param publishingHouse ‐ издательство
     * @param publishingLocation ‐ город
     */
    public Magazine(String magazineTitle, int numberMagazine,
                    int publishingYear, Note[] notes, String publishingHouse,
                    String publishingLocation) {
        this.magazineTitle = magazineTitle;
        this.numberMagazine = numberMagazine;
        this.publishingYear = publishingYear;
        this.notes = notes;
        this.publishingHouse = publishingHouse;
        this.publishingLocation = publishingLocation;
        contents = new Contents(notes);
    }
    /**
     * Метод для изменения массива статей журнала
     * @param notes the notes to set
     */
    public void setNotes(Note[] notes) {
        this.notes = notes;
        contents.createContents(notes);
    }
    /**
     * Метод, формирующий информацию о журнале
     * @return str ‐ возвращает строку
     */
    @Override
    public String toString() {
        String str = "Журнал " + magazineTitle + "  № " + numberMagazine +
                " " + publishingYear + ".  ‐ " + publishingLocation +
                ".: "
                + publishingHouse;
        str += contents.toString();
        return str;
    }

}
