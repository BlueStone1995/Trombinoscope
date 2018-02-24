package com.sorbonne.trombi.trombinoscope.data;

import android.graphics.Color;

import com.sorbonne.trombi.trombinoscope.dto.Personne;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mbape on 26/01/2018.
 */


public class dataPersonne {
    public static List<Personne> personnes = new ArrayList<Personne>() {
        {
            add(new Personne("Duchamps", "bob", Color.BLACK));
            add(new Personne("Dubois", "nicolas", Color.GREEN));
            add(new Personne("Dujardin", "anis", Color.RED));
        }
    };

}