package Classes;

class UseBox{
    public static void main(String[] args) {

        Box a = new Box(10,10,10,10);
        Box b = new Box(5,10,5,10);

        double volume1, volume2;

   
        volume1 = a.volume();
        volume2 = b.volume();

        System.out.println("Volume " + volume1);
        System.out.println("Volume " + volume2);
    }
}

