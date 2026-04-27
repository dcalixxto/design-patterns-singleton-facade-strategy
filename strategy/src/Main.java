public class Main {
    public static void main(String[] args) {
        double peso = 3.0; // kg

        CalculadoraDeFrete calc =
            new CalculadoraDeFrete(new FreteViaSedex());
        System.out.printf("Sedex:        R$ %.2f%n", calc.calcularFrete(peso));

        calc.setEstrategia(new FreteViaPAC());
        System.out.printf("PAC:          R$ %.2f%n", calc.calcularFrete(peso));

        calc.setEstrategia(new FretePorTransportadora());
        System.out.printf("Transportadora: R$ %.2f%n", calc.calcularFrete(peso));
    }
}

/*
  Saída esperada (peso = 3 kg):
  Sedex:          R$ 37,50
  PAC:            R$ 20,00
  Transportadora: R$ 27,00
*/