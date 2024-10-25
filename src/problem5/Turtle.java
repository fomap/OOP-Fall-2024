package problem5;

class Turtle extends Animal {
    
	public Turtle(String name, int age) {
        super(name, age);
    }

    @Override
    public String getSound() {
        return "COWABUNGA";
    }
}
