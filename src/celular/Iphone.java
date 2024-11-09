package celular;

import apps.AparelhoTelefonico;
import apps.NavegadorInternet;
import apps.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    //Reprodutor de Música
    public void tocar() {
        System.out.println("Tocando música....");
    }

    public void pausar() {
        System.out.println("Música pausada!");
    }

    public String selecionarMusica(String musica) {
        return "Música "+musica+" selecionada com sucesso!\nPressione tocar para começar inicia-la.";
    }

    //Aparelho Telefônico
    public String ligar(String numero){
        return "Ligando para "+numero+"...";
    }

    public void atender(){
        System.out.println("Alo...(Ligação atendida)");
    }

    public void iniciarCorreioVoz(){
        System.out.println("Ligação não atendida, iniciando correio de voz...");
    }

    //Navegador na Internet
    public String exibirPagina(String url){
        return "Página acessada: "+url;
    }

    public void adicionarNovaAba(){
        System.out.println("Nova aba adicionada com sucesso!");
    }

    public void atualizarPagina(){
        System.out.println("Página atualiza com sucesso!");
    }
}
