/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package main;

import cargos.Advogado;
import cargos.Motorista;
import endereco.Endereco;
import endereco.UnidadeFederativa;
import funcionario.Genero;
import funcionario.Setor;
import java.time.LocalDate;
import java.time.Month;
import Util.Util;
import cargosconfianca.Bonificacao;
import cargosconfianca.Diretor;
import cargosconfianca.Gerente;
/**
 *
 * @author Aluno
 */
public class Main {

    public static void main(String[] args) {
     Advogado advogado = new advogado("1", "Felipe", "000.000.000-00", "00000000000", new Endereco("Rua 1", "1", "Bairro 1", "11111-111", "Salvador", UnidadeFederativa.BAHIA), Setor.JURIDICO, Genero.MASCULINO, 1000, EstadoCivil.SOLTEIRO, LocalDate.of(2003, Month.JUNE, 6));
       Motorista motorista = new motorista("22222", "Andrea", "000.000.000-00", "111111111", new Endereco("Rua 2", "2", "Bairro 2", "33333-333", "Guarulhos", UnidadeFederativa.SAO_PAULO), Setor.OPERACOES, Genero.FEMININO, 2000, EstadoCivil.DIVORCIADO, LocalDate.of(2002, Month.JUNE, 6));
       Gerente gerente = new Gerente(Bonificacao.GERENTE, "Adolfo", "000.000.000-00", "00000000", new Endereco("Rua 3", "3", "Bairro 3", "33333-333", "Copacabana", UnidadeFederativa.RIO_DE_JANEIRO), Setor.OPERACOES, Genero.MASCULINO, 2000, EstadoCivil.VIUVO, LocalDate.of(2001, Month.MARCH, 6));
       Diretor diretor = new Diretor(Bonificacao.DIRETOR, "Rosa", "000.000.000-00", "0000000000", new Endereco("Rua 4", "4", "Bairro 4", "44444-444", "Camaçari", UnidadeFederativa.BAHIA), Setor.OPERACOES, Genero.FEMININO, 2000, EstadoCivil.CASADO, LocalDate.of(2000, Month.MARCH, 6));
//        System.out.println(Advogado);
//        System.out.println("");
//        System.out.println(Motorista);
//        System.out.println("");
//        System.out.println(gerente);
//        System.out.println("");

        System.out.println(diretor);
        System.out.println("");
        
        System.out.println("advogado:");
        diretor.admitir(advogado);
        System.out.println("");
        System.out.println("Motorista:");
        diretor.demitir(motorista);
        System.out.println("");
        System.out.println("Diretor:");
        diretor.admitir(gerente);
    }
}
