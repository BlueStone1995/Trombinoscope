package com.sorbonne.trombi.trombinoscope.dao;

import com.sorbonne.trombi.trombinoscope.dto.Personne;

import java.util.List;

/**
 * Created by Mbape on 26/01/2018.
 */

public interface IPersonneDao {

    public List<Personne> getPersonne();
    public void addPersonne(Personne personne);
}
