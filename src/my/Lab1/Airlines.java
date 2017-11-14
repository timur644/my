package my.Lab1;

public class Airlines {

    private  String destination; //свойства класса
    private  int flightnum;
    private  String type_aircraft;
    private  int depart_time;
    private  String[] week;

    public Airlines(String destination, int flightnum, //конструктор класса
                    String type_aircraft, int depart_time, String week[]){

        this.destination=destination;
        this.flightnum=flightnum;
        this.type_aircraft=type_aircraft;
        this.depart_time=depart_time;
        this.week=week;
    }

    public String getDestination(){   //метод get
        return  destination;
    }

    public int getFlightnum(){
        return flightnum;
    }

    public String getType_aircraft(){
        return type_aircraft;
    }

    public int getDepart_time(){
        return depart_time;
    }

    public String[] getWeek(){
        return week;
    }


    public void setDestination(String destination){  //метод set
        this.destination=destination;
    }

    public void setFlightnum(int flightnum){
        this.flightnum=flightnum;
    }

    public void setType_aircraft(String type_aircraft){
        this.type_aircraft=type_aircraft;
    }

    public void setDepart_time(int depart_time){
        this.depart_time=depart_time;
    }

    public  void setWeek(String[] week){
        this.week=week;
    }

    @Override
    public String toString(){
        String s = "";
        for(int i=0; i<getWeek().length; i++){
            s = s + getWeek()[i] + " ";
        }
        return getDestination() + " " + getFlightnum() + " " + getType_aircraft() + " " +  getDepart_time() + " " +  s;
    }

    public static void main(String args[]){

        Airlines [] array = new Airlines[5];
        array[0]= new Airlines("Almaty",100,"Boing", 10, new String[]{"Ponedelnik", "Sreda"});   //или это
        array[1]= new Airlines("Astana",200,"Airbus",18, new String[]{"Chetverg", "Subota"});
        array[2]= new Airlines("Moscow",207,"Boing", 22, new String[]{"Pyatnica", "Voskresene"});
        array[3]= new Airlines("Aktobe",310,"Scat",  13, new String[]{"Ponedelnik","Pyatnica"}); // ЭТО должен нам
        array[4]= new Airlines("Chita",219, "Boing", 15, new String[]{"Sreda", "Subota"});

//       for(int i =0; i<5; i++){                                              //1
//            if(array[i].getDestination().equals("Moscow") ){
//                System.out.println(array[i].toString());
//            }
//        }

//        for(int i=0; i<5; i++){                                             //2
//            for (int j=0 ; j < array[i].getWeek().length; j++) {
//                if(array[i].getWeek()[j].equals("Ponedelnik")){
//                    System.out.println(array[i].toString());
//                }
//            }
//        }

        for(int i=0; i<5; i++){                                          //3
            for (int j=0 ; j < array[i].getWeek().length; j++) {
                if (array[i].getWeek()[j].equals("Ponedelnik") && array[j].getDepart_time() >=10 ) {
                    System.out.println(array[i].toString());
                }
            }
        }
    }
}