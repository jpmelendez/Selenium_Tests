package testscript;

import java.io.IOException;
import java.util.List;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;

import junit.framework.TestCase;


public class TestCaseExample extends TestCase  {
	
	private Selenium selenium;  protected void setUp() {  
		selenium = new DefaultSelenium("localhost", 4444,"*iexplore", "https://10.0.27.23/pautas3/");  
		selenium.start(); 
	}
public void test1() {   
		
	selenium.open("/pautas3/");
	//selenium.click("link=overridelink");
	selenium.windowMaximize();
	//assertEquals("Para operar el sistema se requiere Internet Explorer 7 o superior", selenium.getAlert());
	selenium.type("login", "armando.calleja");
	selenium.type("password", "password");
	selenium.click("submit");
	selenium.waitForPageToLoad("30000");
	selenium.click("link=Registrar grupos");
	selenium.waitForPageToLoad("30000");
	selenium.click("vigente");
	
		LeerDatosTXT txt = new LeerDatosTXT("C:\\Pablo\\AUTOMATIZACION\\pautas\\pautasGrupos.txt");
		
		try {
			List<String[]> lista = txt.regresaDatosTXT();
			String[] tmp;
			for (int i = 1; i < lista.size(); i++) {
				System.out.println("Tamaño lista ---> " + lista.size());
				tmp = lista.get(i);
				
				System.out.println("numero de elementos " + tmp.length);
				System.out.println("tmp[0] : " + tmp[0]);
				System.out.println("tmp[1] : " + tmp[1]);
				System.out.println("tmp[2] : " + tmp[2]);
				System.out.println("tmp[3] : " + tmp[3]);
				System.out.println("tmp[4] : " + tmp[4]);
				System.out.println("tmp[5] : " + tmp[5]);
				System.out.println("tmp[6] : " + tmp[6]);
				System.out.println("tmp[7] : " + tmp[7]);
				System.out.println("tmp[8] : " + tmp[8]);
				System.out.println("tmp[9] : " + tmp[9]);
				System.out.println("tmp[10] : " + tmp[10]);
				System.out.println("tmp[11] : " + tmp[11]);
				System.out.println("tmp[12] : " + tmp[12]);
				//System.out.println("tmp[13] : " + tmp[13]);
				//System.out.println("tmp[14] : " + tmp[14]);
				
				
				selenium.type("denominacion", tmp[0]);
				selenium.select("idEstado", "label=" + tmp[1]);
				selenium.select("idMunicipio", "label=" + tmp[2]);
				selenium.type("domicilio", tmp[3]);
				selenium.type("correo", tmp[4]);
				selenium.type("telefonos", tmp[5]);
				selenium.select("idTratamiento", "label=" + tmp[6]);
				selenium.type("nombre", tmp[7]);
				selenium.type("apellidoPaterno", tmp[8]);
				selenium.type("apellidoMaterno", tmp[9]);
				selenium.type("puesto", tmp[10]);
				selenium.type("correoRepresentante", tmp[11]);
				selenium.type("telefonosRepresentante", tmp[12]);
				//selenium.click("btnGuardar");
				//selenium.waitForPageToLoad("30000");
				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	protected void tearDown(){  
		selenium.stop(); 
	}
}
