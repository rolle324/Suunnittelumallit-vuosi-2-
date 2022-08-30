package factorymethod;

public class Opettaja extends AterioivaOtus {

    public Juoma createJuoma(){
        return new Vesi();
    };
}

    class mehuOpe extends AterioivaOtus {
    	@Override
        public Juoma createJuoma(){
            return new Mehu();
        };
    };
    
    class maitoOpe extends AterioivaOtus {
    	@Override
        public Juoma createJuoma(){
            return new Maito();
        };
    };