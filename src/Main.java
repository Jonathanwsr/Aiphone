public class Main {
    public static void main(String[] args) {


        Aparelho meuAparelho = new Aparelho();

        meuAparelho.setMarca("Apple");
        meuAparelho.setModelo("iPhone 15");
        meuAparelho.setPreco(15000.0);
        meuAparelho.setAppMusica("Spofy");
        meuAparelho.setAppLigacao("Chamada");
        meuAparelho.setAppNavegador("Google");



        meuAparelho.exibirInformacoes();




        ReprodutorMusica.TipoMusica();
        ReprodutorMusica.TocarMusica();
        ReprodutorMusica.trocarMusica();
    }

}