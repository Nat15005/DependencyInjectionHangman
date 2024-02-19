package co.edu.escuelaing.hangman.model;

public interface GameScore {

    /**
     * Calcula el puntaje según el esquema de puntuación.
     *
     * @param correctCount   cantidad de letras correctas.
     * @param incorrectCount cantidad de letras incorrectas.
     * @return el puntaje calculado.
     * @pre correctCount >= 0, incorrectCount >= 0.
     * @post Depende de la implementación
     * @throws IllegalArgumentException si correctCount o incorrectCount son negativos.
     */
    int calculateScore(int correctCount, int incorrectCount) throws IllegalArgumentException;
}