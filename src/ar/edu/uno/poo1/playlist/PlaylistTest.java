package ar.edu.uno.poo1.playlist;

import org.junit.Before;
import org.junit.Test;

public class PlaylistTest{
    	
    private Playlist playlist;
	@Before
	public void setUp() throws Exception {
		Cancion[] canciones = new Cancion[10000];
		playlist = new Playlist(canciones);
	}
	
	
	@Test
	public void agregarCancionTest() {
		
		playlist.agregarCancion("gustavo cerati", "fuerza natural", "dejavu", 3.5, playlist);
		playlist.agregarCancion("gustavo cerati", "fuerza natural", "cactus", 4.0, playlist);
        playlist.agregarCancion("gustavo cerati", "fuerza natural", "magia", 5.0, playlist);
        
	}

	public void removerCancionTest() {
		
		playlist.agregarCancion("gustavo cerati", "fuerza natural", "cactus", 4.0, playlist);
		playlist.removerCancion("cactus", playlist);
		
	}
	
	public void cantCancionTest() {
		
		playlist.agregarCancion("gustavo cerati", "fuerza natural", "dejavu", 3.5, playlist);
        playlist.agregarCancion("gustavo cerati", "fuerza natural", "cactus", 4.0, playlist);
        playlist.agregarCancion("gustavo cerati", "fuerza natural", "magia", 5.0, playlist);
        
        playlist.cantCanciones(playlist);
		
	}
	
	public void consultarDuracionTest() {
		
		playlist.agregarCancion("gustavo cerati", "fuerza natural", "dejavu", 3.5, playlist);
        playlist.agregarCancion("gustavo cerati", "fuerza natural", "cactus", 4.0, playlist);
        playlist.agregarCancion("gustavo cerati", "fuerza natural", "magia", 5.0, playlist);
        
        playlist.consultarDuracion("cactus", playlist);
        
	}
	
	public void consultarDuracionPlaylistTest() {
		
		playlist.agregarCancion("gustavo cerati", "fuerza natural", "dejavu", 3.5, playlist);
        playlist.agregarCancion("gustavo cerati", "fuerza natural", "cactus", 4.0, playlist);
        playlist.agregarCancion("gustavo cerati", "fuerza natural", "magia", 5.0, playlist);
        
        playlist.consultarDuracionPlaylist(playlist);
		
	}
	
	public void mostrarMinMaxDuracionTest() {
		
		playlist.agregarCancion("gustavo cerati", "fuerza natural", "dejavu", 3.5, playlist);
        playlist.agregarCancion("gustavo cerati", "fuerza natural", "cactus", 4.0, playlist);
        playlist.agregarCancion("gustavo cerati", "fuerza natural", "magia", 5.0, playlist);
        
        playlist.mostrarMinMaxDuracion(playlist);
        
	}
	
	public void listaOrdenadaPorTitulo() {
		
		playlist.agregarCancion("gustavo cerati", "fuerza natural", "dejavu", 3.5, playlist);
        playlist.agregarCancion("gustavo cerati", "fuerza natural", "cactus", 4.0, playlist);
        playlist.agregarCancion("gustavo cerati", "fuerza natural", "magia", 5.0, playlist);
        
        playlist.listaOrdenadaPorTitulo(playlist);
		
	}
	
	public void reproducirPlaylist() {
		
		playlist.agregarCancion("gustavo cerati", "fuerza natural", "dejavu", 3.5, playlist);
        playlist.agregarCancion("gustavo cerati", "fuerza natural", "cactus", 4.0, playlist);
        playlist.agregarCancion("gustavo cerati", "fuerza natural", "magia", 5.0, playlist);
        
        playlist.reproducirPlaylist(playlist);
		
	}
	
	
	
}
