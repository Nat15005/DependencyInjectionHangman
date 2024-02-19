package co.edu.escuelaing.hangman.model;

import org.springframework.stereotype.Component;

@Component("powerBonusScore")
public class PowerBonusScore implements GameScore {

    /**
     * Calcula el puntaje según el esquema de puntuación con bonificaciones exponenciales.
     *
     * @param correctCount   cantidad de letras correctas.
     * @param incorrectCount cantidad de letras incorrectas.
     * @return el puntaje calculado.
     * @pre correctCount >= 0, incorrectCount >= 0.
     * @post El puntaje devuelto es mayor o igual que 0 y menor o igual que 500.
     *       Si el puntaje calculado es mayor que 500, se devuelve 500.
     * @throws IllegalArgumentException si correctCount o incorrectCount son negativos.
     */
    @Override
    public int calculateScore(int correctCount, int incorrectCount) {

        return 0;
    }
}
