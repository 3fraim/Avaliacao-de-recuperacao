/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cargosconfianca;

import Util.Util;
import endereco.Endereco;
import funcionario.Genero;
import funcionario.Setor;
import java.time.LocalDate;

/**
 *
 * @author Aluno
 */
public class Gerente extends CargoDeConfianca{

  //    CONSTRUTOR
     public Gerente(Bonificacao bonificacao, String nome, String cpf, String rg, Endereco endereco, Setor setor, Genero genero, double salario, EstadoCivil estadoCivil, LocalDate dataNascimento) {
        super(bonificacao, nome, cpf, rg, endereco, setor, genero, salario, estadoCivil, dataNascimento);
    }
     
     
//     GETTER

    public Bonificacao getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(Bonificacao bonificacao) {
        this.bonificacao = bonificacao;
    }

//salario    
    @Override
    public double getSalarioFinal() {
       return super.getSalario() + (super.bonificacao.GERENTE.valor * super.salario);
    }
    
    
//    TO STRING

    @Override
    public String toString() {
        return super.toString() + 
                "\nSalário:" +Util.formatarMonetario(getSalarioFinal()) +
                "\nBonificação:" + super.bonificacao.GERENTE.valor * 100 + " %"; 
    }
    
     
    
    
}
