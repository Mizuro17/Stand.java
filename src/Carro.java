
public class Carro extends Veiculo {

    private double quilometros;
    private double cavalagem;

    public Carro() {
        super("", "", 0, 0, "");
    }

    public Carro(String marca, String cor, int limite, double cc, String tipo) {
        super(marca, cor, limite, (float) cc, tipo);
    }

    public double getQuilometros() {
        return quilometros;
    }

    public void setQuilometros(double quilometros) {
        this.quilometros = quilometros;
    }

    public double getCavalagem() {
        return cavalagem;
    }

    public void setCavalagem(double cavalagem) {
        this.cavalagem = cavalagem;
    }

    public void acelerar() {
        System.out.println("A acelerar");
    }

    public void travar() {
        System.out.println("A travar");
    }


    @Override
    public void exibirDetalhes() {
        mostrarInfo();
    }

    public void mostrarInfo() {

        String marca = getMarca();
        String cor = getCor();
        String tipo = getTipo();
        int limite = (int) getLimite();

        System.out.println(
                "Origem: " + tipo + "\n\n" +
                        "Nome: " + marca + "\n" +
                        "Cor: " + cor + "\n" +
                        "Quilometragem: " + quilometros + "\n" +
                        "Limite do motor: " + limite + " Km/H\n" +
                        "Cavalos: " + cavalagem + "\n"
        );


        if (tipo.equalsIgnoreCase("Alemão")) {
            System.out.println("Garantia: 7 anos após a venda");
        } else if (tipo.equalsIgnoreCase("Inglês")) {
            System.out.println("Garantia: 7 anos após a venda");
        } else if (tipo.equalsIgnoreCase("Japonês")) {
            System.out.println("Garantia: 10 anos após a venda");
        }


        switch (marca) {

            case "BMW M4":
                System.out.println(
                        "Informações adicionais:\n" +
                                "Este " + marca + " possui um motor semi-novo com um total de 20.000 kms percorridos " +
                                "e garantia da marca até 7 anos após a venda.\n" +
                                "Conta com mais de 20 extras, incluindo bancos aquecidos, bancos dianteiros personalizados " +
                                "pela própria marca e volante de competição feito à medida.\n" +
                                "Além disso, está limitado a " + limite + " km/h, podendo ser reconfigurado futuramente."
                );
                break;

            case "Audi A3 SportLine":
                System.out.println(
                        "Informações adicionais:\n" +
                                "Este " + marca + " apresenta um motor recente e em excelente estado, " +
                                "com apenas 18.500 kms percorridos e garantia oficial da marca válida até 6 anos após a venda.\n" +
                                "Conta com mais de 15 extras, incluindo bancos desportivos em couro com ajuste elétrico,\n" +
                                "sistema de som premium Audi Sound System, iluminação ambiente personalizável e volante\n" +
                                "multifunções desportivo revestido a couro.\n" +
                                "Além disso, o veículo encontra-se limitado eletronicamente a " + limite +
                                " km/h, mantendo margem para futuras otimizações."
                );
                break;

            case "Mercedes SLS AMG GT3":
                System.out.println(
                        "Informações adicionais:\n" +
                                "Este " + marca + " encontra-se equipado com um motor V8 atmosférico " +
                                "de alta performance, com apenas 12.000 kms de utilização em pista controlada " +
                                "e manutenção certificada pela AMG Customer Racing.\n" +
                                "O veículo inclui mais de 25 componentes específicos de competição, tais como " +
                                "bancos de fibra de carbono homologados pela FIA, sistema de extinção integrado,\n" +
                                "suspensão ajustável de competição e telemetria avançada AMG.\n\n" +
                                "Além disso, o modelo está configurado com um setup aerodinâmico otimizado e " +
                                "limitador eletrónico configurado para " + limite + " km/h."
                );
                break;

            case "Porsche 911 GT3":
                System.out.println(
                        "Informações adicionais:\n" +
                                "Este " + marca + " conta com um motor boxer de 6 cilindros " +
                                "desenvolvido pela Porsche Motorsport para oferecer resposta imediata " +
                                "e elevado desempenho em pista.\n" +
                                "O modelo inclui componentes orientados para competição, como bancos " +
                                "de fibra de carbono homologados pela FIA, suspensão ajustável, " +
                                "travões de alta performance e sistema Porsche Track Precision.\n\n" +
                                "A aerodinâmica é otimizada através de uma asa traseira regulável " +
                                "e difusor de elevada eficiência.\n" +
                                "O limitador eletrónico encontra-se configurado para cerca de " +
                                limite + " km/h."
                );
                break;

            case "McLaren MP412C GT3":
            case "McLaren":
                System.out.println(
                        "Informações adicionais:\n" +
                                "Este " + marca + " encontra-se equipado com um motor V8 biturbo " +
                                "de alta performance, com apenas 18.000 kms de utilização em pista controlada " +
                                "e manutenção certificada pela McLaren Customer Racing.\n" +
                                "O veículo inclui mais de 25 componentes específicos de competição, tais como " +
                                "bancos de fibra de carbono homologados pela FIA, sistema de extinção integrado,\n" +
                                "suspensão ajustável de competição e telemetria avançada McLaren.\n\n" +
                                "Além disso, o modelo está configurado com um setup aerodinâmico otimizado e " +
                                "limitador eletrónico configurado para " + limite + " km/h."
                );
                break;

            case "Nissan Skyline R34":
                System.out.println(
                        "Informações adicionais:\n" +
                                "Este " + marca + " está equipado com o icónico motor RB26DETT, " +
                                "um motor de 6 cilindros em linha bi-turbo, combinado com o sistema de " +
                                "tração integral ATTESA E-TS e direção às quatro rodas Super-HICAS.\n" +
                                "Inclui suspensão ajustável, travões de alta performance, bancos " +
                                "desportivos e monitor multifunções (MFD) para dados de telemetria.\n\n" +
                                "A aerodinâmica é otimizada através de uma asa traseira ajustável e " +
                                "difusor traseiro.\n" +
                                "O limitador eletrónico permite atingir aproximadamente " + limite + " km/h."
                );
                break;

            default:
                System.out.println("Não existem informações adicionais para este veículo.");
                break;
        }
    }
}
