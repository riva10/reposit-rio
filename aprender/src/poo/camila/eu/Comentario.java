package poo.camila.eu;

public class Comentario {
	private String comentario;
	private Usuario usuario;
	private Video video;
	private Comentario comenta;
	
	public Comentario (String comentario,Usuario usuario) {
		this.comentario = comentario;
		this.usuario = usuario;	
	}
	
	public Comentario() {
		
	}
	public Comentario (Video video, Comentario comenta) {
		this.video = video;
		this.comentario = comentario;
	}
	
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Video getVideo() {
		return video;
	}
	public void setVideo(Video video) {
		this.video = video;
	}
	public Comentario getComenta() {
		return comenta;
	}
	public void setComenta(Comentario comenta) {
		this.comenta = comenta;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Comentario other = (Comentario) obj;
		if (comenta == null) {
			if (other.comenta != null)
				return false;
		} else if (!comenta.equals(other.comenta))
			return false;
		if (comentario == null) {
			if (other.comentario != null)
				return false;
		} else if (!comentario.equals(other.comentario))
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
		return "Comentario [comentario=" + comentario + ", usuario=" + usuario + ", video=" + video + ", comenta="
				+ comenta + "]";
	}}



