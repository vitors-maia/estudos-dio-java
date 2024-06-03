public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private String modelo;
    private int armazenamento;

    public iPhone(String modelo, int armazenamento) {
        this.modelo = modelo;
        this.armazenamento = armazenamento;
    }

    public String getModelo() {
        return modelo;
    }

    public int getArmazenamento() {
        return armazenamento;
    }

    public void tocar() {
        System.out.println("TOCANDO MÚSICA");
    }

    public void pausar() {
        System.out.println("PAUSANDO MÚSICA");
    }

    public void selecionarMusica(String musica) {
        System.out.println("SELECIONANDO MÚSICA: " + musica);
    }

    public void ligar(String numero) {
        System.out.println("LIGANDO PARA " + numero + "...");
    }

    public void atender() {
        System.out.println("ATENDENDO CHAMADA");
    }

    public void iniciarCorreioVoz() {
        System.out.println("INICIANDO CORREIO DE VOZ");
    }

    public void exibirPagina(String url) {
        System.out.println("EXIBINDO PÁGINA: " + url);
    }

    public void adicionarNovaAba() {
        System.out.println("ADICIONANDO NOVA ABA");
    }

    public void atualizarPagina() {
        System.out.println("ATUALIZANDO PÁGINA");
    }
}
