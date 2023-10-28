/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication28;

import java.util.ArrayList;

/**
 *
 * @author junior_de-oliveira
 */
public class Turma { 
     private String nome;
        ArrayList<Aluno> listaAlunos = new ArrayList<>();
        private Professor professor;
      
  
           
        public Turma(){
            this.listaAlunos = new ArrayList<Aluno>();                
        }

    Turma(Professor professor1) {
    }
        
        public void adicionarAluno(Aluno aluno){
            listaAlunos.add(aluno);
            
        }
        
       public void adicionarProfessor(Professor professor){
        this.professor = professor;
           
       } 
       public void visualizarTurma() {
    System.out.println("Lista de Alunos:");
    
    for (Aluno aluno : listaAlunos) {
     System.out.println("Nome: " + aluno.getNome() + "idade" + aluno.getIdade() + ", Nota: " + aluno.getNota());
    }
      System.out.println("Professor: " + professor.getNome() + "idade" + professor.getIdade()  + ", Salário: " + professor.getSalario());
       }    

    void vizualizarturma() {
        
    }
}


