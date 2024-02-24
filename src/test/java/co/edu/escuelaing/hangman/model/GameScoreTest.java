package co.edu.escuelaing.hangman.model;

import org.junit.jupiter.api.Test;
import org.junit.Assert;
import static org.junit.jupiter.api.Assertions.assertThrows;


/**
 * Clase de pruebas para las implementaciones de GameScore.
 *
 * Especificaciones de las clases de equivalencia y condiciones de frontera:
 *
 * OriginalScore:
 *
 * Clase de equivalencia 1: Iniciar con 100 puntos.
 * Clase de equivalencia 2: No bonificar las letras correctas.
 * Clase de equivalencia 3: Penalizar con 10 puntos cada letra incorrecta.
 * Clase de equivalencia 4: Puntaje minimo es 0.
 *
 *
 * Condiciones de frontera:
 * Clase de equivalencia 1:
 * - correctCount = 0, incorrectCount = 0.
 * Clase de equivalencia 2:
 * - correctCount = 1, incorrectCount = 0.
 * Clase de equivalencia 3:
 * - correctCount = 0, incorrectCount = 1.
 * Clase de equivalencia 4:
 * - correctCount = 0, incorrectCount = 11.
 *
 * BonusScore:
 *
 * Clase de equivalencia 1: El juego inicia en 0 puntos.
 * Clase de equivalencia 2: Se bonifica con 10 puntos cada letra correcta.
 * Clase de equivalencia 3: Se penaliza con 5 puntos cada letra incorrecta.
 * Clase de equivalencia 4: Puntaje minimo es 0.
 *
 * Condiciones de frontera:
 * Clase de equivalencia 1:
 * - correctCount = 0, incorrectCount = 0.
 * Clase de equivalencia 2:
 * - correctCount = 1, incorrectCount = 0.
 * Clase de equivalencia 3:
 * - correctCount = 1, incorrectCount = 1.
 * Clase de equivalencia 4:
 * - correctCount = 0, incorrectCount = 1.
 *
 * PowerBonusScore:
 *
 * Clase de equivalencia 1: El juego inicia en 0 puntos.
 * Clase de equivalencia 2: La i-ésima  letra correcta se bonifica con 5^i.
 * Clase de equivalencia 3: Se penaliza con 8 puntos cada letra incorrecta.
 * Clase de equivalencia 4: Puntaje minimo es 0.
 * Clase de equivalencia 5: Si con las reglas anteriores sobrepasa 500 puntos, el puntaje es 500.
 *
 * Condiciones de frontera:
 * Clase de equivalencia 1:
 * - correctCount = 0, incorrectCount = 0.
 * Clase de equivalencia 2:
 * - correctCount = 1, incorrectCount = 0.
 * Clase de equivalencia 3:
 * - correctCount = 2, incorrectCount = 1.
 * Clase de equivalencia 4:
 * - correctCount = 0, incorrectCount = 1.
 * Clase de equivalencia 5:
 * - correctCount = 4, incorrectCount = 0.
 *
 */
public class GameScoreTest {

    @Test
    public void ShouldCalculateOriginalScore() {
        // Given
        OriginalScore originalScore = new OriginalScore();

        // When
        int score1 = originalScore.calculateScore(0, 0); // Clase de equivalencia 1
        int score2 = originalScore.calculateScore(1, 0); // Clase de equivalencia 2
        int score3 = originalScore.calculateScore(0, 1); // Clase de equivalencia 3
        int score4 = originalScore.calculateScore(0, 11); //Clase de equivalencia 4

        // Then
        Assert.assertEquals(100, score1); // CE1
        Assert.assertEquals(100, score2); // CE2
        Assert.assertEquals(90, score3);  // CE3
        Assert.assertEquals(0, score4);   // CE4
    }

    @Test
    public void ShouldCalculateBonusScore() {
        // Given
        BonusScore bonusScore = new BonusScore();

        // When
        int score1 = bonusScore.calculateScore(0, 0); // CE1
        int score2 = bonusScore.calculateScore(1, 0); // CE2
        int score3 = bonusScore.calculateScore(1, 1); // CE3
        int score4 = bonusScore.calculateScore(0, 1); // CE4

        // Then
        Assert.assertEquals(0, score1); // CE1
        Assert.assertEquals(10, score2); // CE2
        Assert.assertEquals(5, score3);  // CE3
        Assert.assertEquals(0, score4);  // CE4
    }

