package com.gosmart3r.lic.ec;


public class GeneradorCodigoActivacionEc {

	public GeneradorCodigoActivacionEc() {
		// TODO Auto-generated constructor stub
	}

	public static void main (String args[]){ 
        
        //LOS DATOS QUE SE RECIBEN SON DE LA FORMA /1714688213001/GOSMART3R/L8/E1800/ DONDE 
		//L ES EL NUMERO DE LICENCIAS ,Y E NUMERO DE EMPLEADOS
		//SE DEBERIA UTILIZAR OTRO METODO DE ENCRIPTACION
		
        String mensaje="/1714688213001/GOSMART3R/L8/E1800/"; 
        char array[]=mensaje.toCharArray(); 
         
        for(int i=0;i<array.length;i++){ 
            array[i]=(char)(array[i]+(char)9); 
} 
        String encriptado =String.valueOf(array); 
        System.out.println(encriptado); 
         
        char arrayD[]=encriptado.toCharArray(); 
        for(int i=0;i<arrayD.length;i++){ 
            arrayD[i]=(char)(arrayD[i]-(char)9); 
        } 
      String desencriptado =String.valueOf(arrayD); 
        System.out.println(desencriptado);   
} 
	
}
