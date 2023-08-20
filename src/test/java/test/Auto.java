package test;

public class Auto {
	String modelo;
	int precio;
	Motor motor;
	String marca;
	Asiento[] asientos;
	int registro;
	static int cantidadCreados;
	int cantidadAseintos() {
		int Asientosnumber=0;
		for(int i=0; i<asientos.length;i++) {
			if(asientos[i]!=null) {
				Asientosnumber++;
			}
		}
		return Asientosnumber;
	}
	
	String verificarIntegridad()
	{
		if (registro==motor.registro) {
			for (int i=0;i<asientos.length;i++) {
			if(asientos[i].registro!=null) {
				if(asientos[i].registro !=registro) {
					return "Las piezas no son originales";
				}
			}
			}
			return"Auto original";
			
			}
		else {
			return"Las piezas no son originales";
		}
		}
			
				
	}
	
	
}
