package testscript;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class LeerDatosTXT {
	
	 String rutaNombreArchivo;
	 String sCadena;
	
	public LeerDatosTXT(String nombre){
		System.out.println("------> " + nombre);
		this.rutaNombreArchivo = nombre;
	}
	
	
	/**
	 * Metodo que se encarga de leer el archivo TXT.
	 * @return
	 * @throws IOException 
	 */
	public List<String[]> regresaDatosTXT() throws IOException{
		BufferedReader bf = new BufferedReader(new FileReader(this.rutaNombreArchivo));
		
		List<String[]> lista = new ArrayList<String[]>();
		while ((sCadena = bf.readLine())!=null) {
			StringTokenizer tokenizer= new StringTokenizer(sCadena,"|");
			String[] cadenasLeidas = new String[tokenizer.countTokens()];
			int indice = 0;
			while(tokenizer.hasMoreTokens()){
				cadenasLeidas[indice] = tokenizer.nextToken();
				indice++;
		}
			lista.add(cadenasLeidas);
		}
		return lista;
	}

}
