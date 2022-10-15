package ejerciciosTema3_Diciembre_Cesur;

public class Punto3D extends Punto2D{
    protected double z;
    
    public Punto3D(){
      this(0,0,0);
    }
    public Punto3D(double cx,double cy,double cz){
    	super(cx,cy);
    	z=cz;
    }
	public double coordenadaZ() {
		return z;
	}
	public void cambiarZ(double z) {
		this.z = z;
	}
    double distancia3D(double cx,double cy,double cz) {
    	double d;
    	d= (super.abscisa() -cx) + (super.ordenada()-cy) + (z-cz);
    	d= Math.sqrt(d);
    	return d;
    }
    double distancia3D(Punto3D p) {
    	
    	return distancia3D(p.abscisa(),p.ordenada(),p.z);
    }
}

