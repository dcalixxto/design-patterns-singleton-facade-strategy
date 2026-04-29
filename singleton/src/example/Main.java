package example;

public class Main {
    public static void main(String[] args) {
        GerenciadorConexao moduloUsuarios = GerenciadorConexao.getInstance();
        System.out.println("Módulo Usuários: " + moduloUsuarios.getStatusConexao());
        moduloUsuarios.executarQuery("SELECT * FROM usuarios");

        System.out.println("--------------------------------------");

        GerenciadorConexao moduloRelatorios = GerenciadorConexao.getInstance();
        System.out.println("Módulo Relatórios: " + moduloRelatorios.getStatusConexao());
        moduloRelatorios.executarQuery("SELECT SUM(valor) FROM vendas");

        if (moduloUsuarios == moduloRelatorios) {
            System.out.println("\n[RESULTADO]: Singleton funcionou com sucesso!");
            System.out.println("[ECONOMIA]: Apenas UMA conexão física foi aberta.");
            System.out.println("ID da Instância 1: " + System.identityHashCode(moduloUsuarios));
            System.out.println("ID da Instância 2: " + System.identityHashCode(moduloRelatorios));
        }
    }
}