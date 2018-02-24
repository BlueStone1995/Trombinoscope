package com.sorbonne.trombi.trombinoscope;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.sorbonne.trombi.trombinoscope.adapter.PersonneAdapter;
import com.sorbonne.trombi.trombinoscope.dao.IPersonneDao;
import com.sorbonne.trombi.trombinoscope.dao.PersonneDao;
import com.sorbonne.trombi.trombinoscope.dto.Personne;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mbape on 26/01/2018.
 */

public class PersonneListActivity extends AppCompatActivity {
    private static final String TAG = "PersonneListActivity";



    ListView mListView;
    PersonneAdapter adapter;

    public static List<Personne> selectedPersons =new ArrayList<Personne>();
    public static List<View> selectedChilds =new ArrayList<View>();


    IPersonneDao personDAO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        personDAO   =new PersonneDao();

        setContentView(R.layout.personne_list);

        mListView = (ListView) findViewById(R.id.personsList);

        adapter = new PersonneAdapter(PersonneListActivity.this, personDAO.getPersonne());
        mListView.setAdapter(adapter);

        mListView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> arg0, View arg1,
                                           int pos, long id) {
                Personne person= (Personne) arg0.getItemAtPosition(pos);
                Toast.makeText(getApplicationContext(), "POS : " + pos + ", ID : " + id +", PERSON :" + person, Toast.LENGTH_LONG).show();


                return true;
            }
        });
    }


}
