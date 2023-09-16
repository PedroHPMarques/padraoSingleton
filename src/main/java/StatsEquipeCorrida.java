public class StatsEquipeCorrida {
    
    private StatsEquipeCorrida() {};
    private static StatsEquipeCorrida instance = new StatsEquipeCorrida();
    public static StatsEquipeCorrida getInstance() {
        return instance;
    }

    private Integer numeroCarro;
    private Integer numeroTitulos;
    private String pilotoAtual;

    public Integer getnumeroCarro() {
        return numeroCarro;
    }

    public void setnumeroCarro(Integer numeroCarro) {
        this.numeroCarro = numeroCarro;
    }

    public Integer getnumeroTitulos() {
        return numeroTitulos;
    }

    public void setnumeroTitulos(Integer numeroTitulos) {
        this.numeroTitulos = numeroTitulos;
    }

    public String getpilotoAtual() {
        return pilotoAtual;
    }

    public void setpilotoAtual(String pilotoAtual) {
        this.pilotoAtual = pilotoAtual;
    }
}
