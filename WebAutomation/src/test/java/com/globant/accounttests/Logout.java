package com.globant.accounttests;

import org.testng.AssertJUnit;
import org.testng.annotations.*;

public class Logout {

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
    public void loadESPNWeb(){
        System.out.println("Ver contenido");
        AssertJUnit.assertTrue("Contenido mostrado",true);
    }

    @Test
    public void logout(){
        System.out.println("Cerrar sesión");
        AssertJUnit.assertTrue("Sesion cerrada",true);
    }

    @AfterMethod
    public void loadESPNWebMain (){
        System.out.println("Mostrar página principal");
        AssertJUnit.assertTrue("Página principal mostrada",true);
    }

    @AfterClass
    public void closeBrowser(){
        System.out.println("Cerrando navegador...");
        AssertJUnit.assertTrue("Navegador cerrado",true);
    }
}
