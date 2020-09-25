package ar.edu.uno.poo1.playlist;

/*
-Se construye a partir de la cantidad m�xima de Canciones que puede tener. Como m�ximo supondremos que una lista no supera las 10000 canciones, 
pero puede ser construida con una cantidad menor. 

-----Cada Canci�n est� compuesta de su  t�tulo, �lbum, artista y duraci�n. Proveer todos los constructores de Canci�n que crea convenientes, pero se debe tener 
     en cuenta que una canci�n por lo menos se debe crear a partir de su t�tulo y duraci�n.

-----Se puede agregar canciones hasta el m�ximo admitido. 

------Se puede quitar una canci�n pas�ndole alguno de los datos que la compone. 

-Se puede consultar la duraci�n de una canci�n pas�ndole el t�tulo. Si varias canciones tienen el mismo t�tulo, devuelve la duraci�n de todas. Si la canci�n 
no existe, devuelve (-1). Las b�squedas no deben ser "case sensitive�. 

------Se puede consultar la duraci�n completa de la playlist. 

--------Se puede consultar la cantidad de canciones. 

----------Se puede consultar la canci�n de mayor duraci�n y tambi�n la de menor duraci�n.

-Se puede mostrar la lista ordenada por t�tulo de la canci�n.

-Se puede mostrar la lista ordenada por artista y dentro de las canciones que pertenecen a un artista, ordenadas por t�tulo.

-Simular la reproducci�n de la playlist eligiendo alguno de los criterios anteriores y adem�s en orden aleatorio. 

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
