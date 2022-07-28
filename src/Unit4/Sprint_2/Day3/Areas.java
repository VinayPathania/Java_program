package Sprint_2.Day3;


public class Areas {
    float pie = 3.14f;
    public void AreaCircle(int r){
        float area = pie*(r*r);
        System.out.println("Area of circle: "+ area);
    }
    public void AreaRectangle(int l, int w){
        int area = l*w;
        System.out.println("Area of Rectangle: "+ area);
    }
    public void AreaSquare(int a){
        int area = a*a;
        System.out.println("Area of Square: "+area);
    }


    public static void main(String[] args) {
        int radius = 23;
        int length = 20;
        int breadth = 30;
        int side = 10;


        Areas obj = new Areas();
        obj.AreaCircle(radius);
        obj.AreaRectangle(length,breadth);
        obj.AreaSquare(side);
    }
}
