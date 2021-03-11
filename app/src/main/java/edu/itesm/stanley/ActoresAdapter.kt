package edu.itesm.stanley

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView

class ActoresAdapter(private val actores : List<Actor>)
    : RecyclerView.Adapter<ActoresAdapter.ActoresViewHolder>() {

    inner class ActoresViewHolder(renglon : View) : RecyclerView.ViewHolder(renglon){
        var nombre = renglon.findViewById<TextView>(R.id.nombre)
        var pelicula = renglon.findViewById<TextView>(R.id.movie)
        var plot = renglon.findViewById<TextView>(R.id.plot)
        var foto = renglon.findViewById<ImageView>(R.id.foto)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ActoresViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val renglon_vista = inflater.inflate(R.layout.actores_renglon,parent, false)
        return ActoresViewHolder(renglon_vista)
    }

    //Asocia datos con los elementos del renglón
    override fun onBindViewHolder(holder: ActoresViewHolder, position: Int) {
        val actor = actores[position]
        holder.foto.setImageResource(actor.picture)
        holder.nombre.text = actor.name
        holder.pelicula.text = actor.movie
        holder.plot.text = actor.plot

        holder.itemView.setOnClickListener {
            val action = ActorskFragmentDirections.actionActorskFragmentToActorFragment(actor)
            holder.itemView.findNavController().navigate(action)
        }
    }

    // Cuantos elementos tiene la lista
    override fun getItemCount(): Int {
        return actores.size
    }
}