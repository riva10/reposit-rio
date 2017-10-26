package poo.camila.eu;

public class Usuario {
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (canal == null) {
			if (other.canal != null)
				return false;
		} else if (!canal.equals(other.canal))
			return false;
		if (idUsuario != other.idUsuario)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	private String nome;
	private int idUsuario;
	private Canal canal;

	public Usuario(String nome,int idUsuario) {
		this.nome = nome;
		this.idUsuario = idUsuario;
		
		}
	public Usuario() {
		
	}
	public Usuario(String nome,int idUsuario, Canal canal) {
		this.nome = nome;
		this.idUsuario = idUsuario;
		this.canal = canal;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}


	public Canal getCanal() {
		return canal;
	}

	public void setCanal(Canal canal) {
		this.canal = canal;
	}
@Override
public String toString() {
	return "Usuario [nome=" + nome + ", idUsuario=" + idUsuario + ", canal=" + canal + "]";
}}

