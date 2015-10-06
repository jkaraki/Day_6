package com.example.joe_karaki.day_6;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by joe_karaki on 10/5/15.
 */
public class MyTextView extends View{


        private int mValue;



        public MyTextView(Context context, AttributeSet attrs) {
            super(context, attrs);
            setupAttributes(attrs);

            setText(mValue + "");
        }
        private void setupAttributes(AttributeSet attrs) {
            // Obtain a typed array of attributes
            TypedArray a = getContext().getTheme().obtainStyledAttributes(attrs, R.styleable.MyTextView, 0, 0);
            // Extract custom attributes into member variables
            try {
                mValue = a.getInt(R.styleable.MyTextView_initialValue, 0);
            } finally {
                // TypedArray objects are shared and must be recycled.
                a.recycle();
            }
        }

        public void incrementAndUpdate() {
            mValue++;
            setText(mValue + "");
        }



    }


