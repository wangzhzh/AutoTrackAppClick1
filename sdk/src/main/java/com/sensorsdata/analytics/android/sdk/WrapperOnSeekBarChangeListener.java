package com.sensorsdata.analytics.android.sdk;

import android.widget.SeekBar;

/*public*/ class WrapperOnSeekBarChangeListener implements SeekBar.OnSeekBarChangeListener {
    private SeekBar.OnSeekBarChangeListener source;

    WrapperOnSeekBarChangeListener(SeekBar.OnSeekBarChangeListener source) {
        this.source = source;
    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
        if (source != null) {
            source.onStopTrackingTouch(seekBar);
        }

        SensorsDataPrivate.trackViewOnClick(seekBar);
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
        if (source != null) {
            source.onStartTrackingTouch(seekBar);
        }
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
        if (source != null) {
            source.onProgressChanged(seekBar, i, b);
        }
    }
}
