package logico;

import java.util.Date;

public class Lesion {
	
	private String codigo;
	private String tipo;
	private boolean estado;
	private Date fechaDeLesion;
	private int recoverytime;

	public Lesion(String codigo, String tipo, boolean estado, Date fechaDeLesion, int recoverytime) {
		super();
		this.codigo = codigo;
		this.tipo = tipo;
		this.estado = estado;
		this.fechaDeLesion = fechaDeLesion;
		this.recoverytime = recoverytime;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public Date getFechaDeLesion() {
		return fechaDeLesion;
	}

	public void setFechaDeLesion(Date fechaDeLesion) {
		this.fechaDeLesion = fechaDeLesion;
	}

	public int getRecoverytime() {
		return recoverytime;
	}

	public void setRecoverytime(int recoverytime) {
		this.recoverytime = recoverytime;
	}	

}
