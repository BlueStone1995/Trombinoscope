package com.sorbonne.trombi.trombinoscope.adapter;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.sorbonne.trombi.trombinoscope.R;
import com.sorbonne.trombi.trombinoscope.dto.Personne;
import com.sorbonne.trombi.trombinoscope.holder.PersonneItemHolder;

import java.util.List;

/**
 * Created by Mbape on 26/01/2018.
 */

public class PersonneAdapter extends ArrayAdapter<Personne> {
    public PersonneAdapter(Context context, List<Personne> persons) {
        super(context, 0, persons);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.personne_item, parent, false);
        }

        PersonneItemHolder viewHolder = (PersonneItemHolder) convertView.getTag();
        if (viewHolder == null) {
            viewHolder = new PersonneItemHolder();
            viewHolder.firstName = (TextView) convertView.findViewById(R.id.nom);
            viewHolder.lastName = (TextView) convertView.findViewById(R.id.prenom);
            viewHolder.couleur = (ImageView) convertView.findViewById(R.id.image);
            convertView.setTag(viewHolder);
        }

        //getItem(position) va récupérer l'item [position] de la List<Tweet> tweets
        Personne personne = getItem(position);

        //il ne reste plus qu'à remplir notre vue
        viewHolder.firstName.setText(personne.getPrenom());
        viewHolder.lastName.setText(personne.getNom());
        viewHolder.couleur.setImageDrawable(new ColorDrawable(personne.getCouleur()));

        return convertView;
    }
}
