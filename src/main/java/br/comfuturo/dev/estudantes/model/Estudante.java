package br.comfuturo.dev.estudantes.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.Objects;

public class Estudante {

    //Atributos.

    @NotNull (message = "O registro não pode ser nulo.")
    private Integer Registro;

    @NotBlank (message = "O nome não pode ser vazio.")
    @Size (min = 3 , message = "O nome deve ter pelo menos 3 caracteres.")
    private String Nome;

    @NotBlank (message = "O email não pode ser vazio.")
    @Email (message = " O email deve ser valido.")
    private String Email;

    //Contrutor Padrão.

    public Estudante() {
    }

    //Contrutor Parametrizado.

    public Estudante(Integer registro, String nome, String email) {
        Registro = registro;
        Nome = nome;
        Email = email;
    }

    //Get e Set


    public Integer getRegistro() {
        return Registro;
    }

    public void setRegistro(Integer registro) {
        Registro = registro;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    //Metodo Equals

    @Override

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Estudante estudante = (Estudante) obj;
        return Objects.equals(Registro, estudante.Registro);
    }

    //Metodo HashCode.

    @Override

    public int hashCode() {
        return Objects.hash(Registro);
    }

    //Metodo ToString

    @Override

    public String toString() {
        return "Estudante{" + "Registro=" + Registro + ", Nome='" + Nome + '\'' + ", Email='" + Email + '\'' + '}';
    }
}
