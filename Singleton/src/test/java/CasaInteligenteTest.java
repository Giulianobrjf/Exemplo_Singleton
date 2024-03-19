import org.example.CasaInteligente;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CasaInteligenteTest {

    @Test
    public void testarLuzesAcesas() {
        CasaInteligente.getInstance().setLuzesAcesas(true);
        assertTrue(CasaInteligente.getInstance().isLuzesAcesas());
    }

    @Test
    public void testarArCondicionadoLigado() {
        CasaInteligente.getInstance().setArCondicionadoLigado(true);
        assertTrue(CasaInteligente.getInstance().isArCondicionadoLigado());
    }

    @Test
    public void testarAlarmeAtivado() {
        CasaInteligente.getInstance().setAlarmeAtivado(true);
        assertTrue(CasaInteligente.getInstance().isAlarmeAtivado());
    }
}