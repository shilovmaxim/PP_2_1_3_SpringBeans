package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {

    @Autowired
//    @Qualifier("dog") // 1-й способ
    private Animal animal;

//    @Autowired
//    private Dog animal;  // 2-й способ
////   private Cat animal; // он же (гланое тип)
                            // 3-й способ @Primary в компоненте Dog

//    вся задача по сути про Timer
    @Autowired
    private Timer timer;

    public Timer getTimer() {
        return timer;
    }

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(timer.getTime());
        System.out.println("________________________");
    }
}
