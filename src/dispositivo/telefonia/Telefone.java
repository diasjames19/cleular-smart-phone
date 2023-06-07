package dispositivo.telefonia;

public class Telefone implements oprecacaoChamada{
    
    public void recebendoChamada(){
        System.out.println("Recebendo");
    }

    @Override
    public void realizandoChamada() {
        // TODO Auto-generated method stub
        System.out.println("Ligando");

    }
}
