package XML;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestChargerMagasin {

    @Test
    public void TestChargerMagasinValide() throws FileNotFoundException {
        // Préparation des données
        String rep = "musicbrainzSimple";
        ChargeurMagasin chargeur = new ChargeurMagasin(rep);
        assertEquals(12, chargeur.chargerMagasin().getNombreCds());
    }

    @Test
    public void TestChargerMagasinLeveeException (){
// Préparation des données
        String rep = "2022_coo_cd_Guiffault-_Bounjem/pasderepertoire";
        ChargeurMagasin chargeur = new ChargeurMagasin(rep);
        assertThrows(FileNotFoundException.class, () -> chargeur.chargerMagasin());
    }
}
