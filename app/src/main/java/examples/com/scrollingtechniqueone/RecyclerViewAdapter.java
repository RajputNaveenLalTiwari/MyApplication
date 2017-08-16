package examples.com.scrollingtechniqueone;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by 2114 on 04-01-2017.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>
{
    String[] data;

    public RecyclerViewAdapter(String[] data)
    {
        this.data = data;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View itemView = LayoutInflater.from(parent.getContext())
                            .inflate(R.layout.recyclerview_items,parent,false);

        ViewHolder viewHolder = new ViewHolder(itemView);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position)
    {
        holder.TEXT_VIEW.setText(data[position]);
    }

    @Override
    public int getItemCount()
    {
        return data.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder
    {
        private final TextView TEXT_VIEW;
        public ViewHolder(View itemView)
        {
            super(itemView);

            TEXT_VIEW = (TextView) itemView.findViewById( R.id.itemText );
        }
    }
}
