package model;

public class Pelicula 
{
	private String _titulo;
	private int _id;
	private String _genero;
	private String _director;
	private int _año;
	private int _duracion;
	private String _sinopsis;
	private String _rutaImagen;
	private int _precioCompra;
	private int _precioAlquiler;
	
	public Pelicula(){
		
	}
	
	public Pelicula(int id, String titulo, String genero, String director, int año, int duracion,
			String sinopsis, String rutaImagen, int precioCompra, int precioAlquiler){
		this._id = id;
		this._titulo = titulo;
		String _genero = genero;
		String _director = director;
		this._año = año;
		this._duracion = duracion;
		this._sinopsis = sinopsis;
		this._rutaImagen = rutaImagen;
		this._precioCompra = precioCompra;
		this._precioAlquiler = precioAlquiler;		
	}

	public String get_titulo() {
		return _titulo;
	}

	public void set_titulo(String _titulo) {
		this._titulo = _titulo;
	}

	public int get_id() {
		return _id;
	}

	public void set_id(int _id) {
		this._id = _id;
	}

	public String get_genero() {
		return _genero;
	}

	public void set_genero(String _genero) {
		this._genero = _genero;
	}

	public String get_director() {
		return _director;
	}

	public void set_director(String _director) {
		this._director = _director;
	}

	public int get_año() {
		return _año;
	}

	public void set_año(int _año) {
		this._año = _año;
	}

	public int get_duracion() {
		return _duracion;
	}

	public void set_duracion(int _duracion) {
		this._duracion = _duracion;
	}

	public String get_sinopsis() {
		return _sinopsis;
	}

	public void set_sinopsis(String _sinopsis) {
		this._sinopsis = _sinopsis;
	}

	public String get_rutaImagen() {
		return _rutaImagen;
	}

	public void set_rutaImagen(String _rutaImagen) {
		this._rutaImagen = _rutaImagen;
	}

	public int get_precioCompra() {
		return _precioCompra;
	}

	public void set_precioCompra(int _precioCompra) {
		this._precioCompra = _precioCompra;
	}

	public int get_precioAlquiler() {
		return _precioAlquiler;
	}

	public void set_precioAlquiler(int _precioAlquiler) {
		this._precioAlquiler = _precioAlquiler;
	}
	
	
}
