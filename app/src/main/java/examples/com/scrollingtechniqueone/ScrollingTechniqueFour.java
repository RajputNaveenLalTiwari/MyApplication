package examples.com.scrollingtechniqueone;

import android.content.Context;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;

public class ScrollingTechniqueFour extends AppCompatActivity
{
    Context context;
    Toolbar toolbar;
    RecyclerView recyclerView;
    CollapsingToolbarLayout collapsingToolbarLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scrollingtechnique_four);

        context = ScrollingTechniqueFour.this;

        collapsingToolbarLayout = ( CollapsingToolbarLayout ) findViewById( R.id.collapsingToolbarContainer );

        toolbar = (Toolbar) findViewById( R.id.toolBar );

        recyclerView = (RecyclerView) findViewById( R.id.recyclerView );

        setSupportActionBar( toolbar );

        collapsingToolbarLayout.setTitle(getResources().getString(R.string.toolbar_title));

        try
        {
//            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        catch ( Exception e )
        {
            Log.e("Error",""+e.getMessage().toString());
        }

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager( context );

        String[] data = getResources().getStringArray(R.array.country_names);

        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(data);

        recyclerView.setLayoutManager( linearLayoutManager );

        recyclerView.setAdapter(recyclerViewAdapter);
    }
}
