package com.sensorsdata.analytics.android.sdk;

import android.widget.RatingBar;

/*public*/ class WrapperOnRatingBarChangeListener implements RatingBar.OnRatingBarChangeListener {
    private RatingBar.OnRatingBarChangeListener source;

    WrapperOnRatingBarChangeListener(RatingBar.OnRatingBarChangeListener source) {
        this.source = source;
    }

    @Override
    public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
        //调用原有的 OnClickListener
        try {
            if (source != null) {
                source.onRatingChanged(ratingBar, v, b);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        //插入埋点代码
        SensorsDataPrivate.trackViewOnClick(ratingBar);
    }
}
