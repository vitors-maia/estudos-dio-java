public class Main {
    public static void main(String[] args) {
        iPhone meuIPhone = new iPhone("iPhone 12", 128);

        System.out.println("Testando ReprodutorMusical");
        meuIPhone.tocar();
        meuIPhone.pausar();
        meuIPhone.selecionarMusica("Imagine - John Lennon");

        System.out.println("Testando AparelhoTelefonico");
        meuIPhone.ligar("123456789");
        meuIPhone.atender();
        meuIPhone.iniciarCorreioVoz();

        System.out.println("Testando NavegadorInternet");
        meuIPhone.exibirPagina("www.example.com");
        meuIPhone.adicionarNovaAba();
        meuIPhone.atualizarPagina();
    }
}
