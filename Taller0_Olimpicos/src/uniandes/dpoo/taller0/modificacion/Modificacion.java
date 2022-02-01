package uniandes.dpoo.taller0.modificacion;

import uniandes.dpoo.taller0.procesamiento.CalculadoraEstadisticas;
import uniandes.dpoo.taller0.procesamiento.LoaderOlimpicos;

import java.io.IOException;

import uniandes.dpoo.taller0.consola.*;


public class Modificacion
{
	/**
	 * No atributes
	 * @param args
	 */
	public static void Main(String[] args) 
	{
		/*
		 * Try - catch added due to IOE exception
		 */
		System.out.println("¡Hola, mundo!");
		String archivo=ConsolaOlimpicos.input("Ubicación de archivo");
		try 
		{
			CalculadoraEstadisticas calc = LoaderOlimpicos.cargarArchivo(archivo);
			System.out.println(calc.paisConMasMedallistas());
		}
		catch (IOException e)
		{
			System.out.println("Error leyendo de la consola");
			e.printStackTrace();
		}
	}
}
