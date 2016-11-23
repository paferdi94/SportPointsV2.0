package com.example.dannyang27.sportpoints.activities.PruebasDanny;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dannyang27.sportpoints.R;

/**
 * Created by Danny on 23/11/2016.
 */

public class EquipoViewHolder extends RecyclerView.ViewHolder {

    ImageView img;
    TextView nombreTv;
    TextView deporteTv;
    TextView participantesTv;
    Button unirse_btn;
    View view;

    public EquipoViewHolder(View itemView) {
        super(itemView);

        img = (ImageView) itemView.findViewById(R.id.logo_md_equipo);
        nombreTv = (TextView) itemView.findViewById(R.id.nombre_md_equipo);
        deporteTv = (TextView) itemView.findViewById(R.id.deporte_md_equipo);
        participantesTv = (TextView) itemView.findViewById(R.id.participante_md_equipo);
        unirse_btn = (Button) itemView.findViewById(R.id.unirse_md_btn);

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                    int position = getAdapterPosition();
//                    Snackbar.make(view, "Click detected on item: " + position,
//                            Snackbar.LENGTH_LONG).setAction("Action", null).show();
                view.getContext().startActivity(new Intent(view.getContext(), EquipoInfo_MD.class));

            }
        });
    }
}
