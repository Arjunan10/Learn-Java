public class Constructor {
        int id;
        String name;
        char gender;
        int age;

        //Constructor without parameters ,returns id
        public Constructor() {
            id = 10;
            System.out.println("ID:"+id);
        }

        //Constructor with single parameter called x,which gives name
        public Constructor(String x) {
            name = x;
            System.out.println("Name:"+name);
        }

        //Constructor with two parameters called g and acc to return gender and Access
        public Constructor(char g, int a) {
            gender = g;
            age = a;
            System.out.println("Gender:"+gender);
            System.out.println("Age:"+age);
        }

        public static void main(String[] args) {
            Constructor con1 = new Constructor();//CONSTRUCTOR FOR ID
            Constructor con2 = new Constructor("HAFI");//CONSTRUCTOR FOR NAME
            Constructor con3= new Constructor('M',22);//CONSTRUCTOR FOR GENDER AND AGE
        }
    }

