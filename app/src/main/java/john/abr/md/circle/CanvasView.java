package john.abr.md.circle;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;


public class CanvasView extends View {
    GameManager gameManager;

    public CanvasView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        gameManager = new GameManager();
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        gameManager.onDraw(canvas);
    }
}
