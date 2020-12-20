package pl.put.poznan.transformer.logic;
/**
 * Klasa słuzaca do rozwijania wybranych skrótów do pełnych postaci.
 * @author Krzychu
 */
public class ExpandTransformer extends TextTransformer{

    public ExpandTransformer(String[] transforms) {
        super(transforms);
    }

    public String transform(String text){
        return expand(text);
    }

    /** Rozwijanie wybranych skrótów do pełnych postaci
     *
     * @param text Tekst wejściowy
     * @return Wynikowy tekst
     */

    //Rozwijanie skrótów
    private String expand(String text){
            text = text.replace("np.", "na przykład");
            text = text.replace("NP.", "NA PRZYKŁAD");
            text = text.replace("m.in.", "między innymi");
            text = text.replace("M.IN.", "MIĘDZY INNYMI");
            text = text.replace("itp.", "i tym podobne");
            text = text.replace("ITP.", "I TYM PODOBNE");
            text = text.replace("itd.", "i tak dalej");
            text = text.replace("ITD.", "I TAK DALEJ");
            text = text.replace("prof.", "profesor");
            text = text.replace("PROF.", "PROFESOR");
            text = text.replace("dr", "doktor");
            text = text.replace("DR", "DOKTOR");
            return text;
    }
}
