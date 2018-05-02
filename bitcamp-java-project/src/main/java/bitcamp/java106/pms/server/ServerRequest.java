// 역할: 서버 요청 정보를 다룬다. 
package bitcamp.java106.pms.server;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;

public class ServerRequest {
    
    protected String path;
    protected HashMap<String,String> paramMap = new HashMap<>();
    
    public ServerRequest(String requestLine) {
        // requestLine의 예) /board/add?title=aaa&content=bbb
        
        String[] arr = requestLine.split("\\?");
        
        this.path = arr[0]; // 예) /board/add
        if (arr.length > 1) {
            toParamMap(arr[1]);
        }
    }
    
    private void toParamMap(String queryString) {
        // queryString 예) title=aaa&content=bbb
        // 데이터는 key와 value로 분리하여 맵에 저장한다.
        String[] entryArr = queryString.split("&");
        
        for (String entry : entryArr) {
            String[] keyValue = entry.split("=");
            //keyValue[1]은 UTF-8 코드를 ASCII문자화한 것이다
            //그러니 원래 UTF-8 로 만든 후에 
            //이것을 다시 UTF-16으로 만들어 자바 String 객체를 리턴하라
            //즉 UTF-8 코드를 URL인코딩한 것이다
            try {
                this.paramMap.put(keyValue[0], URLDecoder.decode(keyValue[1], "UTF-8"));
            } catch (UnsupportedEncodingException e) {
                System.out.println("URL 디코딩 오류!");
            }
        }
    }
    
    public String getServerPath() {
        return this.path;
    }
    
    public String getParameter(String name) {
        return paramMap.get(name);
    }
}

//ver 28 - 클래스 추가




