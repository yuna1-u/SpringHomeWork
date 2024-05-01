package peaksoft.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Needle7 {

    private final Death8 death8;

    @Override
    public String toString() {
        return ", смерть Кощея на игле :( " + death8.toString();
    }

    @Autowired
    public Needle7(Death8 deth8) {
        this.death8 = deth8;
    }
}
