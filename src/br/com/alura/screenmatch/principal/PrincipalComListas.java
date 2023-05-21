package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        var filme1 = new Filme("Star Wars: Episódio I", 1999);
        filme1.avalia(9);

        var filme2 = new Filme("Star Wars: Episódio II", 2002);
        filme2.avalia(10);

        var filme3 = new Filme("Star Wars: Episódio III – A Vingança dos Sith", 2005);
        filme3.avalia(8);

        var filme4 = filme3;

        var serie1 = new Serie("Lost", 2000);



        List<Titulo> lista = new LinkedList<>();
        lista.add(filme1);
        lista.add(filme2);
        lista.add(filme3);
        lista.add(serie1);

        for (Titulo item: lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação " + filme.getClassificacao());
            }
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Karl Urban");
        buscaPorArtista.add("Jason Mamoa");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println(buscaPorArtista);

        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordendo por ano");
        System.out.println(lista);
    }
}
