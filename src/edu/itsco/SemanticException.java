package edu.itsco;

public class SemanticException extends Exception{
	
	public final static int VND = 10; //Variable no definida.
	public final static int VD = 20; //Variable duplicada.
	public final static int VNI = 30; //Variable no inicializada.
	public final static int NC = 40; //No coinciden.
	
	public SemanticException(Variable v, int Exception)
	{
		super(getMessage(v,Exception));
	}

	private static String getMessage(Variable v, int Exception) {
		String message = "";
		switch(Exception)
		{
		case VND:
			message = "La variable "+v.getId()+" no ha sido declarada.";
			break;
		case VD:
			message = "La variable "+v.getId()+" ya fue declarada.";
			break;
		case VNI:
			message = "La variable "+v.getId()+" no esta inicializada.";
			break;
		case NC:
			message = "El tipo de dato no coincide con el valor de la variable"+v.getId();
			break;
		}
		return message;
	}
}
