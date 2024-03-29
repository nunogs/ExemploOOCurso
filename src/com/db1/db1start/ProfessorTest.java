package com.db1.db1start;

import org.junit.Assert;
import org.junit.Test;

public class ProfessorTest {


    @Test
    public void deveCriarProfessorPorMeioDoConstrutor() {
        Professor professor = new Professor("maiko.cunha@bd1.com.br", "Maiko Cunha");
        String email = "maiko.cunha@bd1.com.br";
        String nome = "Maiko Cunha";
        Assert.assertEquals(email, professor.getEmail());
        Assert.assertEquals(nome, professor.getNome());
    }
    @Test
    public void deveCriarExecaoComEmailNulo(){
        try{
            new Professor ( null , "Jhow");
        }catch (CampoNaoPodeSerNulo naoPodeSerNulo){
            Assert.assertEquals("Email não pode ser nulo", naoPodeSerNulo.getMessage());
        }
    }
    @Test
    public void deveCriarExecaoComNomeNulo(){
        try{
            new Professor( "jhow@gmail.com", null);
        }catch (CampoNaoPodeSerNulo naoPodeSerNulo){
            Assert.assertEquals("Nome não pode ser nulo", naoPodeSerNulo.getMessage());
        }
    }
}