package com.globant.accounttests;

import org.testng.AssertJUnit;
import org.testng.annotations.*;

public class InactiveUser {

    @BeforeSuite
    public void precondition(){
        System.out.println("Iniciando navegador...");
        AssertJUnit.assertTrue("Inicio navegador",true);
    }

    @BeforeClass
    public void loginAccount(){
        System.out.println("Iniciar sesión");
        AssertJUnit.assertTrue("Sesión iniciada",true);
    }

    @BeforeMethod
    public void loadSetting(){
        System.out.println("Ver configuraciones");
        AssertJUnit.assertTrue("Configuraciones cargadas",true);
    }

    @Test
    public void inactiveUser(){
        System.out.println("Inactivar cuenta usuario");
        AssertJUnit.assertTrue("Cuenta inactivada",true);
    }

    @AfterMethod
    public void logout (){
        System.out.println("Cerrar sesión");
        AssertJUnit.assertTrue("Sesión cerrada",true);
    }

    @AfterClass
    public void closeBrowser(){
        System.out.println("Cerrando navegador...");
        AssertJUnit.assertTrue("Navegador cerrado",true);
    }
}
