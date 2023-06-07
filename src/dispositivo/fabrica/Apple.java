package dispositivo.fabrica;

import dispositivo.smartphone.SmartPhone;

public class Apple {
     public static void main(String[] args) {
        SmartPhone iphone = new SmartPhone();

        iphone.realizandoChamada();
        iphone.correioDeVoz();
        iphone.recebendoChamada();
        iphone.tocarMusica();
        iphone.pausarMusica();
        iphone.selecionarMusica();
        iphone.acessarPagina();
        iphone.adicionarPagina();
        iphone.atualizarPagina();
    }

    
    
}
