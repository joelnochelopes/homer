package com.iesseveroochoa;

import jdk.nashorn.internal.objects.NativeArray;

import java.util.List;

public class Main {
    List<Personaje> reparto = null;

    public void main(String[] args) {
        //Incorporación de los personajes a la obra.
        incorporarAlReparto();
        //Desarrollo de la trama.
        //Todos los pretendientes están en casa de Odiseo. Junto con Telémaco y Penelopea.
        ubicaciónIncial();
        //
        //Comienzan los viajeros
        viajeros();


    }

    void incorporarAlReparto() {
        reparto.add(new Personaje("Odiseo", "héroe"));
        reparto.add(new Personaje("Penelepe", "esposa"));
        reparto.add(new Personaje("Telémaco", "heredero"));
        reparto.add(new Personaje("Antínoo", "pretendiente"));
        reparto.add(new Personaje("Leodes", "pretendiente"));
        reparto.add(new Personaje("Eurimaco", "pretendiente"));
        reparto.add(new Personaje("Nestor","rey"));
    }

    void ubicaciónIncial(){
        for (int i = 0; i < reparto.size(); i++) {
            if (reparto.get(i).getNombre().equals("Odiseo")) {
                reparto.get(i).setLocalizacion("Troya"); //Odiseo está en Troya.
            } else {
                reparto.get(i).setLocalizacion("casa Odiseo");
            }
        }
    }

    void viajeros() {
        for (int i = 0; i < reparto.size(); i++) {
            System.out.print("El personaje " + reparto.get(i).getNombre());
            System.out.println(" viaja hasta " + reparto.get(i).getLocalizacion());
        }
    }

}
