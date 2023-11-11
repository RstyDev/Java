package ar.edu.unlp.oo1.ejercicio1;
import java.time.LocalDate;

public class Mamifero {
    private String identificador;
    private String especie;
    private LocalDate fechaNacimiento;
    private Mamifero padre;
    private Mamifero madre;

    public Mamifero(String identificador){
        this.identificador=identificador;
    }

    public Mamifero(){}

    public String getIdentificador() {
        return this.identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getEspecie() {
        return this.especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public LocalDate getFechaNacimiento() {
        return this.fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Mamifero getPadre() {
        return this.padre;
    }

    public void setPadre(Mamifero padre) {
        this.padre = padre;
    }

    public Mamifero getMadre() {
        return this.madre;
    }

    public void setMadre(Mamifero madre) {
        this.madre = madre;
    }

    public Mamifero getAbueloMaterno(){
        Mamifero res=this.getMadre();
        if (res!=null){
            res=
        }
        return res;
    }

    public Mamifero getAbuelaMaterna(){
        return this.getMadre().getMadre();
    }

    public Mamifero getAbueloPaterno(){
        return this.getPadre().getPadre();
    }

    public Mamifero getAbuelaPaterna(){
        return this.getPadre().getMadre();
    }

    public boolean tieneComoAncestroA(Mamifero m){
        boolean tiene=false;
        if ((this.getPadre()!=null&&this.getPadre().getIdentificador()==m.getIdentificador())||(this.getMadre()!=null&&this.getMadre().getIdentificador()==m.getIdentificador())){
            tiene=true;
        }
        if (!tiene&&(this.getAbuelaMaterna()!=null||this.getAbueloMaterno()!=null)){
            tiene=this.getMadre().tieneComoAncestroA(m);
        }
        if (!tiene&&(this.getAbuelaPaterna()!=null||this.getAbueloPaterno()!=null)){
            tiene=this.getPadre().tieneComoAncestroA(m);
        }

        return tiene;

    }

    
}
