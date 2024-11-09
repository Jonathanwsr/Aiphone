public class Aparelho {

    private String marca;
    private String modelo;
    private double preco;
    private String appMusica;
    private String appNavegador;
    private String appLigacao;

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public void setAppMusica(String appMusica) {
        this.appMusica = appMusica;
    }

    public String getAppMusica() {
        return appMusica;
    }

    public void setAppNavegador(String appNavegador) {
        this.appNavegador = appNavegador;
    }

    public String getAppNavegador() {
        return appNavegador;
    }

    public void setAppLigacao(String appLigacao) {
        this.appLigacao = appLigacao;
    }

    public String getAppLigacao() {
        return appLigacao;
    }

    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Preço: R$" + preco);
        System.out.println("App de Música: " + appMusica);
        System.out.println("App de Navegação: " + appNavegador);
        System.out.println("App de Ligação: " + appLigacao);
    }
}
