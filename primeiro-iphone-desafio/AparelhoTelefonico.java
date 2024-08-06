public abstract class AparelhoTelefonico {
    NavegadorInternet navegadorInternet = new NavegadorInternet();
    ReprodutorMusical reprodutorMusical = new ReprodutorMusical();

    public void ligar(String tel){
        System.out.println("Ligando para " + tel);
    }

    public void atender(){
        System.out.println("Atendendo ligacao...");
    }

    public void iniciarCorreioVoz(){
        System.out.println("Indo para a caixa postal...");
    }

    public void voltarHome(){
        System.out.println("\nVoltando para a tela inicial...\n");
    }

    public void desbloquear(){
        System.out.println("Desbloquendo aparelho.\n");
    }

    public void bloquear(){
        System.out.println("\nDesligando a tela.");
    }
}
