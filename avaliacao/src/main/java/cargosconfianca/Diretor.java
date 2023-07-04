/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cargosconfianca;

import Util.Util;
import endereco.Endereco;
import funcionario.Funcionario;
import funcionario.Genero;
import funcionario.Setor;
import interfaces.Contratacao;
import java.time.LocalDate;

/**
 *
 * @author Aluno
 */
public class Diretor extends CargoDeConfianca implements Contratacao{
    private double PREMIO=0.5;
    
//    CONSTRUTOR

    public Diretor(Bonificacao bonificacao, String nome, String cpf, String rg, Endereco endereco, Setor setor, Genero genero, double salario, EstadoCivil estadoCivil, LocalDate dataNascimento) {
        super(bonificacao, nome, cpf, rg, endereco, setor, genero, salario, estadoCivil, dataNascimento);
    }
    
    
    //getter

    public double getPREMIO() {
        return PREMIO;
    }

    public void setPREMIO(double PREMIO) {
        this.PREMIO = PREMIO;
    }

//    SALARIO
    @Override
    public double getSalarioFinal() {
     return super.salario + (super.salario * super.bonificacao.DIRETOR.valor) + (super.salario * PREMIO);   
    }

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("Contratado" +funcionario);
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("Demitido" +funcionario);
    }
    
    
//    to string

    @Override
    public String toString() {
        return super.toString() + 
                "\nPrêmio:" + PREMIO * 100 + " %" +
                "\nSalário:" +Util.formatarMonetario(getSalarioFinal());
    }
    
    
    
    
    
}
