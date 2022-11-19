import java.io.*;
import java.util.*;

public class App {
    List<Veiculo> veiculos = new ArrayList<Veiculo>();

    public static void limparTela() {
        System.out.flush();
    }

    /*
     * public static void adicionarVeiculo(Veiculo veiculo, boolean reescrever) {
     * try {
     * FileWriter arq = new FileWriter("./teste.txt", reescrever);
     * PrintWriter gravarArq = new PrintWriter(arq);
     * 
     * gravarArq.printf("[\n" + veiculo.getNome() + "\n" +
     * veiculo.getPlaca() + "\n]\n");
     * 
     * arq.close();
     * } catch (Exception e) {
     * System.out.println("");
     * }
     * }
     */

    public static void printMenu() {
        limparTela();
        System.out.println("Menu Frota Veículo:\n");
        System.out.println("1 - Cadastrar veículo");
        System.out.println("2 - Cadastrar Rotas para um veículo");
        System.out.println("3 - Localizar um veículo da frota");
        System.out.println("4 - Gerar currículo");
        System.out.println("0 - Sair e salvar");

    }

    public static void main(String[] args) throws IOException {

        Scanner ler = new Scanner(System.in);
        try {
            List<Veiculo> veiculos = new LinkedList<Veiculo>();

            /*Veiculo v1 = new Veiculo("teste1", 50, 50, 50, 50, "placa1");
            Veiculo v2 = new Veiculo("teste2", 10, 10, 10, 10, "placa2");

            Frota.write("teste.txt", v1.toString());
            Frota.write("teste.txt", v2.toString());*/
            

            
            int k;
            do {
                printMenu();
                k = ler.nextInt();

                switch (k) {
                    case 1:
                        String nome1 = ler.nextLine();
                        System.out.println("Digite o nome do Veículo:");
                        String nome = ler.nextLine();

                        System.out.println("Digite o Tanque:");
                        double tanque = ler.nextDouble();

                        System.out.println("Digite o IPVA:");
                        double ipva = ler.nextDouble();

                        System.out.println("Digite o Seguro:");
                        double seguro = ler.nextDouble();

                        System.out.println("Digite a autonomia:");
                        double autonomia = ler.nextDouble();

                        String placabug = ler.nextLine();
                        System.out.println("Digite a placa:");
                        String placa = ler.nextLine();

                        Veiculo v = new Veiculo(nome, tanque, tanqueTotal, ipva, seguro, autonomia, placa);

                        Frota.write("teste.txt", v.toString());
                        break;
                    case 2:

                        break;
                    case 3:
                    Frota z = new Frota();
                    z.localizarPorPlaca(placa);
                    
                    

                        break;
                    case 4:
                        veiculos = Frota.read("teste.txt");
                        for (Veiculo veiculo : veiculos) {
                            System.out.println(veiculo.toString());
                        }
                        break;
                    default:
                        break;
                }
                System.out.println("Press Enter to continue...");
                System.in.read();
            } while (k != 0);
        } catch (FileNotFoundException e) {
            System.out.println("Nao foi possivel inicializar o sistema, arquivos nao encontrados");
        }
        ler.close();
    }

}
