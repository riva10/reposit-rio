package poo.camila.eu;

public class Video {
	
	private String nome;
	private String descricao;
	private int idVideo;
	private Canal canal;
	private Usuario usuario;
	
	public Video() {
		
	}
    
	
	public Video(String nome,String descricao) {
		this.nome = nome;
		this.descricao = descricao;
	}
	public Video(String nome,String descricao,int idVideo) {
		this.nome = nome;
		this.descricao = descricao;
		this.idVideo = idVideo;
			
	}
	
	
	public Usuario getUsuario() {
		return usuario;
	}
	
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDescriçao() {
		return descricao;
	}
	public void setDescriçao(String descriçao) {
		this.descricao = descriçao;
	}

	public int getIdVideo() {
		return idVideo;
	}
	public void setIdVideo(int idVideo) {
		this.idVideo = idVideo;
	}
	public void setDono(Usuario usuario2) {
		this.usuario = usuario2;
	}
	public Canal getCanal() {
		return canal;
	}
	public void setCanal(Canal canal) {
		this.canal = canal;
	}





	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Video other = (Video) obj;
		if (canal == null) {
			if (other.canal != null)
				return false;
		} else if (!canal.equals(other.canal))
			return false;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (idVideo != other.idVideo)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (usuario == null) {
			if (other.usuario != null)
				return false;
		} else if (!usuario.equals(other.usuario))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Video [nome=" + nome + ", descricao=" + descricao + ", idVideo=" + idVideo + ", canal=" + canal
				+ ", usuario=" + usuario + "]";
	}}


