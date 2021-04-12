package com.globant.accounttests;

import org.testng.AssertJUnit;
import org.testng.annotations.*;

public class Login {

    @BeforeSuite
    public void precondition(){
        System.out.println("Iniciando navegador...");
        AssertJUnit.assertTrue("Inicio navegador",true);
    }

    @BeforeClass
    public void accountValidation(){
        System.out.println("Cuenta existente en ESPN");
        AssertJUnit.assertTrue("Validacion cuenta",true);
    }

    @BeforeMethod
    public void fillOutFields(){
        System.out.println("Ingresar usuario");
        System.out.println("Ingresar contraseña");
        AssertJUnit.assertTrue("Formulario completado",true);
    }

    @Test
    public void login(){
        System.out.println("Iniciando sesión...");
        AssertJUnit.assertTrue("Sesion iniciada",true);
    }

    @AfterMethod
    public void loadESPNWeb (){
        System.out.println("Ver contenido");
        AssertJUnit.assertTrue("Contenido mostrado",true);
    }

    @AfterClass
    public void closeBrowser(){
        System.out.println("Cerrando navegador...");
        AssertJUnit.assertTrue("Navegador cerrado",true);
    }
}
