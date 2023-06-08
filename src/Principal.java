import classes.*;

public class Principal {
    public static void main(String[] args) throws Exception {
        int opcaoEscolhida;
        do {
            System.out.println("\nShopping Center:");
            opcaoEscolhida = Teclado.leInt("(1) criar uma loja \n(2) criar um produto \n(3) sair");

            switch (opcaoEscolhida) {
                case 1:
                    new Menu(1);
                    break;
                case 2:
                    new Menu(2);
                    break;
                case 3:
                
                    break;
            
                default:
                    System.out.println("\nOpção inválida");
                    break;
            }
        } while (opcaoEscolhida != 3);

        System.out.println("\nTchau!");
    }
}
