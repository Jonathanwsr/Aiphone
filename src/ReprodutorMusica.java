import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class ReprodutorMusica {

    String LinkPark = "In de end";
    String MaronFive = "Memorys";
    String LegiaoUrbana = "Tempo perdido";
    String Fernandinho = "Uma nova historia";


    public static void TipoMusica() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("As playlists disponíveis são essas: Rock, mpb, Igreja, Eletronica");
        System.out.print("Faça sua escolha: ");
        String escolha = scanner.nextLine();


        if (escolha.equalsIgnoreCase("Rock")) {
            System.out.println("Reproduzindo playlist de Rock");
            String LinkPark = "In the end";
            System.out.println(" sua musica" + LinkPark);

        } else if (escolha.equalsIgnoreCase("mpb")) {
            System.out.println("Reproduzindo  sua playlist de MPB");
            String Legiaourbana = "TempoPerdido";
            System.out.println(" sua musica" + Legiaourbana);

        } else if (escolha.equalsIgnoreCase("Igreja")) {
            System.out.println("Reproduzindo  sua playlist de Igreja");
            String Fernandinho = "Uma nova historia";
            System.out.println(" sua musica" + Fernandinho);

        } else if (escolha.equalsIgnoreCase("Eletronica")) {
            System.out.println("Reproduzindo sua playlist de Eletronica");
            String Eletronica = "Memorys";
            System.out.println(" sua musica" + Eletronica);

        } else {
            System.out.println("Opção inválida");
        }

    }


    public static void TocarMusica() {

        System.out.println("A musica esta tocando");

    }


    public static void trocarMusica() {
        // Map para armazenar as músicas e seus links
        Map<String, String> musicas = new HashMap<>();
        musicas.put("LinkPark", "In the End");
        musicas.put("MaronFive", "Memories");
        musicas.put("LegiaoUrbana", "Tempo perdido");
        musicas.put("Fernandinho", "Uma nova historia");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome da música que deseja trocar: ");
        String musicaEscolhida = scanner.nextLine();


        if (musicas.containsKey(musicaEscolhida)) {
            String linkMusica = musicas.get(musicaEscolhida);

            System.out.println("Tocando: " + linkMusica);

        } else {
            System.out.println("Música não encontrada.");
        }
    }






}



























