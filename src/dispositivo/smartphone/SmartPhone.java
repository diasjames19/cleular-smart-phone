package dispositivo.smartphone;


import dispositivo.navegadorInternet.navegadorWeb;
import dispositivo.reprodutorMusical.Ipod;
import dispositivo.secretaria.Gravadora;
import dispositivo.telefonia.oprecacaoChamada;

public class SmartPhone implements Gravadora, oprecacaoChamada,Ipod,navegadorWeb{

    @Override
    public void correioDeVoz() {
        // TODO Auto-generated method stub
        System.out.println("SmartPhone - Ouvindo Recado");
    }

   
    @Override
    public void tocarMusica() {
        // TODO Auto-generated method stub
        System.out.println("SmartPhone - Tocando Musica");

    }

    @Override
    public void pausarMusica() {
        // TODO Auto-generated method stub
        System.out.println("SmartPhone - Pausando Musica");

    }

    @Override
    public void selecionarMusica() {
        // TODO Auto-generated method stub
        System.out.println("SmartPhone - Selecionando Musica");

    }

    @Override
    public void realizandoChamada() {
        // TODO Auto-generated method stub
        System.out.println("SmartPhone - Realizanado Chamada");

    }

    @Override
    public void recebendoChamada() {
        // TODO Auto-generated method stub
        System.out.println("SmartPhone - Recebendo Chamada");

    }


    @Override
    public void acessarPagina() {
        // TODO Auto-generated method stub
        System.out.println("SmartPhone - Acessando Pagina na Internet");
    }


    @Override
    public void atualizarPagina() {
        // TODO Auto-generated method stub
        System.out.println("SmartPhone - Atualizando Pagina na Internet");
    }


    @Override
    public void adicionarPagina() {
        // TODO Auto-generated method stub
        System.out.println("SmartPhone - Adicionando uma nova Pagina de Navegação");
    }
    
    
}
