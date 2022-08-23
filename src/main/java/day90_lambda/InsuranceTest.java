package day90_lambda;

public class InsuranceTest  {
    public static void main(String[] args) {

        Person karim = new Person();
        Car honda = new Car();
        Insurance Gaico = new Insurance();

        getCarInsuranceName(karim);




    }

        public static String getCarInsuranceName(Person person){
            return person.getCar().getInsurance().getName();

    }
}
