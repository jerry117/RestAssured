public enum Gender implements GenderDesc {

    MALE("男"){

        public void info() {
            System.out.println("male");
        }
    },
    FEMALE("女"){

        public void info(){
            System.out.println("female");
        }
    };

    private final String name;

    private Gender(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void info(){
        System.out.println("afljlj");
    }
}
