package entities;

import java.util.ArrayList;

public class Agente extends Entidad {
    private String habilidadEspecial;
    private String misionAsignada;
    private int nivel;
  

    public Agente(int id, String nombre, String habilidadEspecial, int nivel) {
        super(id, nombre);
        this.habilidadEspecial = habilidadEspecial;
    }


    public String getHabilidadEspecial() {
        return habilidadEspecial;
    }

    public void setHabilidadEspecial(String habilidadEspecial) {
        this.habilidadEspecial = habilidadEspecial;
    }

    public String getMisionAsignada() {
        return misionAsignada;
    }

    public void asignarMision(String mision) {
        this.misionAsignada = mision;
    }

    public int nivel(){
        return nivel;
       

    }

    public ArrayList<String> estadistica() {
        ArrayList<String> estadisticaArrayList = new ArrayList<String>();
         estadisticaArrayList.add(nombre);
         estadisticaArrayList.add(habilidadEspecial);
         estadisticaArrayList.add(Integer.toString(nivel));
         estadisticaArrayList.add(misionAsignada);

         return estadisticaArrayList;         
    
        

    }
  


    @Override
    public String toString() {
        return super.toString() + ", Habilidad Especial: " + habilidadEspecial +
                (misionAsignada != null ? ", Misión: " + misionAsignada : "");
    }
}



//Requerimiento 7: Estadísticas Simples
//Descripción: Mostrar estadísticas básicas del sistema.
//Tareas:
//Contar el número total de agentes y anomalías registrados.
//Mostrar en consola los totales.//