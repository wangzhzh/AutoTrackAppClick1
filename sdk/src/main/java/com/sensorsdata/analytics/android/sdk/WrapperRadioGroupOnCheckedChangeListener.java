package com.sensorsdata.analytics.android.sdk;

import android.widget.RadioGroup;

/*public*/ class WrapperRadioGroupOnCheckedChangeListener implements RadioGroup.OnCheckedChangeListener {
    private RadioGroup.OnCheckedChangeListener source;

    WrapperRadioGroupOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener source) {
        this.source = source;
    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        //调用原有的 OnClickListener
        try {
            if (source != null) {
                source.onCheckedChanged(radioGroup, i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        //插入埋点代码
        SensorsDataPrivate.trackViewOnClick(radioGroup);
    }
}
