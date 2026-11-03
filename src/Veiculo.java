public abstract class Veiculo {

    private String marca;
    private String cor;
    private int limite;
    private float cc;
    private String tipo;


    public Veiculo(String marca, String cor, int limite, float cc, String tipo) {
        this.marca = marca;
        this.cor = cor;
        this.limite = limite;
        this.cc = cc;
        this.tipo = tipo;
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }

    public float getCc() {
        return cc;
    }

    public void setCc(float cc) {
        this.cc = cc;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public abstract void exibirDetalhes();
}