    @Test
    public void ShouldCalculatePowerBonusScore() {
        // Given
        PowerBonusScore powerBonusScore = new PowerBonusScore();

        // When
        int score1 = powerBonusScore.calculateScore(0, 0); // CE1
        int score2 = powerBonusScore.calculateScore(1, 0); // CE2
        int score3 = powerBonusScore.calculateScore(2, 1); // CE3
        int score4 = powerBonusScore.calculateScore(0, 1); // CE4
        int score5 = powerBonusScore.calculateScore(4, 0); // CE5

        // Then
        Assert.assertEquals(0, score1);    // CE1
        Assert.assertEquals(5, score2);    // CE2
        Assert.assertEquals(22, score3);   // CE3
        Assert.assertEquals(0, score4);    // CE4
        Assert.assertEquals(500, score5);  // CE5
    }

    @Test
    public void originalScoreShouldNotRewardCorrectLetters() {
        // Given
        OriginalScore originalScore = new OriginalScore();

        // When
        int score = originalScore.calculateScore(1, 0);

        // Then
        Assert.assertEquals(100, score); // No se debería bonificar las letras correctas
    }
    @Test
    public void originalScoreShouldNotGoBelowZero() {
        // Given
        OriginalScore originalScore = new OriginalScore();

        // When
        int score = originalScore.calculateScore(0, 11);

        // Then
        Assert.assertEquals(0, score); // El puntaje mínimo es 0
    }
    @Test
    public void bonusScoreShouldNotGoBelowZero() {
        // Given
        BonusScore bonusScore = new BonusScore();

        // When
        int score = bonusScore.calculateScore(0, 1);

        // Then
        Assert.assertEquals(0, score); // El puntaje mínimo es 0
    }

    @Test
    public void bonusScoreShouldNotInitializeWith100Points() {
        // Given
        BonusScore bonusScore = new BonusScore();

        // When
        int score = bonusScore.calculateScore(0, 0);

        // Then
        Assert.assertNotEquals(100, score); // El puntaje no debe iniciar en 100
    }

    @Test
    public void powerBonusScoreShouldNotInitializeWith100Points() {
        // Given
        PowerBonusScore powerBonusScore = new PowerBonusScore();

        // When
        int score = powerBonusScore.calculateScore(0, 0);

        // Then
        Assert.assertNotEquals(100, score); // El puntaje no debe iniciar en 100
    }

    @Test
    public void powerBonusScoreShouldNotExceed500Points() {
        // Given
        PowerBonusScore powerBonusScore = new PowerBonusScore();

        // When
        int score = powerBonusScore.calculateScore(4, 0);

        // Then
        Assert.assertTrue(score <= 500); // El puntaje no debe exceder los 500 puntos
    }
    @Test
    public void powerBonusScoreShouldNotGoBelowZero() {
        // Given
        PowerBonusScore powerBonusScore = new PowerBonusScore();

        // When
        int score = powerBonusScore.calculateScore(0, 1);

        // Then
        Assert.assertEquals(0, score); // El puntaje mínimo es 0
    }

    @Test
    public void originalScoreShouldThrowExceptionForNegativeCorrectCount() {
        // Given
        OriginalScore originalScore = new OriginalScore();

        // When / Then
        assertThrows(IllegalArgumentException.class, () -> {
            originalScore.calculateScore(-1, 0);
        });
    }

    @Test
    public void originalScoreShouldThrowExceptionForNegativeIncorrectCount() {
        // Given
        OriginalScore originalScore = new OriginalScore();

        // When / Then
        assertThrows(IllegalArgumentException.class, () -> {
            originalScore.calculateScore(0, -1);
        });
    }

    @Test
    public void bonusScoreShouldThrowExceptionForNegativeCorrectCount() {
        // Given
        BonusScore bonusScore = new BonusScore();

        // When / Then
        assertThrows(IllegalArgumentException.class, () -> {
            bonusScore.calculateScore(-1, 0);
        });
    }

    @Test
    public void bonusScoreShouldThrowExceptionForNegativeIncorrectCount() {
        // Given
        BonusScore bonusScore = new BonusScore();

        // When / Then
        assertThrows(IllegalArgumentException.class, () -> {
            bonusScore.calculateScore(0, -1);
        });
    }

    @Test
    public void powerBonusScoreShouldThrowExceptionForNegativeCorrectCount() {
        // Given
        PowerBonusScore powerBonusScore = new PowerBonusScore();

        // When / Then
        assertThrows(IllegalArgumentException.class, () -> {
            powerBonusScore.calculateScore(-1, 0);
        });
    }

    @Test
    public void powerBonusScoreShouldThrowExceptionForNegativeIncorrectCount() {
        // Given
        PowerBonusScore powerBonusScore = new PowerBonusScore();

        // When / Then
        assertThrows(IllegalArgumentException.class, () -> {
            powerBonusScore.calculateScore(0, -1);
        });
    }
}
