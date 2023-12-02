package com.reynafigueroa.wisewallet

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class ListFragment : Fragment() {

    private var ingresos: List<Ingresos> = emptyList()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_list, container, false)

        initData()
        val recyclerView = view.findViewById<RecyclerView>(R.id.listRecycler)
        val adapter = IngresosAdapter(ingresos)
        val layoutManager = LinearLayoutManager(view.context)
        //val gridLayoutManager = GridLayoutManager(view.context, 2)

        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = adapter

        return view
    }
    fun initData(){
        ingresos = listOf(
            Ingresos(1,"$1000", "Trabajo","01/07/2023","https://dailyjobs.es/wp-content/uploads/descubre-como-acceder-a-ofertas-de-trabajo-a-traves-de-la-web-del-psoe-en-dailyjobs.png"),
            Ingresos(2,"$2500", "Inversion","01/07/2023","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSTxBlxNKZ77qCXjgTC1w9zICVOg_r5udA_dw&usqp=CAU"),
            Ingresos(3,"$150", "Venta","01/07/2023","https://public-library.safetyculture.io/media/c99029a2-cbe1-49b4-908d-fdf44e104909"),
            Ingresos(4,"$580", "Venta","01/07/2023","https://public-library.safetyculture.io/media/c99029a2-cbe1-49b4-908d-fdf44e104909"),
            Ingresos(5,"$1800", "Trabajo","01/07/2023","https://dailyjobs.es/wp-content/uploads/descubre-como-acceder-a-ofertas-de-trabajo-a-traves-de-la-web-del-psoe-en-dailyjobs.png"),
            Ingresos(6,"$1000", "Trabajo","01/07/2023","https://dailyjobs.es/wp-content/uploads/descubre-como-acceder-a-ofertas-de-trabajo-a-traves-de-la-web-del-psoe-en-dailyjobs.png"),
            Ingresos(7,"$580", "Venta","01/07/2023","https://public-library.safetyculture.io/media/c99029a2-cbe1-49b4-908d-fdf44e104909"),
            Ingresos(8,"$580", "Venta","01/07/2023","https://public-library.safetyculture.io/media/c99029a2-cbe1-49b4-908d-fdf44e104909"),
            Ingresos(9,"$580", "Venta","01/07/2023","https://public-library.safetyculture.io/media/c99029a2-cbe1-49b4-908d-fdf44e104909"),
            Ingresos(10,"$580", "Venta","01/07/2023","https://public-library.safetyculture.io/media/c99029a2-cbe1-49b4-908d-fdf44e104909"),
        )
    }

}