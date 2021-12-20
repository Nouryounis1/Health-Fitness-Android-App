package com.crazytrends.nymanagerhelath;

import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.MaterialDialog;
import com.crazytrends.nymanagerhelath.fragment.Workout;

/* compiled from: lambda */
public final /* synthetic */ class d implements MaterialDialog.SingleButtonCallback {


    private final /* synthetic */ Workout f3a;
    private final /* synthetic */ int b;

    public /* synthetic */ d(Workout mainActivity, int i) {
        this.f3a = mainActivity;
        this.b = i;
    }

    public final void onClick(MaterialDialog materialDialog, DialogAction dialogAction) {
        this.f3a.a(this.b, materialDialog, dialogAction);
    }
}
