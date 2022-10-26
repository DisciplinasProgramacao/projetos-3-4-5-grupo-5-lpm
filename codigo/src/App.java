import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;

public class App {

    static Veiculo veiculos[] = null;
    static String lista;
    static int confirma = -1;
    static int j = 0;

    public static void main(String[] args) {

        String op = "";
        int opcao = -1;

        do {

            op = JOptionPane.showInputDialog("SISTEMA Alocação de Veículos - v1.0:\n\n"
                    + "1 ~> Cadastrar Veículos.\n"
                    + "2 ~> Consultar Veículos.\n"
            /*
             * + "3 ~> Cadastrar Cachorros.\n"
             * + "4 ~> Consultar Cachorros.\n" + "5 ~> Sair.\n\n"
             */);

            if (op == null) {

                op = "0";

            }

            opcao = Integer.parseInt(op);

            if (opcao == 1) {

                CadastrarVeiculo();

            } else if (opcao == 2) {

                ConsultarVeiculo();

            } else if (opcao == 3) {

                //

            } else if (opcao == 4) {

                //

            } else if (opcao == 5 || opcao == 0) {

                Sair();

            } else {

                JOptionPane.showMessageDialog(null, "Opção Inválida!!!");

            }

        } while (confirma != 0);

    }

    public static void CadastrarVeiculo() {

        int QuantVeiculo;

        String Quant = JOptionPane
                .showInputDialog("- Cadastrar Veiculo:\n\nQuantos Veículos Deseja Cadastrar: ");

        if (Quant == null) {

            Quant = "0";

        }

        QuantVeiculo = Integer.parseInt(Quant);

        veiculos = new Veiculo[QuantVeiculo];

        for (int i = 0; i < veiculos.length; i++) {

            veiculos[i] = new Veiculo();

        }

        for (int i = 0; i < QuantVeiculo; i++) {

            veiculos[i]
                    .setNome(JOptionPane
                            .showInputDialog("- Cadastrar Veiculo:\n\nDigite o nome do Veículo: ("
                                    + (i + 1) + "/" + QuantVeiculo + ")"));
            veiculos[i]
                    .setTanque(JOptionPane
                            .showInputDialog("- Cadastrar IPVA: \n\nDigite a quantidade do Tanque do Veículo: "
                            /* + veiculos[i].getNome()) */));

            veiculos[i]
                    .setIPVA(JOptionPane
                            .showInputDialog("- Cadastrar IPVA: \n\nDigite o IPVA do Veículo: "
                            /*
                             * + veiculos[i].getNome())
                             * + veiculos[i].getTanque()
                             */));

            veiculos[i]
                    .setSeguro(JOptionPane
                            .showInputDialog("- Cadastrar Seguro: \n\nDigite o Seguro do Veículo: "
                            /*
                             * + veiculos[i].getNome())
                             * + veiculos[i].getTanque()
                             * + veiculos[i].getIPVA()
                             */));
            veiculos[i]
                    .setPlaca(JOptionPane
                            .showInputDialog("- Cadastrar Seguro: \n\nDigite a Placa do Veículo: "
                            /*
                             * + veiculos[i].getNome())
                             * + veiculos[i].getTanque()
                             * + veiculos[i].getIPVA()
                             */));

        }

        for (int i = 0; i < QuantVeiculo; i++) {

            JOptionPane.showMessageDialog(null, veiculos[i].getNome());

        }

        JOptionPane.showMessageDialog(null, "Veículos Cadastrados!");

    }

    public static void ConsultarVeiculo() {

        if (veiculos == null) {

            JOptionPane
                    .showMessageDialog(null,
                            "- CONSULTAR Veículo:\n\nVocê precisa cadastrar pelo menos 1 Veículo!\n\n");

        } else {

            int total = 1;
            lista = "";

            for (int i = 0; i < veiculos.length; i++) {

                lista += "Veiculo " + (i + 1) + "\n";
                lista += "Nome: " + veiculos[i].getNome() + "\n";
                lista += "Tanque: " + veiculos[i].getTanque() + "L"
                        + "\n";
                lista += "IPVA: " + veiculos[i].getIPVA() + "% do valor de venda" + "\n";
                lista += "Seguro: " + veiculos[i].getSeguro() + "% do valor de venda" + "\n";
                lista += "Placa: " + veiculos[i].getPlaca() + "\n";
                lista += "\n\n";
                total++;

            }

            JOptionPane.showMessageDialog(null, "- Consultar Veículo:\n\n"
                    + "Total de " + (total - 1) + " Veículos Cadastrados:\n\n"
                    + lista);

        }

    }

    public static void Sair() {

        confirma = JOptionPane.showConfirmDialog(null,
                "Quer mesmo Sair do Programa?");

    }

    /*
     * public static void limparTela() {
     * System.out.flush();
     * }
     * 
     * public static void adicionarVeiculo(Veiculo veiculo, boolean reescrever) {
     * try {
     * FileWriter arq = new FileWriter("./teste.txt", reescrever);
     * PrintWriter gravarArq = new PrintWriter(arq);
     * 
     * gravarArq.printf("[\n" + veiculo.getTanque() + "\n" +
     * veiculo.getIPVA() + "\n" +
     * veiculo.getSeguro() + "\n" +
     * veiculo.getautonomiaDiaria() + "\n" +
     * veiculo.getPlaca() + "\n]\n");
     * 
     * arq.close();
     * } catch (Exception e) {
     * System.out.println("");
     * }
     * }
     * 
     * public static void printMenu() {
     * limparTela();
     * System.out.println("Menu Frota Veículo:\n");
     * System.out.println("1 - Cadastrar veículo");
     * System.out.println("2 - Cadastrar Rotas para um veículo");
     * System.out.println("3 - Localizar um veículo da frota");
     * System.out.println("4 - Gerar currículo");
     * System.out.println("0 - Sair e salvar");
     * 
     * }
     * 
     * public static void main(String[] args) throws IOException {
     * Scanner ler = new Scanner(System.in);
     * try {
     * 
     * int k;
     * do {
     * printMenu();
     * k = ler.nextInt();
     * 
     * switch (k) {
     * case 1:
     * 
     * break;
     * case 2:
     * 
     * break;
     * case 3:
     * 
     * break;
     * case 4:
     * 
     * break;
     * default:
     * break;
     * }
     * System.out.println("Press Enter to continue...");
     * System.in.read();
     * } while (k != 0);
     * } catch (FileNotFoundException e) {
     * System.out.
     * println("Nao foi possivel inicializar o sistema, arquivos nao encontrados");
     * }
     * ler.close();
     * }
     */
}
