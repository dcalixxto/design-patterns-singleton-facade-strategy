public class CalculadoraDeFrete {

    private EstrategiaFrete estrategia;

    /** Injeção via construtor (boa prática) */
    public CalculadoraDeFrete(EstrategiaFrete estrategia) {
        this.estrategia = estrategia;
    }

    /** Permite trocar a estratégia em tempo de execução */
    public void setEstrategia(EstrategiaFrete estrategia) {
        this.estrategia = estrategia;
    }

    /** Delega para a Strategy — não conhece qual concreta */
    public double calcularFrete(double pesoKg) {
        return estrategia.calcular(pesoKg);
    }
}