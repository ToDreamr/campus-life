package net.rain.entity.enpo;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
public enum ResultCode {
    //状态代码由枚举类,或者实体类实现，然后构建相应的静态方法

    SUCCESS(200,"请求成功"),
    FAIED(500,"请求失败"),
    VALIDATE_ERROR(501, "参数校验失败"),
    RESPONSE_PACK_ERROR(503, "response返回包装失败");

    private int code;
    private String msg;

    ResultCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
