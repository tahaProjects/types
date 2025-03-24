import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static Map<String,typeDef> typesMain = new HashMap<>();

    public void showTypes() {
        for (typeDef type : typesMain.values()) {
            System.out.println(type.typeName);
        }
    }

    public static void main(String[] args) {
        typeDef student = new typeDef("Student");
        student.addField(new fieldDef("id","int",true,true));
        student.addField(new fieldDef("name","string",true,false));

        Map<String,Object> temp = new LinkedHashMap<>();
        temp.put("id",25);
        temp.put("name","taha");
        student.addRecord(temp);


        student.showRecords();
    }

}
