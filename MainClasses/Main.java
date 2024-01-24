package MainClasses;

import ComputerVision.ObjectDetection;
import  Hardware.Hardware;
import Utils.Settings.*;

public class Main {

    ObjectDetection ObjDet = new ObjectDetection(Hardware.cam1);
    static SettingsReader settingsReader = new SettingsReader();

    public static void main(String[] args) {
        settingsReader.read();
    }

        
    
}
