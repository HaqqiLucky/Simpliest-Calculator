package com.example.kalkulatortersimplesedunia

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import com.example.kalkulatortersimplesedunia.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val viewModel: MtkBahagiaModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val binding: ActivityMainBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_main)
//        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding.siji.setOnClickListener {
            binding.textviewoperasibilangan.append("1")
        }
        binding.loro.setOnClickListener {
            binding.textviewoperasibilangan.append("2")
        }
        binding.telu.setOnClickListener {
            binding.textviewoperasibilangan.append("3")
        }
        binding.sekawan.setOnClickListener {
            binding.textviewoperasibilangan.append("4")
        }
        binding.gangsal.setOnClickListener {
            binding.textviewoperasibilangan.append("5")
        }
        binding.enem.setOnClickListener {
            binding.textviewoperasibilangan.append("6")
        }
        binding.pitu.setOnClickListener {
            binding.textviewoperasibilangan.append("7")
        }
        binding.wolu.setOnClickListener {
            binding.textviewoperasibilangan.append("8")
        }
        binding.songo.setOnClickListener {
            binding.textviewoperasibilangan.append("9")
        }
        binding.nol.setOnClickListener {
            binding.textviewoperasibilangan.append("0")
        }
        binding.tambah.setOnClickListener {
            binding.textviewoperasibilangan.append("+")
        }
        binding.kurang.setOnClickListener {
            binding.textviewoperasibilangan.append("-")
        }
        binding.kali.setOnClickListener {
            binding.textviewoperasibilangan.append("×")
        }
        binding.bagi.setOnClickListener {
            binding.textviewoperasibilangan.append("/")
        }
        }
    }
