package com.gmail.carmonespi.project.util.pagetransformer;

import android.view.View;

public class TransformerCustom {
    
    public static void transformPage(View view, float position) {
        int pageWidth = view.getWidth();

        if (position < -1) { // [-Infinity,-1)
            // This page is way off-screen to the left.
            view.setAlpha(0);

        } else if (position <= 1) { // [-1,1]


            View mBlur = null;
            mBlur.setTranslationX((float) (-(1 - position) * 0.5 * pageWidth));
            View mBlurLabel = null;
            mBlurLabel.setTranslationX((float) (-(1 - position) * 0.5 * pageWidth));

            View mDim = null;
            mDim.setTranslationX((float) (-(1 - position) * pageWidth));
            View mDimLabel = null;
            mDimLabel.setTranslationX((float) (-(1 - position) * pageWidth));

            View mCheck = null;
            mCheck.setTranslationX((float) (-(1 - position) * 1.5 * pageWidth));
            View mDoneButton = null;
            mDoneButton.setTranslationX((float) (-(1 - position) * 1.7 * pageWidth));
            // The 0.5, 1.5, 1.7 values you see here are what makes the view move in a different speed.
            // The bigger the number, the faster the view will translate.
            // The result float is preceded by a minus because the views travel in the opposite direction of the movement.

            View mFirstColor = null;
            mFirstColor.setTranslationX((position) * (pageWidth / 4));

            View mSecondColor = null;
            mSecondColor.setTranslationX((position) * (pageWidth / 1));

            View mTint = null;
            mTint.setTranslationX((position) * (pageWidth / 2));

            View mDesaturate = null;
            mDesaturate.setTranslationX((position) * (pageWidth / 1));
            // This is another way to do it


        } else { // (1,+Infinity]
            // This page is way off-screen to the right.
            view.setAlpha(0);
        }
    }

}

