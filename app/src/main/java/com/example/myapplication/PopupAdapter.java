package com.example.myapplication;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;

public class PopupAdapter implements GoogleMap.InfoWindowAdapter {
    View window;
    DataSmoking smoking;
    public PopupAdapter(View window, DataSmoking smoking){
        this.window = window;
        this.smoking = smoking;//정보를 담은 객체
    }

    @Override
    public View getInfoWindow(Marker marker) {
        Button navi = window.findViewById(R.id.navigation);
        Button map = window.findViewById(R.id.map);
        Button info = window.findViewById(R.id.info);

        navi.setText(smoking.name+"\n으로 길찾기");
        map.setText(smoking.name+"\n카카오맵 열기");
        info.setText(smoking.name+"\n정보 보기");
        return window;
}

    @Override
    public View getInfoContents(Marker marker) {
        return null;
    }
}

