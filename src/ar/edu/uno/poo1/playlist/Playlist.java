package ar.edu.uno.poo1.playlist;



public class Playlist {
	
	
	protected Cancion[] canciones;
	protected int posicion=0;
	
	

	public Playlist (Cancion [] canciones) {
        this.canciones = canciones;
    }
	

	
	//************************************************GETTERS & SETTERS*********************************************************
	
	public Cancion[] getCanciones() {
		return canciones;
	}

	public void setCanciones(Cancion[] canciones) {
		this.canciones = canciones;
	}

	public int getPosicion() {
		return posicion;
	}

	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}
	
	//*******************************************************METODOS***************************************************************

	//-------------------------------------------------------AGREGAR CANCION-------------------------------------------------------
	public boolean agregarCancion(String artista, String album, String titulo, double duracion, Playlist playlist) {
        if (this.posicion < this.canciones.length) {
            playlist.canciones[this.posicion] = new Cancion(artista, album, titulo, duracion);
            this.posicion++;
            
            return true;
        } else {
            return false;
        }
    }
	
	//---------------------------------------------------------REMOVER CANCION-----------------------------------------------------
		public String removerCancion(String titulo, Playlist playlist) {
	        int bandera=0; 
	        int j = 0;
	        
	        if(titulo == "") {
	        	System.out.println("no se ingreso ningun titulo");
	        	return titulo;
	        }
	        
	        for(j = 0; j< playlist.canciones.length;j++) {
	        	
	           if (playlist.canciones[j].titulo == titulo && playlist.canciones[j].titulo != null) {
	                    playlist.canciones[j].titulo ="";
	                    playlist.canciones[j].album="";
	                    playlist.canciones[j].artista=""; 
	                    playlist.canciones[j].duracion=0.0; 
	                    bandera=1; 
	                } 
	           if (bandera == 1) {
	                    System.out.println("Se elimino la cancion");
	                    bandera = 0;
	                    break;
	                }
	                else {
	                    System.out.println("No se encontro la cancion ingresada");
	                }
	        }
	        	 
	     
	     return titulo;
	    }
	
	//-------------------------------------------------------CANTIDAD CANCIONES----------------------------------------------------
	public int cantCanciones (Playlist playlist) {
		
		int cont = 0;
		for(this.posicion = 0; this.posicion <= this.canciones.length-1; this.posicion++) {
			
			if (this.canciones[this.posicion] != null) {
				cont++;
			}
			
		}
		return cont;
	}
	
	//------------------------------------------------------CONSULTAR DURACION PLAYLIST---------------------------------------------
	public double consultarDuracionPlaylist(Playlist playlist) {
		
		double sumaDuracionTotal = 0;
		
		for(this.posicion = 0; this.posicion < this.canciones.length;this.posicion++) {
			
			if (playlist.canciones[this.posicion] != null) {
				sumaDuracionTotal += playlist.canciones[this.posicion].duracion;
			}
			
		}
		
		System.out.println("La duracion entera de la playlist es: "+sumaDuracionTotal);
		
		return sumaDuracionTotal;
	}

	//------------------------------------------------------CONSULTAR DURACION CANCION----------------------------------------------
	
	public double consultarDuracion(String titulo, Playlist playlist) {
		
		double duracion = 0;
		
		for(this.posicion = 0; this.posicion < this.canciones.length;this.posicion++) {
			
			if (playlist.canciones[this.posicion] != null) {

				duracion = this.canciones[this.posicion].duracion;
				System.out.println("La duracion de la cancion de la cancion: "+this.canciones[this.posicion].titulo+" es: "+duracion);
				
			}
			else {
				return -1;
			}
			
		}
		
		return duracion;
	}
	
	//------------------------------------------------------DURACION MAX Y MIN------------------------------------------------------
	
    public void mostrarMinMaxDuracion(Playlist playlist) {
		
		double minDuracion = 0;
		double maxDuracion = 0;
		int banderaMin = 0;
		int banderaMax = 0;
		
		for (this.posicion = 0; this.posicion < this.canciones.length;this.posicion++) {
			
			if (playlist.canciones[this.posicion] != null) {
				if (banderaMin == 0) {
					minDuracion = playlist.canciones[this.posicion].duracion;
					banderaMin = 1;
				}
				else if ((banderaMin == 1) && (minDuracion > playlist.canciones[this.posicion].duracion)) {
					minDuracion = playlist.canciones[this.posicion].duracion;
				}
				
				if (banderaMax == 0) {
					maxDuracion = playlist.canciones[this.posicion].duracion;
					banderaMax = 1;
				}
				else if ((banderaMax == 1) && (maxDuracion < playlist.canciones[this.posicion].duracion)) {
					maxDuracion = playlist.canciones[this.posicion].duracion;
				}
				
			}
			
		}
		
		System.out.println("La cancion de mayor duracion es: "+maxDuracion);
		System.out.println("La cancion de menor duracion es: "+minDuracion);
		
		return;
	}

  //------------------------------------------------------LISTA ORDENADA POR TITULO-------------------------------------------------
    
    public void listaOrdenadaPorTitulo(Playlist playlist) {
    	
    	for (this.posicion=0; this.posicion<(this.canciones.length-1); this.posicion++) {
    		
    		if(playlist.canciones[this.posicion] != null) {
    			
    			System.out.println(this.posicion+" = "+this.canciones[this.posicion].titulo);
    			
    		}
    		
    	}
    	
    }
    
   //------------------------------------------------------LISTA ORDENADA POR TITULO---------------------------------------------
   
    public void reproducirPlaylist(Playlist playlist) {
    	
    	for (this.posicion=0; this.posicion<(this.canciones.length-1); this.posicion++) {
    		
    		if(playlist.canciones[this.posicion] != null) {
    			
    			System.out.println("*--REPRODUCIENDO--* "+this.canciones[this.posicion].titulo+" del artista: "
    					+this.canciones[this.posicion].artista+" del album: "+this.canciones[this.posicion].album+" >> "+this.canciones[this.posicion].duracion);
    		}
    		
    	}
    	
    }

	
    

}
