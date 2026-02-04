public class Lasagna {

    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven(){
       return 40;
    }
    

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int min){
        return expectedMinutesInOven() - min;
    }
    

    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int lay){
        return (lay*2);
    }

    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int lay, int min){
        return preparationTimeInMinutes(lay) +min;
    }
    
}
