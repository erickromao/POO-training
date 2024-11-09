import celular.Iphone;

public class Usuario {
    public static void main(String[] args){
        Iphone celular = new Iphone();

        System.out.println(celular.ligar("123123123"));
        System.out.println(celular.selecionarMusica("snoop"));
        celular.tocar();
    }
}
