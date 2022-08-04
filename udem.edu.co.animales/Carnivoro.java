/*
  @Class Carnivoro
  *Juan Pablo Suarez Perdomo
  *Since: 02/08/2022
 */

public abstract class Carnivoro implements Animal{
    abstract String tiposDientes();

    public String getTiposDientes(){
        return  tiposDientes();
    }
    public String getComunicacion(){
        return  comunicacion();
    }


}
