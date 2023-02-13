
package com.mycompany.entradablogjmbm;
/** 
 * Clase para manejar las entradas de un blog.
 * @author Juan Manuel Belaunde 
 * @since  13/02/2023.
 * @version 2.3
 */
//Modificar.
public class EntradaBlogJMBM {
/**
       @see separador es el carácter que separa ENTRADA DE del nombre del autor

 */
	public static char separador=':';
	private int id;
	private String texto;
	private String autor;
	
	
        /**
         * @throws IllegalArgumentException
         * Constructor de la clase.
         * @param id recibe el número de entrada si es negativo, lanza
         * una excepción
         * @param autor recibe el nombre del autor de la entrada y el texto que
         * contiene la entrada.
         * @param texto imprime un texto
         */
	public EntradaBlogJMBM(int id,String autor,String texto)throws IllegalArgumentException{
		if(id<=0) throw new IllegalArgumentException("El id no puede ser negativo");
		this.id=id;
		this.autor=autor;
		this.texto=texto;
	}
	@Override
	public String toString(){
		String cad="";
		cad+="\nENTRADA DE"+separador+autor;
		cad+="\n "+texto;
		return cad;
	}
	
	//Devuelve el número de la entrada
	public int getId(){
		return this.id;
	}
	
	/**
         *
         @return devuelve el texto completo de la entrada
         */
	public String getTexto(){
		return this.texto;
	}
	
	/** 
        @return devuelve el nombre del autor de la entrada en mayúsculas
        */
          
	public String getAutor(){
		return this.autor.toUpperCase();
	}
	
	/** @deprecated devuelve el nombre del autor. Ya no se usa. Mejor ver getAutor*/
	public String devuelveAutor(){
		return this.autor;
	}
	
	/** No tiene porqué tener argumentos. */
	public static void main(String[] args) {
                /** Modificar.*/
		EntradaBlogJMBM e1=new EntradaBlogJMBM (3,"ana","Últimas noticias, está disponible BixBy 2.0");
		System.out.println(e1);
	}
}
