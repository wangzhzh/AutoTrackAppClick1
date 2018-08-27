package com.sensorsdata.analytics.android.sdk;

import android.view.View;
import android.widget.ExpandableListView;

/*public*/ class WrapperOnGroupClickListener implements ExpandableListView.OnGroupClickListener {
    private ExpandableListView.OnGroupClickListener source;

    WrapperOnGroupClickListener(ExpandableListView.OnGroupClickListener source) {
        this.source = source;
    }

    @Override
    public boolean onGroupClick(ExpandableListView expandableListView, View view, int groupPosition, long id) {
        SensorsDataPrivate.trackAdapterView(expandableListView, view, groupPosition, -1);
        if (source != null) {
            source.onGroupClick(expandableListView, view, groupPosition, id);
        }
        return false;
    }
}
