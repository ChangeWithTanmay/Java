class consone {
    public String Name;

    public consone(){
        System.out.println("Hello, Sir");
    }

    public void consone(String Name){
        this.Name = Name;
        System.out.println("Hello," + this.Name);
    }

}

class overloading {
    public static void main(String[] args) {
        consone n1 = new consone();
        n1.consone("Tanmay");
    }
}