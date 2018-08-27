package com.sensorsdata.analytics.android.sdk;

import android.view.View;
import android.widget.AdapterView;

/* public */ class WrapperAdapterViewOnItemClick implements AdapterView.OnItemClickListener {
    private AdapterView.OnItemClickListener source;

    WrapperAdapterViewOnItemClick(AdapterView.OnItemClickListener source) {
        this.source = source;
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
        if (source != null) {
            source.onItemClick(adapterView, view, position, id);
        }

        SensorsDataPrivate.trackAdapterView(adapterView, view, position);
    }
}
