public class Rectangle {
    int height;
    int lenght;
    Rectangle(int height,int lenght){
        this.height = height;
        this.lenght = lenght;
    }

    public int area(){
        int area = height*lenght;
        return area;
    }

    public int perimeter(){
        int perimeter = 2*height+2*lenght;
        return perimeter;
    }
}
