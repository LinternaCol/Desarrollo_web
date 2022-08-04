/*
  @Class Gato
  *Juan Pablo Suarez Perdomo
  *Since: 02/08/2022
 */

public class Gato extends Carnivoro {
    private  String color;

    public Gato(String color){
        this.color=color;
    }

    public String getColor() {
        return color;
    }


    /*
          @override comunicacion de animal
          *Juan Pablo Suarez Perdomo
          *Since: 02/08/2022
        */
    @Override
    public String comunicacion() {
        return "Maullo" ;
    }

    /*
      @override Tipos de dientes de Carnivoro
      *Juan Pablo Suarez Perdomo
      *Since: 02/08/2022
    */
    @Override
    String tiposDientes() {
        return "Filudos punsantes";
    }
}
