class ListaClientes{
        public static void main(String[] args) {
    System.out.println(">>>>>Listagem de Clientes");
    System.out.println("____________________");


    String cliente1 ="Alex";
    int AnodeNascimentocliente1= 1980;
    int AnodeNascimentocliente2 = 2000;

    System.out.println("Nome: " + cliente1);
    System.out.println("Data de Nascimento: " + AnodeNascimentocliente1);
    System.out.println("____________________");
    System.out.println("");

    String Cliente2 = "Matheus";

    System.out.println("Data de Nascimento: " + AnodeNascimentocliente2);

    System.out.println("Nome:" + Cliente2);

    System.out.println("seja bem vindo ao comex!");

}}
public class Main {
    public static void main(String[] args) {
        System.out.println("Seja bem vindo a livraria Comex!");

        System.out.println("--------------------------------");
        System.out.println(">>> Listagem de produtos");
        System.out.println("--------------------------------");
        String livro = "Diário de um detento";
        String preco1 = "R$50,00";
        System.out.println("Nome: " + livro);
        System.out.println("Preço: " + preco1);

        System.out.println("--------------------------------");

        String celular = "Iphone 15 Pro Max";
        String preco2 = "R$15.000,00";
        System.out.println("Nome: " + celular);
        System.out.println("Preço: " + preco2);
        System.out.println("--------------------------------");

        for (int i = 1; i <= 5; i++) {


            System.out.print(i);
        }
    }
}