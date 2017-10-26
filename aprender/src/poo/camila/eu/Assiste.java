package poo.camila.eu;

import java.util.Date;

public class Assiste {
	private Usuario usuario;
	private Video video;
	private Date data;
	
	public Usuario getUsuario() {
		return usuario; }
	public Assiste () {
		
	}
	
	public Assiste (Usuario usuario, Video video) {
		this.usuario = usuario;
		this.video =video;
	}
	
	public Assiste (Usuario usuario) {
		this.usuario = usuario;
		
	}
	public Video getVideo() {
		return video;
	}
	public void setVideo(Video video) {
		this.video = video;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Assiste other = (Assiste) obj;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (usuario == null) {
			if (other.usuario != null)
				return false;
		} else if (!usuario.equals(other.usuario))
			return false;
		if (video == null) {
			if (other.video != null)
				return false;
		} else if (!video.equals(other.video))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Assiste [usuario=" + usuario + ", video=" + video + ", data=" + data + "]";
	}}


