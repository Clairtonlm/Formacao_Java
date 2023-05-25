package loja;

import animais.Animal;
import animais.Cachorro;

public class Petshop {
    

    public void darBanho(Animal animal){
        animal.setEstadoDeEspirito("Limpo");
    }
    public void tosar(Cachorro cachorro){
        cachorro.setEstadoDeEspirito("Tosado");
    }

    public void deixarHotel(Animal animal){
        animal.setEstadoDeEspirito("Saudade");
    }
}