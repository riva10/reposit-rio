package poo.camila.eu;

import java.util.ArrayList;

public class Playlist {

	private Usuario usuario;
	private ArrayList<Video> videos;
	private String nome;

	public Playlist () {
		
	}

	public Playlist (String nome , Usuario usuario) {
		this.nome = nome;
		this.usuario = usuario;
	}

	public Playlist (String nome) {
		this.nome = nome;
		
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
	public ArrayList<Video> getVideos() {
		return videos;
	}
	public void setVideos(ArrayList<Video> videos) {
		this.videos = videos;
	}

	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Playlist other = (Playlist) obj;
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
		if (videos == null) {
			if (other.videos != null)
				return false;
		} else if (!videos.equals(other.videos))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Playlist [usuario=" + usuario + ", videos=" + videos + ", nome=" + nome + "]";
	}
	}


