package co.edu.escuelaing.hangman.model;

import org.springframework.stereotype.Component;

@Component("bonusScore")
public class BonusScore implements GameScore {

    /**
     * Calcula el puntaje según el esquema de puntuación con bonificaciones.
     *
     * @param correctCount   cantidad de letras correctas.
     * @param incorrectCount cantidad de letras incorrectas.
     * @return el puntaje calculado.
     * @pre correctCount >= 0, incorrectCount >= 0.
     * @post El puntaje devuelto es mayor o igual que 0.
     * @throws IllegalArgumentException si correctCount o incorrectCount son negativos.
     */
    @Override
    public int calculateScore(int correctCount, int incorrectCount) {
        if (correctCount < 0 || incorrectCount < 0) {
            throw new IllegalArgumentException("Los conteos deben ser no negativos");
        }
        int score = correctCount * 10 - incorrectCount * 5;
        return Math.max(0, score);
    }
}
