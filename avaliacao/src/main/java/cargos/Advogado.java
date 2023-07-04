/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cargos;

import Util.Util;
import endereco.Endereco;
import funcionario.Funcionario;
import funcionario.Genero;
import funcionario.Setor;
import java.time.LocalDate;

/**
 *
 * @author Aluno
 */
public class Advogado extends Funcionario{
    private String oab;
    
    
//    CONSTRUTOR

    public Advogado(String crea, String nome, String cpf, String rg, Endereco endereco, Setor setor, Genero genero, double salario, EstadoCivil estadoCivil, LocalDate dataNascimento) {
        super(nome, cpf, rg, endereco, setor, genero, salario, estadoCivil, dataNascimento);
        this.oab = oab;
    }
  
    
//    GETTER E SETTER

    public String getOab() {
        return oab;
    }

    public void setOab(String oab) {
        this.oab = oab;
    }

//    SALARIO
    @Override
    public double getSalarioFinal() {
      return super.getSalario();
    }
    
    
//TO STRING

    @Override
    public String toString() {
        return super.toString() + 
                "\nOab:" + oab + 
                "\nSalário:" + Util.formatarMonetario(getSalarioFinal());
    }
    

    
    
}
