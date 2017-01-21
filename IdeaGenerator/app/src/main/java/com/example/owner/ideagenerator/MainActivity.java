package com.example.owner.ideagenerator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button searchButton = (Button)findViewById(R.id.searchButton);
        final TextView newIdea = (TextView)findViewById(R.id.newIdea);
        final EditText searchInput = (EditText)findViewById(R.id.searchEntry);
        searchButton.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View view)
                    {
                        CharSequence searchField = searchInput.getText();
                        RandomSentenceGenerator ideas = new RandomSentenceGenerator();
                        CharSequence something = ideas.getIdeas(searchField);
                        CharSequence newIdeas = ideas.generateIdea();
                        newIdea.setText(newIdeas);
                    }
                }
        );


    }
}
