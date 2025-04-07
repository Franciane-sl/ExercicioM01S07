package br.comfuturo.dev.estudantes.model;

import java.util.ArrayList;
import java.util.List;

public class Database {

    //Atributos

    private static List<Estudante> estudantes = new ArrayList<>();


    // Metodo para adicionar um estudante a lista.

    public static void add (Estudante estudante) {
        Database.estudantes.add(estudante);
    }

    //Metodo para remover um estudante da lista.

    public static void remove (Integer Registro) {
        Database.estudantes.removeIf(estudante -> estudante.getRegistro().equals(Registro));
    }

    //Metodo para listar todos os estudantes.

    public static List<Estudante> listarTodosEstudantes(){
        return estudantes;
    }

    //Metodo para recuperar um estudante com base no atributo registro.

    public static Estudante recuperarEstudante (Integer Registro){
        for (Estudante estudante : estudantes){
            if (estudante.getRegistro().equals(Registro)){
                return estudante;
            }
        }

        return null;
    }
}
