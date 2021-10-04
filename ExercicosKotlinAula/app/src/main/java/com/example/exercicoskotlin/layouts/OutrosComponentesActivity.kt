package com.example.exercicoskotlin.layouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.RadioButton
import android.widget.SeekBar
import android.widget.Toast
import com.example.exercicoskotlin.R
import com.example.exercicoskotlin.databinding.ActivityOutrosComponentesBinding

class OutrosComponentesActivity : AppCompatActivity() {
    private lateinit var binding: ActivityOutrosComponentesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOutrosComponentesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initSpinner()
        initSeekbar()
        initSwitch()

        // Atribuindo programaticamente os valores-padrão
        binding.chkEnabled.isChecked = true
        binding.skbValue.progress = 20
        binding.spnNames.setSelection(2)
        binding.rgOptions.check(R.id.rbOption2)
        binding.btnShowValues.setOnClickListener { showValues() }
    }
    private fun initSpinner() {
        val names = arrayOf("Greeter 1", "Greeter 2", "Greeter 3")
        val adapter = ArrayAdapter(
            this, android.R.layout.simple_spinner_item, names)
        adapter.setDropDownViewResource(
            android.R.layout.simple_spinner_dropdown_item)
        binding.spnNames.adapter = adapter
    }
    private fun initSeekbar() {
        binding.skbValue.setOnSeekBarChangeListener(
            object : SeekBar.OnSeekBarChangeListener {
                override fun onProgressChanged(seekBar: SeekBar, i: Int, b: Boolean) {
                    binding.txtValue.text = i.toString()
                }
                override fun onStartTrackingTouch(seekBar: SeekBar) {}
                override fun onStopTrackingTouch(seekBar: SeekBar) {}
            })
    }
    private fun initSwitch() {
        binding.swtEnabled.setOnCheckedChangeListener { compoundButton, b ->
            binding.chkEnabled.isEnabled = compoundButton.isChecked
            binding.tgbEnabled.isEnabled = b
        }
    }
    private fun showValues() {
        val idSelectedRadio = binding.rgOptions.checkedRadioButtonId
        val radio = findViewById<RadioButton>(idSelectedRadio)
        val enabledText = getString(
            if (binding.chkEnabled.isChecked) R.string.text_enabled
            else R.string.text_disabled
        )
        val message = getString(R.string.msg_result,
            enabledText,
            binding.skbValue.progress,
            binding.spnNames.selectedItem,
            radio.text.toString()
        )
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}