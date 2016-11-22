package com.example.nasryn_kingman.eazegraph;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.eazegraph.lib.charts.BarChart;
import org.eazegraph.lib.models.BarModel;


/**
 * A simple {@link Fragment} subclass.
 */
public class BarChartFragment extends Fragment
{
    private BarChart mBarChart;


    public BarChartFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_bar_chart, container, false);
        mBarChart = (BarChart) view.findViewById(R.id.barchart);

        initData();

        return view;
    }
    @Override
    public void onResume() {
        super.onResume();
        mBarChart.startAnimation();
    }

    private void initData()
    {
        mBarChart.addBar(new BarModel("2010", 89.4f, 0xff663397));
        mBarChart.addBar(new BarModel("2011", 53.0f, 0xff4183d7));
        mBarChart.addBar(new BarModel("2012", 100, 0xff19b5fe));
        mBarChart.addBar(new BarModel("2013", 42.9f, 0xff1e8bc3));
        mBarChart.addBar(new BarModel("2014", 113.8f, 0xff36d7b7));
    }

}
