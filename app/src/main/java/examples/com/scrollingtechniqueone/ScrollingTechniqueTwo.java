package examples.com.scrollingtechniqueone;

import android.content.Context;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

public class ScrollingTechniqueTwo extends AppCompatActivity
{
    Context context;
    Toolbar toolbar;
    TabLayout tabLayout;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scrollingtechnique_two);

        context = ScrollingTechniqueTwo.this;

        toolbar = (Toolbar) findViewById( R.id.toolBar );

        tabLayout = (TabLayout) findViewById( R.id.tabLayout );

        /*tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);

        for(int i=0; i<10; i++)
            tabLayout.addTab(tabLayout.newTab().setText("Tab " + (i + 1)));*/

        tabLayout.setTabMode( TabLayout.MODE_FIXED );

        TabLayout.Tab tab1 = tabLayout.newTab();
        TabLayout.Tab tab2 = tabLayout.newTab();
        TabLayout.Tab tab3 = tabLayout.newTab();

        tab1.setText("Tab 1");
        tab2.setText("Tab 2");
        tab3.setText("Tab 3");

        tabLayout.addTab( tab1 );
        tabLayout.addTab( tab2 );
        tabLayout.addTab( tab3 );

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
