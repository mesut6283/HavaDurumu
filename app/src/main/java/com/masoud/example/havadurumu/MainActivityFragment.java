package com.masoud.example.havadurumu;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainActivityFragment extends Fragment {

    ArrayAdapter<String> mForecastAdapter;

    public MainActivityFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        String[] forecastArray = {"Today - sunny - 88/63",
                "Tommarrow - Foggy - 70/40",
                "Weds - cloudy - 72/63",
                "Thurs - Asteroids - 75/65",
                "Fri - Heavy Rain - 65/56",
                "Sat - Help Trapped in Whetherstaion - 60/51",
                "Sun - Sunny - 80/68"
                ,
                "Tommarrow - Foggy - 70/40",
                "Weds - cloudy - 72/63",
                "Thurs - Asteroids - 75/65",
                "Fri - Heavy Rain - 65/56",
                "Sat - Help Trapped in Whetherstation - 60/51  gfff  ggfdfgg ghggfhh gggfhjhgfff vgffgdffddf hgfdfddfg  vvfcdfdc   bggggffg ffdx ffccccc/nggghfgf   hghgyguygggt guyghgjhgu hgyyyugh vgffhvnjhfh",
                "Sun - Sunny - 80/68"};
        ArrayList<String> weekForecast = new ArrayList<String>(Arrays.asList(forecastArray));

        mForecastAdapter = new ArrayAdapter<String>(
                getActivity(),
                R.layout.list_item_forcast,
                R.id.list_item_forecast_textView,
                weekForecast);

        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        ListView listView=(ListView)rootView.findViewById(R.id.listView_forecast);
        listView.setAdapter(mForecastAdapter);
        return rootView;
    }

}
