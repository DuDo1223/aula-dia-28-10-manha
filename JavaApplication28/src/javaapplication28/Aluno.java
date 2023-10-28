/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication28;

/**
 *
 * @author junior_de-oliveira
 */
public class Aluno extends Pessoa {
      private Double nota;

    public Aluno(String nome, int idade) {
        super(nome, idade);
    }
    public double getNota() {
    return nota;
}

public void setNota(double nota) {
    this.nota = nota;
}

  
}
