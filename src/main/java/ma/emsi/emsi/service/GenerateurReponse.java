
package ma.emsi.emsi.service;

import jakarta.enterprise.context.Dependent;

import java.io.Serializable;
import java.util.Locale;

/**
 * Classe de service pour les modificateurs de question.
 * Un modificateur de question prend en entrée une question et retourne
 * la question modifiée.
 */
@Dependent
public class GenerateurReponse implements Serializable {

    private static final long serialVersionUID = 1L;

    private boolean roleSystemeAffiche = false;

    /**
     * Génère une réponse à une question.
     */
    public String genererReponse(String question, String roleSysteme) {
        String resultat = "||";

        if (!this.roleSystemeAffiche && roleSysteme != null) {
            resultat += roleSysteme.toUpperCase(Locale.FRENCH) + "\n";
            this.roleSystemeAffiche = true;
        }

        resultat += question.toLowerCase(Locale.FRENCH) + "||";

        return resultat;
    }
}
