import java.io.Serializable;

public class Main implements Serializable {
        private String number;
        private String name;

    public Main (String number, String name){
            this.name = name;
            this.number = number;
        }

        public String getNumber(){
        return number;
        }

        public String getName(){
            return name;

        }

        public  String toString (){
            return number + " - " + name;
        }
}
