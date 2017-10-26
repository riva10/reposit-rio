package poo.camila.eu;

import java.util.ArrayList;

public class Canal {
	private String nome;
	private String descricao;
	private ArrayList<Usuario> inscritos;
	private ArrayList<Video> videos;

	public Canal () {
		
	}


	public Canal (String descricao) {
		this.descricao = descricao;
	}
	public Canal (String nome, String descricao) {
		this.nome = nome;
		this.descricao =descricao;
	}


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public ArrayList<Video> getVideos() {
		return videos;
	}
	public void setVideos(ArrayList<Video> videos) {
		this.videos = videos;
	}
	public ArrayList<Usuario> getInscritos() {
		return inscritos;
	}
	public void setInscritos(ArrayList<Usuario> inscritos) {
		this.inscritos = inscritos;
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Canal other = (Canal) obj;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (inscritos == null) {
			if (other.inscritos != null)
				return false;
		} else if (!inscritos.equals(other.inscritos))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
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
		return "Canal [nome=" + nome + ", descricao=" + descricao + ", inscritos=" + inscritos + ", videos=" + videos
				+ "]";
	}}



