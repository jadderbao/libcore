package com.sd.libcore.view;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;

@Deprecated
public class SDFullRecyclerView extends SDRecyclerView
{
    private boolean mIsFocusable;

    public SDFullRecyclerView(Context context)
    {
        super(context);
        init();
    }

    public SDFullRecyclerView(Context context, @Nullable AttributeSet attrs)
    {
        super(context, attrs);
        init();
    }

    public SDFullRecyclerView(Context context, @Nullable AttributeSet attrs, int defStyle)
    {
        super(context, attrs, defStyle);
        init();
    }

    private void init()
    {
        setNestedScrollingEnabled(false);
    }

    @Override
    public void setAdapter(Adapter adapter)
    {
        mIsFocusable = isFocusable();
        setFocusable(false);
        super.setAdapter(adapter);
        setFocusable(mIsFocusable);
    }
}
