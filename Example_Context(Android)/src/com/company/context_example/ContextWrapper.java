package com.company.context_example;

public class ContextWrapper extends Context {
    private final Context mContext;

    public ContextWrapper(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    public Context getContext() {
        return mContext.getContext();
    }
}
