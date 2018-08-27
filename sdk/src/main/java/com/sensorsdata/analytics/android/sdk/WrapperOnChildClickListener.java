package com.sensorsdata.analytics.android.sdk;

import android.view.View;
import android.widget.ExpandableListView;

/*public*/ class WrapperOnChildClickListener implements ExpandableListView.OnChildClickListener {
    private ExpandableListView.OnChildClickListener source;

    WrapperOnChildClickListener(ExpandableListView.OnChildClickListener source) {
        this.source = source;
    }

    @Override
    public boolean onChildClick(ExpandableListView expandableListView, View view, int groupPosition, int childPosition, long id) {

        SensorsDataPrivate.trackAdapterView(expandableListView, view, groupPosition, childPosition);

        if (source != null) {
            return source.onChildClick(expandableListView, view, groupPosition, childPosition, id);
        }

        return false;
    }
}
