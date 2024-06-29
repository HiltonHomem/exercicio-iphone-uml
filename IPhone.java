public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void tocarMusica() {
        System.out.println("Tocando Música!!");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Pausando Música!!");
    }

    @Override
    public void pararMusica() {
        System.out.println("Parando Música!!");
    }

    @Override
    public void fazerChamada(String numero) {
        System.out.println("Fazendo chamada para: " + numero);
    }

    @Override
    public void atenderChamada() {
        System.out.println("Atendendo chamada!!");
    }

    @Override
    public void encerrarChamada() {
        System.out.println("Encerrando chamada!!");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarAba(String url) {
        System.out.println("Adicionando aba com URL: " + url);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página!!");
    }
}
