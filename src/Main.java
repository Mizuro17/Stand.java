import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

/**************** Carros Disponíveis ****************/

        Carro M4 = new Carro("BMW M4", "Azul", 225, 220,"Alemão");
        Carro AudiS = new Carro("Audi A3 SportLine", "Branco", 185, 130, "Alemão");
        Carro Mercedes = new Carro("Mercedes SLS AMG GT3", "Preto", 300, 550, "Alemão" );
        Carro McLaren = new Carro("McLaren MP412C GT3", "Preto", 341, 750, "Inglês");
        Carro Porsche = new Carro("Porsche 911 GT3", "Branco", 311, 510,"Alemão");
        Carro Nissan = new Carro("Nissan Skyline R34", "Azul e Branco", 250, 350, "Japonês");

        System.out.println("\t\t\t\t|------- README.md dos Carrões -----|\n" +
                           "\n\n------- Login -----" +
                           "\nUtilizador: "

        );
        String Utilizador = sc.nextLine();

/**************** Validação de Password ****************/

        for (int i = 3; i > 0; i--) {
            System.out.println("\nPassword: ");
            int Password = sc.nextInt();
            if (i == 1 && Password != 1234) {
                System.out.println("Tentativas esgotadas, tente novamente mais tarde!");
                return;
            }
            if (Password != 1234) {
                System.out.println("Password incorreta, tem " + (i - 1) + " tentativas");
            } else if (Password == 1234) {
                System.out.println("Login feito com sucesso!\n\n");
                System.out.println("\t\t\t\t|------- Bem-vindo " + Utilizador + "-----|\n\n");
                break;
            }
        }
