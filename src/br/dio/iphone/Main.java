package br.dio.iphone;

public class Main {
    public static void main(String[] args) {
        iPhone meuIphone = new iPhone();

        // Testando Reprodutor Musical
        System.out.println("\n🔊 Testando Reprodutor Musical:");
        meuIphone.selecionarMusica("Imagine - John Lennon");
        meuIphone.tocar();
        meuIphone.pausar();

        // Testando Aparelho Telefônico
        System.out.println("\n📞 Testando Aparelho Telefônico:");
        meuIphone.ligar("99999-8888");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        // Testando Navegador na Internet
        System.out.println("\n🌍 Testando Navegador na Internet:");
        meuIphone.exibirPagina("https://www.apple.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}
