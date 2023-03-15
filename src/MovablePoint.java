public class MovablePoint extends Point{
    private float xSpeed;
    private float ySPeed;

    public MovablePoint() {
    }

    public MovablePoint(float xSpeed, float ySPeed) {
        this.xSpeed = xSpeed;
        this.ySPeed = ySPeed;
    }
    public MovablePoint(float x, float y ,float xSpeed, float ySPeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySPeed = ySPeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySPeed() {
        return ySPeed;
    }

    public void setySPeed(float ySPeed) {
        this.ySPeed = ySPeed;
    }
    public MovablePoint move(){
        super.x += xSpeed;
        super.y += ySPeed;
        return this;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "xSpeed=" + xSpeed +
                ", ySPeed=" + ySPeed + super.toString() +
                '}';
    }
}
