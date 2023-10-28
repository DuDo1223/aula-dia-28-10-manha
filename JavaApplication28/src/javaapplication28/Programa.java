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
public class Programa{
  
    public static void main(String[] args){
        
        Professor professor1 = new Professor ("joao",35 , 5000.00);
        Aluno aluno1 = new Aluno ("maria", 15 , 9.5);
         Aluno aluno2 = new Aluno ("carlos", 16 , 8.5);
         
        Turma turma = new Turma(professor1);
        
        turma.adicionarAluno(aluno1);
        turma.adicionarAluno(aluno2);
            turma.vizualizarturma();           
        }
    
    
}
