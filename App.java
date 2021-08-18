import java.util.Scanner;

public class App {
    private Veiculo[] cadastro;
    private Scanner sc;

    public App() {
        cadastro = new Veiculo[5];
        cadastro[0] = new Veiculo(new Placa("Brasil", "ABC0C01"));
        cadastro[1] = new Veiculo(new Placa("Brasil", "ABC0C02"));
        cadastro[2] = new Veiculo(new Placa("Brasil", "ABC0C03"));
        cadastro[3] = new Veiculo(new Placa("Brasil", "ABC0C04"));
        cadastro[4] = new Veiculo(new Placa("Brasil", "ABC0C05"));
        sc = new Scanner(System.in);
    }

    public void opcaoAbastecer() {
        System.out.println("Selecionou opcao abastercer");
        System.out.println("Digite a placa: ");
        String placa = sc.nextLine();
        System.out.println("Placa: " + placa);
        // solicitar a placa
        // procurar veiculo no cadastro
        // solicitar a quantidade de combustivel
        // chamar metodo abastece do veiculo
    }

    public void menu() {
        System.out.println("Menu principal");
        System.out.println("1 - Abastecer");
        System.out.println("2 - Dirigir");
        System.out.println("3 - Encerrar");
        System.out.print("Selecione uma das opções: ");
        
        int opcao = Integer.parseInt(sc.nextLine());
        switch(opcao) {
            case 1:
                opcaoAbastecer();
                break;
            case 2:
                System.out.println("Selecionou opcao dirigir");
                break;
            case 3:
                System.out.println("Selecionou opcao encerrar");
                break;
            default:
                System.out.println("Selecionou opcao inválida");
        }
    }

    public static void main(String args[]) {
        App app = new App();
        app.menu();
    }
}