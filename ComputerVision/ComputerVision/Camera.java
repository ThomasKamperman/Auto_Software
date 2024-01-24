package ComputerVision;

import Utils.Pose.*;

public class Camera{

    public boolean UpsideUp;            //Indicates if the camera is upsidedown or not
    public int aspectX, aspectY;        //Used to calculate the aspectratio of the camera
    public Position camPosition;        //The position of the camera on te car
    public Orientation camOrientation;  //The Orientatatin of the camerea on the car

    public Camera(int aspectX, int aspectY, boolean UpsideUp, Position camPosition, Orientation camOrientation) //Constructor for the camera
    {
        this.aspectX = aspectX;
        this.aspectY = aspectY;
        this.UpsideUp = UpsideUp;
        this.camPosition = camPosition;
        this.camOrientation = camOrientation;
    }


}