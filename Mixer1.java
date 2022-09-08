package PolishedTasksOneByOne.EqualsHashCodeAndToString.wordMemoriser;

import java.util.Arrays;
import java.util.Random;

public class Mixer1 {
        public static PairWordTranslation1[][][] smash(PairWordTranslation1[][][] filled) {
            Random rand = new Random();
            for (int i = 0, j = 0, k = 0; i < filled.length; i++, j++, k++) {
                int randomIndexToSwap = rand.nextInt(filled.length);
                PairWordTranslation1 temp = filled[randomIndexToSwap][randomIndexToSwap][randomIndexToSwap];
                filled[randomIndexToSwap][randomIndexToSwap][randomIndexToSwap] = filled[i][j][k];
                filled[i][j][k] = temp;
            }
            System.out.println(Arrays.toString(filled));
            return filled;
        }
    }


