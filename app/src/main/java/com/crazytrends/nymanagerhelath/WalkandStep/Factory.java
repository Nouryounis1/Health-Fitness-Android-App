
package com.crazytrends.nymanagerhelath.WalkandStep;

import android.content.pm.PackageManager;

import com.crazytrends.nymanagerhelath.WalkandStep.services.AbstractStepDetectorService;
import com.crazytrends.nymanagerhelath.WalkandStep.services.AccelerometerStepDetectorService;
import com.crazytrends.nymanagerhelath.WalkandStep.services.HardwareStepDetectorService;
import com.crazytrends.nymanagerhelath.WalkandStep.utils.AndroidVersionHelper;




public class Factory {



    public static Class<? extends AbstractStepDetectorService> getStepDetectorServiceClass(PackageManager pm){
        if(pm != null && AndroidVersionHelper.supportsStepDetector(pm)) {
            return HardwareStepDetectorService.class;
        }else{
            return AccelerometerStepDetectorService.class;
        }
    }
}
