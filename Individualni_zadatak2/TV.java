package nedelja_7;

public class TV {
private Double velicina_ekrana;

public TV (Double velicina_ekrana) {
	this.velicina_ekrana = velicina_ekrana;
	

}

public Double getVelicina_ekrana() {return velicina_ekrana;}
public void setVelicina_ekrana(Double velicina_ekrana) {this.velicina_ekrana = velicina_ekrana;}



@Override
public String toString() {
	return "TV [velicina_ekrana=" + velicina_ekrana + "]";
}


}


