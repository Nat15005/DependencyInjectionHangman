package co.edu.escuelaing.hangman.model;

import org.springframework.stereotype.Component;

@Component("originalScore")
public class OriginalScore implements GameScore {

    /**
     * Calcula el puntaje según el esquema de puntuación original.
     *
     * @param correctCount   cantidad de letras correctas.
     * @param incorrectCount cantidad de letras incorrectas.
     * @return el puntaje calculado.
     * @pre correctCount >= 0, incorrectCount >= 0.
     * @post El puntaje devuelto es mayor o igual que 0 y menor o igual que 100.
     * @throws IllegalArgumentException si correctCount o incorrectCount son negativos.
     */
    @Override
    public int calculateScore(int correctCount, int incorrectCount) {
        if (correctCount < 0 || incorrectCount < 0) {
            throw new IllegalArgumentException("Los conteos deben ser no negativos");
        }
        int score = 100 - (10 * incorrectCount);
        return Math.max(0, Math.min(100, score));
    }
}
