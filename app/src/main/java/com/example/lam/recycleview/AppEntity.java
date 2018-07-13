package com.example.lam.recycleview;

public class AppEntity {
    private int mIcphim;
    private String mNamePhim;

    public AppEntity(int mIcphim, String mNamePhim) {
        this.mIcphim = mIcphim;
        this.mNamePhim = mNamePhim;
    }

    public int getmIcphim() {
        return mIcphim;
    }

    public void setmIcphim(int mIcphim) {
        this.mIcphim = mIcphim;
    }

    public String getmNamePhim() {
        return mNamePhim;
    }

    public void setmNamePhim(String mNamePhim) {
        this.mNamePhim = mNamePhim;
    }
}
