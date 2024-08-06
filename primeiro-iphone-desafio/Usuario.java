public class Usuario extends AparelhoTelefonico {
    // Simulação de uso
    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        usuario.desbloquear();

        // Navegando na Internet
        usuario.navegadorInternet.pesquisar("Fotos de gato");
        usuario.navegadorInternet.exibirPagina();
        usuario.navegadorInternet.atualizarPagina();
        usuario.navegadorInternet.adicionarNovaAba();
        usuario.navegadorInternet.selecionarAba(1);
        usuario.voltarHome();

        // Ouvindo música
        usuario.reprodutorMusical.selecionarMusica("Clair de lune");
        usuario.reprodutorMusical.aumentarVolume();
        usuario.reprodutorMusical.diminuirVolume();
        usuario.reprodutorMusical.pausar();
        usuario.reprodutorMusical.pausar();
        usuario.reprodutorMusical.tocar();
        usuario.reprodutorMusical.tocar();
        usuario.voltarHome();

        // Ligando para alguém
        usuario.ligar("+551912345678");
        usuario.iniciarCorreioVoz();
        usuario.atender();

        // Fim da simulação de uso
        usuario.bloquear();
    }
}
