import java.util.ArrayList;
public class StarshipExplorer {
    public String name;
    public int age;
    public Alien[] UFOs; //step 4: declaring array
    public Alien blank;

    public StarshipExplorer(String Pname, int Page){
        name=Pname;
        age=Page;           //constructor

        UFOs=new Alien[100];  //step 4: creating array
        blank=new Alien(0,0); //step 6: blank alien to switch around with for sort

            for(int x=0;x<UFOs.length;x++){  //step 4: filling array
                UFOs[x] = new Alien( (int)(50*Math.random()), (int)(20*Math.random()) );
            }

        //STEP 7
        displayAliens();
        sortAliens();
        displayAliens();
    }

    public static void main(String[] args) {  //step 2: psvm
        StarshipExplorer myStarshipExplorer=new StarshipExplorer("Jack", 21); //step 2: starship object
        System.out.println("Hello World! Good luck on your exams");  //step 2: testing...
    }

    public void sortAliens(){  //step 6: sort (by energy level lowest to highest)

        for(int x=0;x<UFOs.length;x++){
            for(int a=0;a<UFOs.length-x-1;a++) {
                if (UFOs[a].energyLevel > UFOs[a + 1].energyLevel) {
                    blank=UFOs[a];
                    UFOs[a]=UFOs[a+1];
                    UFOs[a+1]=blank;
                }
            }
        }
        System.out.println();
        System.out.println("sorting...");
        System.out.println();
    }

    public void displayAliens(){  //step 5: display aliens
        for(int x=0;x< UFOs.length;x++){
            UFOs[x].printInfo();
        }
    }

}
