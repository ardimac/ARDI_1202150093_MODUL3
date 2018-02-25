package com.example.airys.ardi_1202150093_modul3.MAIN;

import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import android.support.v7.widget.RecyclerView;
import com.example.airys.ardi_1202150093_modul3.R;

/**
 * Created by airys on 24/02/18.
 */

public class ReyclerViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    TextView tv1, tv2;
    ImageView imageView;
    ItemClickListener itemClickListener;
    CardView cardView;

    public ReyclerViewHolder(View itemView) {
        super(itemView);

        tv1= (TextView) itemView.findViewById(R.id.daftar_judul);
        //menampilkan text dari widget CardView pada id daftar_judul
        tv2= (TextView) itemView.findViewById(R.id.daftar_deskripsi);
        //menampilkan text deskripsi dari widget CardView pada id daftar_deskripsi
        imageView= (ImageView) itemView.findViewById(R.id.daftar_icon);
        //menampilkan gambar atau icon pada widget Cardview pada id daftar_icon
        cardView = (CardView) itemView.findViewById(R.id.card_view);


        //jika kita klik maka akan mengarahkan ke detail view.
        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        this.itemClickListener.onItemClick(this.getLayoutPosition());
    }

    public void setItemClickListener(ItemClickListener itemClickListener){
        this.itemClickListener = itemClickListener;
    }

}
