package Unit_5.Sprint1_evaluation;

import java.util.ArrayList;
import java.util.HashMap;

public class Q2 {
    HashMap<String, ArrayList<String>> mobiles = new HashMap<>();
    public String addMobile(String company, String model) {
        if(mobiles.containsKey(company)) {
            ArrayList<String>temList = mobiles.get(company);
            temList.add(model);
            mobiles.replace(company, temList);

        }else {
            ArrayList<String>temList =new ArrayList<>();
            temList.add(model);
            mobiles.put(company, temList);

        }
        return "Mobile added successfully";

    }

    public ArrayList<String>getModels(String company){
        ArrayList<String>tem = mobiles.get(company);
        if(!tem.isEmpty()) {
            return tem;
        }
        return null;
    }
    public static void main(String[] args) {
        try {
            Q2 objMobile = new Q2();
            System.out.println(objMobile.addMobile("apple","Iphone 13"));
            System.out.println(objMobile.addMobile("samsung","s10 plus"));
            System.out.println(objMobile.addMobile("nokia","N1"));
            System.out.println(objMobile.addMobile("moto","G4 plus"));

            ArrayList<String>modeList = objMobile.getModels("apple");
            for(String s: modeList) {
                System.out.println(s);
            }




        } catch (Exception e) {
            System.out.println("Exception"+e);
        }


    }



}

