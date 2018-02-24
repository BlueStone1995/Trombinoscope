package com.sorbonne.trombi.trombinoscope.dao;

import com.sorbonne.trombi.trombinoscope.data.dataPersonne;
import com.sorbonne.trombi.trombinoscope.dto.Personne;

import java.util.List;

/**
 * Created by Mbape on 26/01/2018.
 */

public class PersonneDao implements IPersonneDao {
    @Override
    public List<Personne> getPersonne() {
        return dataPersonne.personnes;
    }

    @Override
    public void addPersonne(Personne personne) {
        dataPersonne.personnes.add(personne);
    }
}
