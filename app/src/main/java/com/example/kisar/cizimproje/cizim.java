package com.example.kisar.cizimproje;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by kisar on 11.06.2019.
 */

public class cizim extends View {
    Path path = new Path();
    Paint paint= new Paint();
    //import

    public cizim(Context context) {
        super(context);
        paint.setColor(Color.BLACK);
        paint.setAntiAlias(true);//cigileri tamamlamak için kullanılmaktadır

    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawPath(path,paint);
        super.onDraw(canvas);

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        float x= event.getX();
        float y= event.getY();
        path.addCircle(x,y,10,Path.Direction.CW);
        invalidate();

        return true;

    }
}
