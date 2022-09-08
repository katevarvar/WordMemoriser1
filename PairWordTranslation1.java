package PolishedTasksOneByOne.EqualsHashCodeAndToString.wordMemoriser;

public class PairWordTranslation1 {
        String wordTranslation;
        String word;
        String translation;

    public PairWordTranslation1(String wordTranslation, String word, String translation) {
        this.wordTranslation = wordTranslation;
        this.word = wordTranslation.substring(0, wordTranslation.indexOf("-"));
        this.translation = wordTranslation.substring(wordTranslation.indexOf("-") + 2,  wordTranslation.length());
    }

    public static PairWordTranslation1[][][] writeNewPairs(String content) {
            String[] pairs1 = content.split("\n");//делим строку на элементы массива построчно
            int size = pairs1.length;
            PairWordTranslation1[][][]filled = new PairWordTranslation1[size][size][size];
            int i = 0, j = 0, k = 0;
            for ( String n: pairs1) {
                filled[i][j][k] = new PairWordTranslation1(pairs1[i],pairs1[j], pairs1[k]);
                i++; j++; k++;
            }
            return filled;
        }
    }

