package practice2.run;

import practice2.model.vo.GalaxyNote9;
import practice2.model.vo.SmartPhone;
import practice2.model.vo.V40;

public class Run {
    public static void main(String[] args) {
        SmartPhone[] sp = new SmartPhone[2];
        sp[0] = new GalaxyNote9();
        sp[1] = new V40();

        for (SmartPhone smartPhone : sp) {
            smartPhone.printMaker();
            smartPhone.makeaCall();
            smartPhone.takeaCall();
            smartPhone.touch();
            smartPhone.charge();
            smartPhone.picture();
            System.out.println();
        }
    }
}
