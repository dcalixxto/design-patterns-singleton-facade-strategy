package example;

import java.sql.Connection; // Simulação de uma classe de conexão real

public class GerenciadorConexao {

    // Adicionamos 'volatile' para garantir que a instância seja lido corretamente entre diferentes threads.
    private static volatile GerenciadorConexao instance;
    private String statusConexao;

    // Construtor privado: Simula a abertura pesada de uma conexão
    private GerenciadorConexao() {
        this.statusConexao = "Conexão Ativa com MySQL [Porta 3306]";
        System.out.println(">>> Estabelecendo conexão única com o banco de dados...");
    }

    public static GerenciadorConexao getInstance() {
        if (instance == null) {
            synchronized (GerenciadorConexao.class) {
                if (instance == null) {
                    instance = new GerenciadorConexao();
                }
            }
        }
        return instance;
    }

    public void executarQuery(String sql) {
        System.out.println("Executando no Banco: " + sql);
    }

    public String getStatusConexao() {
        return statusConexao;
    }
}
