package com.example.modul4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView


class chat : Fragment() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var recyclerViewAdapter: adaper
    private lateinit var listData: ArrayList<datpeserta>

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_chat, container, false)
        recyclerView = view.findViewById(R.id.idrecycle_chat)
        listData = ArrayList()

        val layoutManager = GridLayoutManager(context, 1)
        recyclerView.layoutManager = layoutManager
        recyclerViewAdapter = adaper(listData, requireContext())

        recyclerView.adapter = recyclerViewAdapter
        listData.add(datpeserta("Naufal Ilham F", "NIM 21000000034", "21 Tahun", "Alamat Pasuruan", R.drawable.foto4))
        listData.add(datpeserta("Fiola Laurent", "NIM 210000000135", "19 Tahun","Alamat Jakarta", R.drawable.foto1))
        listData.add(datpeserta("Novia Putri", "NIM 210000000345", "20 Tahun", "Alamat Bandung",R.drawable.foto2))
        listData.add(datpeserta("Chafi Aprilia", "NIM 210000000457", "17 Tahun", "Alamat Surabaya",R.drawable.foto3))
        listData.add(datpeserta("Helen Nur F", "NIM 210000000045", "20 Tahun", "Alamat Jombang",R.drawable.foto4))
        listData.add(datpeserta("Wahyu Pratam R", "NIM 210000000078", "18 Tahun", "Alamat Banyuwangi",R.drawable.foto5))
        listData.add(datpeserta("Badrut Timim P", "NIM 210000000090", "21 Tahun", "Alamat Sidoarjo",R.drawable.foto6))
        listData.add(datpeserta("Abdul Jabbar R", "NIM 210000000087", "19 Tahun", "Alamat Semarang",R.drawable.foto7))
        listData.add(datpeserta("Muhammad Mahendra", "NIM 210000000657", "19 Tahun","Alamat Kediri", R.drawable.foto1))
        listData.add(datpeserta("Rizki Rian Pratamasa", "NIM 210000067896", "20 Tahun", "Alamat Jombang",R.drawable.foto2))
        listData.add(datpeserta("Dhanis Haidar Alwi", "NIM 210000068998", "18 Tahun", "Alamat Probolingo", R.drawable.foto3))
        listData.add(datpeserta("Sinta Yasinta ", "NIM 210000017869", "19 Tahun", "Alamat Tuban", R.drawable.foto4))

        recyclerViewAdapter.notifyDataSetChanged() // notify data set changes
        return view
    }
}