/**************** MENU ****************/

        int opcao, opcaoCarros, opcaoDetalhes, resposta;

        do {
            System.out.println("------- 1 - Comprar -----");
            System.out.println("------- 2 - Vender -----");
            System.out.println("------- 3 - Alugar -----");
            System.out.println("------- 0 - SAIR -----");

            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    do {
                        System.out.println("\n\t\t\t\t------- Carros Disponiveis -----\n\n");
                        System.out.println("1 - " + M4.getMarca() + "\n" +
                                           "2 - "  + AudiS.getMarca() + "\n" +
                                           "3 - " + Mercedes.getMarca() + "\n" +
                                           "4 - " + McLaren.getMarca() + "\n" +
                                           "5 - " + Porsche.getMarca() + "\n" +
                                           "6 - " + Nissan.getMarca() + "\n" +
                                           "0 - Voltar\n\n"+
                                           "Opção: "
                        );

                        opcaoCarros = sc.nextInt();
                        switch (opcaoCarros) {
                            case 1:
                                do {
                                    System.out.println("\t\t\t\t\t\t------- Sobre o " + M4.getMarca() + " -----\n");
                                    M4.mostrarInfo();

                                    System.out.println("\n----- Registo -----\n" +
                                                       "Custo - 75.000€ \n\n" +
                                                       "1 - Confirmar pagamento \n" +
                                                       "0 - Voltar" +
                                                       "Opção: "
                                    );

                                    opcaoDetalhes = sc.nextInt();
                                    if (opcaoDetalhes == 1) {
                                        System.out.println("\nObrigado pela compra " + Utilizador + "!");
                                    }
                                } while (opcaoDetalhes != 0);
                                break;

                            case 2:
                                do {
                                    System.out.println("------- Sobre o " + AudiS.getMarca() + " -----\n");
                                    AudiS.mostrarInfo();

                                    System.out.println("\n----- Registo -----\n" +
                                            "Custo - 25.000€ \n\n" +
                                            "1 - Confirmar pagamento \n" +
                                            "0 - Voltar" +
                                            "Opção: "
                                    );

                                    opcaoDetalhes = sc.nextInt();
                                    if (opcaoDetalhes == 1) {
                                        System.out.println("\nObrigado pela compra " + Utilizador + "!");
                                    }
                                } while (opcaoDetalhes != 0);
                                break;

                            case 3:
                                do {
                                    System.out.println("------- Sobre o " + Mercedes.getMarca() + " -----\n");
                                    Mercedes.mostrarInfo();

                                    System.out.println("\n----- Registo -----\n" +
                                            "Custo - 450.000€ \n\n" +
                                            "1 - Confirmar pagamento \n" +
                                            "0 - Voltar" +
                                            "Opção: "
                                    );

                                    opcaoDetalhes = sc.nextInt();
                                    if (opcaoDetalhes == 1) {
                                        System.out.println("\nObrigado pela compra " + Utilizador + "!");
                                    }
                                } while (opcaoDetalhes != 0);
                                break;

                            case 4:
                                do {
                                    System.out.println("\t\t\t\t------- Sobre o " + McLaren.getMarca() + " -----\n");
                                    McLaren.mostrarInfo();

                                    System.out.println("\n----- Registo -----\n" +
                                            "Custo - 250.000€ \n\n" +
                                            "1 - Confirmar pagamento \n" +
                                            "0 - Voltar" +
                                            "Opção: "
                                    );

                                    opcaoDetalhes = sc.nextInt();
                                    if (opcaoDetalhes == 1) {
                                        System.out.println("\nObrigado pela compra " + Utilizador + "!");
                                    }
                                } while (opcaoDetalhes != 0);
                                break;

                            case 5:
                                do {
                                    System.out.println("------- Sobre o " + Porsche.getMarca() + " -----\n");
                                    Porsche.mostrarInfo();

                                    System.out.println("\n----- Registo -----\n" +
                                            "Custo - 150.000€ \n\n" +
                                            "1 - Confirmar pagamento \n" +
                                            "0 - Voltar" +
                                            "Opção: "
                                    );

                                    opcaoDetalhes = sc.nextInt();
                                    if (opcaoDetalhes == 1) {
                                        System.out.println("\nObrigado pela compra " + Utilizador + "!");
                                    }
                                } while (opcaoDetalhes != 0);
                                break;

                            case 6:
                                do {
                                    System.out.println("------- Sobre o " + Nissan.getMarca() + " -----\n");
                                    Nissan.mostrarInfo();

                                    System.out.println("\n----- Registo -----\n" +
                                            "Custo - 50.000€ \n\n" +
                                            "1 - Confirmar pagamento \n" +
                                            "0 - Voltar \n" +
                                            "Opção: "
                                    );
                                    opcaoDetalhes = sc.nextInt();
                                    if (opcaoDetalhes == 1) {
                                        System.out.println("\nObrigado pela compra " + Utilizador + "!");
                                    }
                                } while (opcaoDetalhes != 0);
                                break;

                        }
                    } while (opcaoCarros != 0);
                    break;

                case 2:
                    do {
                        Carro Venda = new Carro();
                        System.out.println("\n\t\t\t\t------- Info Necessária -----\n\n");
                        System.out.println("Marca: ");
                        String marca = sc.next();
                        System.out.println("\nCor: ");
                        String cor = sc.next();

                        System.out.println("\nVelocidade máxima atingida: ");

                        int limite = sc.nextInt();

                        System.out.println("\nQuanto tem de Cilindrada: ");
                        double cc = 0;
                        do {
                                try {
                                    cc = sc.nextDouble();
                                } catch (Exception e) {
                                    System.out.println("Tenta usar vírgula (1,5) ao invés de ponto (1.5)!");
                                    break;
                                }

                        } while (cc == 0);

                        if (cc == 0) {
                            cc = 1.5;
                        }


                        System.out.println("\nÉ original de: \n");
                        sc.nextLine();
                        String tipo = sc.nextLine();

                        // Validação de tipo \\

                        if (tipo.equals("Japão") || tipo.equals("japão") || tipo.equals("Japao") || tipo.equals("japao")) {
                            tipo = "Japão";
                        } else if (tipo.equals("Inglês") || tipo.equals("inglês") || tipo.equals("Ingles") || tipo.equals("ingles")) {
                            tipo = "Inglês";
                        } else if (tipo.equals("Alemão") || tipo.equals("alemão") || tipo.equals("Alemao") || tipo.equals("alemao")) {
                            tipo = "Alemão";
                        }

                        Venda = new Carro(marca, cor, limite, cc, tipo);
                        System.out.println("Estamos diante de um " + Venda.getMarca() + " de cor " +
                                Venda.getCor() + " e uma velocidade máxima atingida de " + Venda.getLimite() + " km/h, confirma?");

                        System.out.println("\n1 - Sim\n0 - Não\n\nOpção: ");
                        resposta = sc.nextInt();
                    } while (resposta != 1);
                    break;
            }

        } while (opcao != 0);
    }
}