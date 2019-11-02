/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import dbActions.MenuActualizarAlumnoDdAction;
import dbActions.MenuConsultaAlumnoDbAction;
import javax.faces.model.SelectItem;
import pojos.Alumno;
import utils.Catalogos;

/**
 *
 * @author Juan de Dios
 */
public class MenuConsultaAlumnoBean {
    private int carne;
    private String nombre;
    private String apellido;
    private int area;
    private int ciclo;
    private String foto;
    private SelectItem[] listaAreas;
    private Alumno alumno;

    /**
     * Creates a new instance of MenuConsultaAlumnoBean
     */
    public MenuConsultaAlumnoBean() {
         cargarAreas();
    }
    
    public String irmenuAlumno(){
       String resultado="regresar";
               return resultado;
   }
       /**
     * Metodo que carga las areas de los alumnos
     */
    public void cargarAreas(){
        Catalogos lista = new Catalogos();
        listaAreas = lista.cargarAreas();
    }
       /**
     * Metodo que consulta el alumno en funcion del carnet ingresado
     */
     public void consultarAlumno(){
        MenuConsultaAlumnoDbAction consulta = new MenuConsultaAlumnoDbAction();
        this.alumno = consulta.validarAlumno(this.getCarne());
        if(alumno != null){
            this.setNombre(alumno.getNombre());
            this.setApellido(alumno.getApellido());
            this.setCiclo(alumno.getCiclo());
            this.setArea(alumno.getArea());
        }
    }

    public int getCarne() {
        return carne;
    }

    public void setCarne(int carne) {
        this.carne = carne;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getCiclo() {
        return ciclo;
    }

    public void setCiclo(int ciclo) {
        this.ciclo = ciclo;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public SelectItem[] getListaAreas() {
        return listaAreas;
    }

    public void setListaAreas(SelectItem[] listaAreas) {
        this.listaAreas = listaAreas;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }
     
     
}
