package com.gk.airappui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.github.mikephil.charting.charts.BarChart
import com.github.mikephil.charting.data.BarData
import com.github.mikephil.charting.data.BarDataSet
import com.github.mikephil.charting.data.BarEntry
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var barData: BarData
    lateinit var barDataSet: BarDataSet
    var barEntries: MutableList<BarEntry> = mutableListOf()
    var barEntries2: MutableList<BarEntry> = mutableListOf()
    var barEntries3: MutableList<BarEntry> = mutableListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setBarsData(barChart, setBarDataSet(getEntries(),R.color.bar_color))
        setBarsData(barChart2,setBarDataSet(getEntries2(),R.color.bar_color2))
        setBarsData(barChart3,setBarDataSet(getEntries3(),R.color.bar_color2))


    }

    fun setBarDataSet(barEntry: MutableList<BarEntry>,color:Int): BarData {
        barDataSet = BarDataSet(barEntry, "Data set")
        barDataSet.setColors(ContextCompat.getColor(this, color))

        barData = BarData(barDataSet)
        barData.setDrawValues(false)
        barData.setValueTextSize(0f)
        //barData.barWidth  = 0.5f
        return barData
    }

    fun setBarsData(barChart: BarChart, barData: BarData) {
        barChart.data = barData
        barChart.xAxis.isEnabled = false
        barChart.axisLeft.isEnabled = false
        barChart.axisRight.isEnabled = false
        barChart.isClickable = false
        barChart.description.isEnabled = false
    }

    fun getEntries(): MutableList<BarEntry> {
        barEntries.add(BarEntry(1f, 1f))
        barEntries.add(BarEntry(2f, 2f))
        barEntries.add(BarEntry(3f, 3f))
        barEntries.add(BarEntry(4f, 4f))
        barEntries.add(BarEntry(5f, 5f))
        barEntries.add(BarEntry(6f, 4f))
        barEntries.add(BarEntry(7f, 3f))

        return barEntries
    }

    fun getEntries2(): MutableList<BarEntry> {
        barEntries2.add(BarEntry(1f, 2f))
        barEntries2.add(BarEntry(2f, 3f))
        barEntries2.add(BarEntry(3f, 4f))
        barEntries2.add(BarEntry(4f, 1f))
        barEntries2.add(BarEntry(5f, 3f))
        barEntries2.add(BarEntry(6f, 5f))
        barEntries2.add(BarEntry(7f, 4f))
        return barEntries2
    }

    fun getEntries3(): MutableList<BarEntry> {
        barEntries3.add(BarEntry(1f, 2f))
        barEntries3.add(BarEntry(2f, 4f))
        barEntries3.add(BarEntry(3f, 1f))
        barEntries3.add(BarEntry(4f, 3f))
        barEntries3.add(BarEntry(5f, 5f))
        barEntries3.add(BarEntry(6f, 3f))
        barEntries3.add(BarEntry(7f, 2f))
        return barEntries3
    }
}