package MenuView;

import Utils.GetListTest;
import model.Autor;
import obj.ListaDeLivros;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuPrincipal {
    public MenuPrincipal() {


        //region Esperar retorno professor
        // TODO: 30/03/2023 Verificar na correção se é necessario utilizar e implementar uma lista encadeada ou se é possivel utilizar um objeto java existente;
        // obsolet: ListaEncadeada<Livro> listaLivro = new ListaEncadeada<Livro>();
        //endregion

        var listaLivro = new ListaDeLivros();
        var autores = new ArrayList<Autor>();
        var listatesteCriada = false;
        while (true) {
            System.out.println("\n*********************************************");
            System.out.println("*** Cadastro e Consulta de Livros e Autores ***");
            System.out.println("***********************************************");
            System.out.println("Opções Disponiveis:\n ");
            System.out.println("1 - Livros ");
            System.out.println("2 - Autores");
            if (!listatesteCriada)
                System.out.println("8 - Teste(Cria lista de autores e Livros)");
            OpcoesView.digiteaOpcaoDesejada();
            switch (new Scanner(System.in).nextLine()) {
                case "1" -> {
                    MenuLivros.mostrarMenuLivros(listaLivro);
                    break;
                }
                case "2" -> {
                    MenuAutor.MostrarMenuAutores(autores);
                    break;
                }
                case "8" -> {
                    listatesteCriada = GetListTest.CriaListas(autores, listaLivro);
                }
                default -> {
                    OpcoesView.opcaoInvalida();
                }
            }
        }
    }
}