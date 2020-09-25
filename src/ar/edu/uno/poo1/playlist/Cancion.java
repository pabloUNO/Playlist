package ar.edu.uno.poo1.playlist;

/*
-Se construye a partir de la cantidad máxima de Canciones que puede tener. Como máximo supondremos que una lista no supera las 10000 canciones, 
pero puede ser construida con una cantidad menor. 

-----Cada Canción está compuesta de su  título, álbum, artista y duración. Proveer todos los constructores de Canción que crea convenientes, pero se debe tener 
     en cuenta que una canción por lo menos se debe crear a partir de su título y duración.

-----Se puede agregar canciones hasta el máximo admitido. 

------Se puede quitar una canción pasándole alguno de los datos que la compone. 

-Se puede consultar la duración de una canción pasándole el título. Si varias canciones tienen el mismo título, devuelve la duración de todas. Si la canción 
no existe, devuelve (-1). Las búsquedas no deben ser "case sensitive”. 

------Se puede consultar la duración completa de la playlist. 

--------Se puede consultar la cantidad de canciones. 

----------Se puede consultar la canción de mayor duración y también la de menor duración.

-Se puede mostrar la lista ordenada por título de la canción.

-Se puede mostrar la lista ordenada por artista y dentro de las canciones que pertenecen a un artista, ordenadas por título.

-Simular la reproducción de la playlist eligiendo alguno de los criterios anteriores y además en orden aleatorio. 

void agregarCanciones();
void quitarCanciones();
String consultarCancion();
String consultarDuracionPlaylist();
int cantidadCanciones();
double duracionCancionMayorMenor();
String mostrarTitulos();
String mostrarArtista();
toString reproducirPlaylist();
 */

public class Cancion {

	protected String artista;
    protected String album;
    protected String titulo;
    protected double duracion;


	//--------------------------CONSTRUCTOR-----------------------------------
	public Cancion(String artista, String album, String titulo, double duracion) {
        this.setArtista(artista);
        this.setAlbum(album);
        this.setTitulo(titulo);
        this.setDuracion(duracion);
    }
	
	

	//************************************************GETTERS & SETTERS*********************************************************

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public double getDuracion() {
		return duracion;
	}

	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}

	//*******************************************************METODOS**************************************************************

	
	//mostrar datos de cada posicion del array
	public String toString() {

		return "\n Titulo: "+titulo+"\n Album: "+album+"\n Artista: "+artista+"\n Duracion: "+duracion+"\n";
	}



	

	
}
