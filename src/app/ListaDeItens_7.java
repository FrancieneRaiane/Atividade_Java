package app;

public class ListaDeItens_7 {
    public static void main(String[] args) {
        // Criando um array com 10 itens (exemplo: nomes de frutas)
        String[] itens = {
            "Maçã", "Banana", "Laranja", "Uva", "Abacaxi",
            "Manga", "Pera", "Melancia", "Kiwi", "Morango"
        };

        // Imprimindo os itens da lista
        System.out.println("A Lista de Itens é:");
        for (int i = 0; i < itens.length; i++) {
            System.out.println((i + 1) + " - " + itens[i]);
        }
    }
}

