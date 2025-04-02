package ch20_json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
class User {
    private String username;
    private String password;
    private String email;
    private String name;
    private String age;
}

public class JSON2 {
    public static void main(String[] args) {
        Gson gson = new Gson();
        Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();

        // 사용할 변수 선언 -> Json 데이터는 자료형이 String입니다.
        String userJson = null;
        String studentJSon = null;


        // Java Object -> json으로의 변환 사례
        // user1 객체를 생성하고 "kim1", "9876", "a@test.com", "김일", "20"로 입력하시오.
        User user1 = new User("kim1", "9876", "a@test.com", "김일", "20");
        //JSON1을 참조하여 gson을 통한 JSON 데이터로 변경을 시도하세요. -> 그리고 콘솔 출력
        System.out.println("json 형태로 변환 : " + gson.toJson(user1));
        // 객체 그대로 출력하면
        System.out.println("java 객체 형태로 출력 : " + user1);
        // 동일하게 gsonBuilder를 통해 JSON 데이터로 변경을 시도하세요. -> 그리고 콘솔 출력
        System.out.println("prettyPrinting 적용 후 출력 : \n" + gsonBuilder.toJson(user1));

        // gsonBuilder를 통한 결과값을 userJson에 대입하세요.
        userJson = gsonBuilder.toJson(user1);       // Json 데이터가 String인게 증명됩니다.

        // JsonObject -> json으로의 변환 사례
        // JSonObject를 활용하여 studentCode 2025001 / studentName 김이 / studentYear 2 / score 96.7인 객체를 생성하시오.
        // 참고로 key value 다 String으로 잡아놓겠습니다.

        // 그거 끝나면 gsonBuilder를 활용하여 JsonObject 객체를 json으로 변환시키오.
        // 그거 끝나면 해당 데이터를 studentJson에 대입하고, 출력하시오. 그러면 맨마지막 코드는

        System.out.println(studentJSon);
    }
}
