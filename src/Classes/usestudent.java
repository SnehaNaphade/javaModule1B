package Classes;


class Usestudent{

    public static void main(String[] args){
        student a=new student();
        student b=new student();
        double avg1;
        double avg2;

        a.English=80;
        a.Maths=85;
        a.Science=82;
        a.History=81;
        a.Geography=91;

        b.English=70;
        b.Maths=80;
        b.Science=72;
        b.History=80;
        b.Geography=71;

        avg1=(a.English+a.Maths+a.Science+a.History+a.Geography)/5;
        avg2=(b.English+b.Maths+b.Science+b.History+b.Geography)/5;

        System.out.println("Average =" +avg1);
        System.out.println("Average =" +avg2);




    }
}
