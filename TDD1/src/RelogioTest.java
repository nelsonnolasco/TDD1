import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RelogioTest {

    @Test
    public void testRelogio() {
        Relogio relogio = new Relogio();

        // Verifica se o tempo atual é formatado corretamente
        assertEquals("hh:mm:ss", relogio.getTempoAtual());

        // Simula o ticTac do relógio
        relogio.ticTac();

        // Verifica se o tempo atual foi atualizado após o ticTac
        assertEquals("hh:mm:ss", relogio.getTempoAtual());
    }
}
