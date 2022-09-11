package entities;

public class Rectangle {
    private Double width;
    private Double height;

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getWidth() {
        return this.width;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getHeight() {
        return this.height;
    }

    public Double area() {
        return getWidth() * getHeight();
    }

    public Double perimeter() {
        return (getHeight() + getWidth()) * 2.0;
    }

    public Double diagonal() {
        return Math.sqrt(Math.pow(getWidth(), 2.0) + Math.pow(getHeight(), 2.0));
    }

    public String toString() {
        return "AREA = "
                + String.format("%.2f", area())
                + "\nPERIMETER = "
                + String.format("%.2f", perimeter())
                + "\nDIAGONAL = "
                + String.format("%.2f", diagonal());
    }
}
