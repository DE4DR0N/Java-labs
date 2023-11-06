package Lab07;

public class Note {
    private int numberNote; // порядковый номер материала
    private static int lastNumberNote = 0; // последний номер
    private String noteTitle; // название материала
    private String authorNote; // автор материала
    private double numberAuthorsSheets; // кол‐во авт. листов

    /**
     * Конструктор для создания экземпляра публикуемого материала
     * @param noteTitle ‐ название материала
     * @param authorNote ‐ автор материала
     * @param numberAuthorsSheets ‐ количество авторских листов
     */
    public Note(String noteTitle, String authorNote,
                double numberAuthorsSheets) {
        numberNote = ++lastNumberNote; // создаем порядковый номер
        this.noteTitle = noteTitle;
        this.authorNote = authorNote;
        this.numberAuthorsSheets = numberAuthorsSheets;
    }
    /**
     * Метод чтения названия материала
     * @return noteTitle
     */
    public String getNoteTitle() {
        return noteTitle;
    }
    /**
     * Метод чтения автора материала
     * @return authorNote
     */
    public String getAuthorNote() {
        return authorNote;
    }
    /**
     * Метод подсчета количества страниц
     * @return int ‐ Кол‐во страниц
     */
    public int getNumberPages() {
        return (int) Math.round(numberAuthorsSheets * 40000 / 3700);
    }
    public static int getLastNumberNote() {
        return lastNumberNote;
    }
    /**
     * Метод, формирующий информацию о публикуемом материале
     * @return the str ‐ возвращает строку
     */
    @Override
    public String toString() {
        String str = numberNote + " " + authorNote + " " + noteTitle +
                ", авт. листов: " + numberAuthorsSheets;
        return str;
    }
}
