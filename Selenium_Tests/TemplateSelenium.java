/**
 * Template to generate Selenium Test Scripts
 */

package mx.org.ife.pruebas.testscript; //Modify package depending on system.

/**
 *@author Juan Pablo Melendez Vieyra
 * 		  Departamento de Auditoria y Calidad de los Sistemas
 * 		  Instituto Federal Electoral
 */
import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;
import junit.framework.TestCase;


public class TemplateSelenium extends TestCase  { //Modify java class
	
	private Selenium selenium;  
	protected void setUp() {  
		selenium = new DefaultSelenium("localhost", 4444,"*iexplore", "http://www.ife.org.mx/");  //Modify System URL
		selenium.start(); 
	}
public void test() {   
		
		/**
		 * 
		 * Add Selenium IDE Code
		 * 
		 */
	
}
	protected void tearDown(){  
		selenium.stop(); 
	}
}
