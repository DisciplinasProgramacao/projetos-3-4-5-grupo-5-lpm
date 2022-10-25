import java.io.*;
import java.util.*;

public class App {

    public static void limparTela() {
        System.out.flush();
    }

    public static void adicionarVeiculo(Veiculo veiculo, boolean reescrever) {
        try {
            FileWriter arq = new FileWriter("./teste.txt", reescrever);
            PrintWriter gravarArq = new PrintWriter(arq);

            gravarArq.printf("[\n" + veiculo.getTanque() + "\n" +
                    veiculo.getIPVA() + "\n" +
                    veiculo.getSeguro() + "\n" +
                    veiculo.getautonomiaDiaria() + "\n" +
                    veiculo.getPlaca() + "\n]\n");

            arq.close();
        } catch (Exception e) {
            System.out.println("");
        }
    }

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
            
            int k;
            do {
                printMenu();
                k = ler.nextInt();

                switch (k) {
                    case 1:
                        
                        break;
                    case 2:
                       
                        break;
                    case 3:

                        break;
                    case 4:
                        
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
