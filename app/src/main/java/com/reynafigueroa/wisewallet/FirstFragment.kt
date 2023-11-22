package com.reynafigueroa.wisewallet

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.NavController
import androidx.navigation.Navigation

class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_first, container, false)

        val button1 = view.findViewById<Button>(R.id.to_presupuestos)
        val button2 = view.findViewById<Button>(R.id.to_ingresos)
        val button3 = view.findViewById<Button>(R.id.to_gastos)
        val button4 = view.findViewById<Button>(R.id.to_config)
        val button5 = view.findViewById<Button>(R.id.to_info)

        button1.setOnClickListener{
            val controller: NavController =
                Navigation.findNavController(view)

            controller.navigate(
                R.id.action_firstFragment_to_presupuestoFragment
            )
        }

        button2.setOnClickListener{
            val controller: NavController =
                Navigation.findNavController(view)

            controller.navigate(
                R.id.action_firstFragment_to_ingresosFragment
            )
        }

        button3.setOnClickListener{
            val controller: NavController =
                Navigation.findNavController(view)

            controller.navigate(
                R.id.action_firstFragment_to_gastosFragment
            )
        }

        button4.setOnClickListener{
            val controller: NavController =
                Navigation.findNavController(view)

            controller.navigate(
                R.id.action_firstFragment_to_settingsFragment
            )
        }

        button5.setOnClickListener{
            val controller: NavController =
                Navigation.findNavController(view)

            controller.navigate(
                R.id.action_firstFragment_to_informesFragment
            )
        }

        return view
    }

}