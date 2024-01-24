package Utils.Pose;

// This class creates an object used for storing orientation stored in x, y ,z
public class Orientation {
    double xRot, yRot, zRot; // The x, y and z variables for the rotation
    public Orientation(double xRot, double yRot, double zRot)
    {
        this.xRot = xRot;
        this.yRot = yRot;
        this.zRot = zRot;
    }
}
