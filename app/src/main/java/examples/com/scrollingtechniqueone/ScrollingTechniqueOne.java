package examples.com.scrollingtechniqueone;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

public class ScrollingTechniqueOne extends AppCompatActivity
{
    Context context;
    Toolbar toolbar;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scrollingtechnique_one);

        context = ScrollingTechniqueOne.this;

        toolbar = (Toolbar) findViewById( R.id.toolBar );

        recyclerView = (RecyclerView) findViewById( R.id.recyclerView );

        setSupportActionBar( toolbar );
        toolbar.setTitle(R.string.toolbar_title);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager( context );

        String[] data = getResources().getStringArray(R.array.country_names);

        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(data);

        recyclerView.setLayoutManager( linearLayoutManager );

        recyclerView.setAdapter(recyclerViewAdapter);
    }
}
