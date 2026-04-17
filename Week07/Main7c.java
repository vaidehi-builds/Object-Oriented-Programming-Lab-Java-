package Week07;
class Building{
    double sqft;
    int stories;
    Building(){
        sqft=0;
        stories=0;
    }
    Building(double sqft,int stories){
        this.sqft=sqft;
        this.stories=stories;
    }
    void displayDetails(){
        System.out.println("Square feet: "+sqft);
        System.out.println("Number of Stories: "+stories);
    }

}
class House extends Building{
    int nbed;
    int nbath;
    House(){
        super();
        nbed=0;
        nbath=0;
    }
    House(double sqft,int stories, int nbed, int nbath){
        super(sqft,stories);
        this.nbed=nbed;
        this.nbath=nbath;
    }
    @Override
    void displayDetails(){
        super.displayDetails();
        System.out.println("Number of bedrooms: "+nbed);
        System.out.println("Number of Bathrooms: "+nbath);
    }

}
class School extends Building{
    int nclass;
    String gradelevel;
    School(){
        super();
        nclass=0;
        gradelevel="NotAssigned";
    }
    School(double sqft,int stories,int nclass,String gradelevel){
        super(sqft,stories);
        this.nclass=nclass;
        this.gradelevel=gradelevel;
    }
    @Override
    void displayDetails(){
        super.displayDetails();
        System.out.println("Number of Classrooms: "+nclass);
        System.out.println("Grade Level: "+gradelevel);
    }
}
public class Main7c {
    public static void main(String[] args){
        Building b1=new Building(2300,3);
        b1.displayDetails();
        b1=new Building();
        b1.displayDetails();
        Building b2=new School(3200.5,4,25,"Elementary");
        b2.displayDetails();
        b2=new School();
        b2.displayDetails();
        Building b3=new House(3200.9,1,3,2);
        b3.displayDetails();
    }
}
