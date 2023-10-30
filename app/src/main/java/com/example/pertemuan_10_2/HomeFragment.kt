package com.example.pertemuan_10_2

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val fragmentHome = inflater.inflate(R.layout.fragment_home, container, false)
        val userProf = fragmentHome.findViewById<TextView>(R.id.username)
        var savedUsername = MainActivity.EXTRA_USERNAME
        val imgMovie1 = fragmentHome.findViewById<ImageButton>(R.id.btn_movie_1)
        val imgMovie2 = fragmentHome.findViewById<ImageButton>(R.id.btn_movie_2)
        val imgMovie3 = fragmentHome.findViewById<ImageButton>(R.id.btn_movie_3)
        val imgMovie4 = fragmentHome.findViewById<ImageButton>(R.id.btn_movie_4)
        val imgMovie5 = fragmentHome.findViewById<ImageButton>(R.id.btn_movie_5)
        val imgMovie6 = fragmentHome.findViewById<ImageButton>(R.id.btn_movie_6)
        val imgMovie7 = fragmentHome.findViewById<ImageButton>(R.id.btn_movie_7)

        userProf.setText(savedUsername)

        imgMovie1.setOnClickListener {
            val intentToDetailActivity =
                Intent(getActivity(), DetailActivity::class.java)
            startActivity(intentToDetailActivity)
        }
        imgMovie2.setOnClickListener {
            val intentToDetailActivity =
                Intent(getActivity(), DetailActivity2::class.java)
            startActivity(intentToDetailActivity)
        }
        imgMovie3.setOnClickListener {
            val intentToDetailActivity =
                Intent(getActivity(), DetailActivity3::class.java)
            startActivity(intentToDetailActivity)
        }
        imgMovie4.setOnClickListener {
            val intentToDetailActivity =
                Intent(getActivity(), DetailActivity4::class.java)
            startActivity(intentToDetailActivity)
        }
        imgMovie5.setOnClickListener {
            val intentToDetailActivity =
                Intent(getActivity(), DetailActivity5::class.java)
            startActivity(intentToDetailActivity)
        }
        imgMovie6.setOnClickListener {
            val intentToDetailActivity =
                Intent(getActivity(), DetailActivity6::class.java)
            startActivity(intentToDetailActivity)
        }
        imgMovie7.setOnClickListener {
            val intentToDetailActivity =
                Intent(getActivity(), DetailActivity7::class.java)
            startActivity(intentToDetailActivity)
        }

        return fragmentHome
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment HomeFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            HomeFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}