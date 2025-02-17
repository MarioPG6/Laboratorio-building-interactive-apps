package com.example.beeradviser;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickFindPet(View view) {
        // Obtener referencias a los elementos de la UI
        TextView breeds = findViewById(R.id.breeds);
        Spinner category = findViewById(R.id.category);

        // Obtener la opción seleccionada en el Spinner
        String petCategory = String.valueOf(category.getSelectedItem());

        // Llamar a PetExpert para obtener las razas
        PetExpert expert = new PetExpert();
        List<String> breedList = expert.getBreeds(petCategory);

        // Convertir la lista a un solo String separado por saltos de línea
        StringBuilder recommendations = new StringBuilder();
        for (String breed : breedList) {
            recommendations.append(breed).append("\n");
        }

        // Mostrar las recomendaciones en el TextView
        breeds.setText(recommendations.toString());
    }
}