package pl.put.poznan.transformer.logic;

public class CapitalizeTransformer extends TextTransformer {

    public CapitalizeTransformer(String[] transforms) {
        super(transforms);
    }

    public String transform(String text){ return capitalize(text); }

    /** Zamiana pierwszej litery każdego wyrazu  na wielką.
     *
     * @param text Tekst wejściowy
     * @return Wynikowy tekst
     */
    private String capitalize(String text){
        for(int i = 0;i<text.length();i++)
        {
            if(text.charAt(i) == ' ') {
                text = text.substring(0,i+1)+Character.toUpperCase(text.charAt(i + 1))+ text.substring(i+2);
            }
        }
        return text;
    }
}
