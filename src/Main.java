public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("             " + "Задание 1");
        int [] mass = new int [3];
        mass [0] = 1;
        mass [1] = 2;
        mass [2] = 3;
        int januaryMass = mass [0];
        System.out.println("Вес в январе: "+ januaryMass);
        double [] weight = {1, 2, 3, 1.57, 7.654, 9.986};
        double aprilWeight = weight [4];
        System.out.println("Вес в апреле: "+ aprilWeight);
        float [] volume = new float [2];
        volume [0]= -1;
        volume [1]= -2;
        float mayVolume =  volume [1];
        System.out.println("объём в мае: "+ mayVolume);
        System.out.println("             " + "Задание 2");
        System.out.println("Масса: "+ mass [0]+"," + mass [1]+"," + mass [2]);
        System.out.println("Вес: " + weight [0]+","+ weight [1]+","+ weight [2]+","+ weight [3]+","+ weight [4]+","+ weight [5]);
        System.out.println("Объём:" + volume [0]+","+ volume [1]);
        System.out.println("             " + "Задание 3");
        System.out.println("Масса: "+ mass [2]+"," + mass [1]+"," + mass [0]);
        System.out.println("Вес: " + weight [5]+","+ weight [4]+","+ weight [3]+","+ weight [2]+","+ weight [1]+","+ weight [0]);
        System.out.println("Объём: " + volume [1]+","+ volume [0]);
        System.out.println("             " + "Задание 4");
        int y =1;
        for (; y<3;y++ ){
            float volumePlus=  volume [0] + y;
            float volumePlus1 =  volume [1] + y;
            System.out.println("Сложение первого массива  "+ volumePlus);
            System.out.println("Сложение второго массива "+ volumePlus1);
        }

    }
}