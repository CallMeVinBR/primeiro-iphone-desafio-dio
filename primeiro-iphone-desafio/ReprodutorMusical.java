public class ReprodutorMusical implements IMidia{
    private String musica;
    private int volume = 7;
    private boolean tocando = false;

    @Override
    public void tocar(){
        if(!tocando) {
            tocando = true;
            System.out.println("Tocando musica " + musica + " no volume " + volume);
        }
        else{
            System.out.println("A musica ja esta tocando.");
        }
    }

    @Override
    public void pausar(){
        if(tocando) {
            tocando = false;
            System.out.println("\nMusica pausada!");
        }
        else{
            System.out.println("A musica ja esta pausada.");
        }
    }

    @Override
    public void aumentarVolume() {
        volume++;
        System.out.println("Aumentando o volume para " + volume);
    }

    @Override
    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo o volume para " + volume);
    }

    public void selecionarMusica(String musica){
        this.musica = musica;
        System.out.println("Selecionando a musica: " + musica);
        tocar();
    }
}
