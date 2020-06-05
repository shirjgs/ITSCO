package edu.itsco;

public class Variable {
	
	private String id;
	private String td;
	private boolean inicializada;
	
	public Variable() {}
	
	public Variable (String id, String td)
	{
		this.id = id;
		this.td = td;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTd() {
		return td;
	}

	public void setTd(String td) {
		this.td = td;
	}

	public boolean isInicializada() {
		return inicializada;
	}

	public void setInicializada(boolean inicializada) {
		this.inicializada = inicializada;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(obj instanceof Variable) {
			Variable v = (Variable) obj;
			return this.id.equals(v.getId());
		}
		return false;
	}
}
