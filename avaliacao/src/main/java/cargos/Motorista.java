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
public class Motorista extends Funcionario{
    private String carteiraDeHabilitacao;
    
//    CONSTRUTOR

    public Motorista(String carteiraDeHabilitacao, String nome, String cpf, String rg, Endereco endereco, Setor setor, Genero genero, double salario, EstadoCivil estadoCivil, LocalDate dataNascimento) {
        super(nome, cpf, rg, endereco, setor, genero, salario, estadoCivil, dataNascimento);
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }
    
    
//    GETTER E SETTER

    public String getCarteiraDeHabilitacao() {
        return carteiraDeHabilitacao;
    }

    public void setCarteiraDeHabilitacao(String carteiraDeHabilitacao) {
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }
    
    //SALARIO

    @Override
    public double getSalarioFinal() {
        return super.getSalario();
    }
    
    
//    TO STRING

    @Override
    public String toString() {
        return super.toString() + 
                "\nCarteira de Habilitação:" + carteiraDeHabilitacao + 
                "\nSalário:" + Util.formatarMonetario(getSalarioFinal());
    }
    
    
    
}
