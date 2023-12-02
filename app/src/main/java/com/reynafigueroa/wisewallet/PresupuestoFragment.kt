package com.reynafigueroa.wisewallet

import android.app.DatePickerDialog
import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import java.util.Calendar

class PresupuestoFragment : Fragment() {
    private var selectedOption: Int = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_presupuesto, container, false)

        val opciones = view.findViewById<Spinner>(R.id.tipoPresupuesto)

        if (opciones != null) {
            val adapter = ArrayAdapter(
                requireContext(),
                android.R.layout.simple_spinner_item,
                resources.getStringArray(R.array.presupuesto_options)
            )

            opciones.adapter = adapter

            opciones.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener {
                override fun onItemSelected(
                    p0: AdapterView<*>?,
                    p1: View?,
                    position: Int,
                    p3: Long
                ) {
                    selectedOption = position
                }

                override fun onNothingSelected(p0: AdapterView<*>?) {
                    TODO("Not yet implemented")
                }
            }
        }

        val fecha = view.findViewById<EditText>(R.id.fechaPresupuesto)

        val calendario = Calendar.getInstance()
        val año = calendario.get(Calendar.YEAR)
        val mes = calendario.get(Calendar.MONTH)
        val día = calendario.get(Calendar.DAY_OF_MONTH)

        fecha.setOnClickListener {
            val datePicker = DatePickerDialog(requireContext(), { _, year, month, day ->
                val fechaSeleccionada = "$day/${month + 1}/$year"
                fecha.setText(fechaSeleccionada)
            }, año, mes, día)

            datePicker.show()
        }

        val save_button = view.findViewById<Button>(R.id.guardarPresupuesto)


        save_button.setOnClickListener{
        }

        return view
    }
}