package perfomaceGoals;

import java.util.Scanner;

public class task1Menu {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int opcao;

		while (true) {

			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                    LOJINHA                          ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Produto                              ");
			System.out.println("            2 - Listar Produtos                      ");
			System.out.println("            3 - Atualizar                            ");
			System.out.println("            4 - Apagar Produto                       ");
			System.out.println("            5 - Comprar                              ");
			System.out.println("            6 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");
			
			opcao = entrada.nextInt();

			if (opcao == 9) {
				System.out.println("\nA Lojinha !");

                 entrada.close();
				System.exit(0);
			}

			switch (opcao) {
				
				case 1:
					System.out.println("Produto\n\n");

					break;
				case 2:
					System.out.println("Listar Produtos\n\n");

					break;
				case 3:
					System.out.println("Atualizar \n\n");

					break;
				case 4:
					System.out.println("Apagar a Conta\n\n");

					break;
				case 5:
					System.out.println("Comprar\n\n");

					break;
				case 6:
					System.out.println("Sair\n\n");

					break;
				default:
					System.out.println("\nOpção Inválida!\n");
					break;
			}
		}
	}
    


}