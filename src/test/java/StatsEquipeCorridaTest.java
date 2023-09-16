import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsEquipeCorridaTest {

    @Test
    public void deveRetornarNumeroCarro() {
        StatsEquipeCorrida.getInstance().setnumeroCarro(51);
        assertEquals(51, StatsEquipeCorrida.getInstance().getnumeroCarro());
    }

    @Test
    public void deveRetornarNumeroTitulos() {
        StatsEquipeCorrida.getInstance().setnumeroTitulos(5);
        assertEquals(5, StatsEquipeCorrida.getInstance().getnumeroTitulos());
    }

    @Test
    public void deveRetornarPilotoAtual(){
        StatsEquipeCorrida.getInstance().setpilotoAtual("Pedro");
        assertEquals("Pedro", StatsEquipeCorrida.getInstance().getpilotoAtual());
    }
}