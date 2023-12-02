package com.reynafigueroa.wisewallet

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import org.w3c.dom.Text

class IngresosAdapter (private val ingresos: List<Ingresos>): RecyclerView.Adapter<IngresosAdapter.IngresoViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IngresoViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.iteam_ingreso, parent, false)
        return IngresoViewHolder(view)
    }

    override fun onBindViewHolder(holder: IngresoViewHolder, position: Int) {
        val ingreso = ingresos[position]
        holder.render(ingreso)
    }

    override fun getItemCount(): Int {
        return  ingresos.size
    }

    class IngresoViewHolder(view: View) : RecyclerView.ViewHolder(view){

        val cant : TextView = view.findViewById(R.id.cant)
        val tipo : TextView = view.findViewById(R.id.tipo)
        val fecha : TextView = view.findViewById(R.id.fecha)

        val image : ImageView = view.findViewById(R.id.image)

        fun render (ingresos: Ingresos){

            cant.text = ingresos.cant
            tipo.text = ingresos.tipo
            fecha.text = ingresos.fecha

            Picasso.get().load(ingresos.imagen).into(image)
        }
    }
}