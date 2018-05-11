/*
 * #{copyright}#
 */

import org.springframework.security.jwt.Jwt;
import org.springframework.security.jwt.JwtHelper;

/**
 * @author chenjingxiong
 */
public class JwtTest {

    public static void main(String[] args) {
        Jwt jwt =  JwtHelper.decode("eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE0OTMzMjQxNzMsInVzZXJfbmFtZSI6ImFkbWluIiwiYXV0aG9yaXRpZXMiOlsiU1RPUkUiXSwianRpIjoiNzc0Y2NjYzItNjNjYi00MGEwLThlZDItNDU4N2NkOGI1NzNjIiwiY2xpZW50X2lkIjoiYWNtZSIsInNjb3BlIjpbIm9wZW5pZCJdfQ.nd_UokZoyCDjFm2J2zujj_uSzDoBzW6V0Ds3BR2Urooj1CtAX-HkZxj0_lMUp1NuQh_sikU7KlXz6_YVgTwHmJN8vXa7kFP8aaxULNvTes7yzADC10QfvNUhcx_HTQQxbRZshvFHT8CKF7Owsa2xP_jGmVSSp6TmRtzaWvvZjy8DvfHjDsSKgMQhXzVXRvW0VquguaNyqM0FeoNlJGT-bOhKjRk4ZxJX90yYyp6rGvge-gOMiWlVA_W3Azi0gfyBR6xr3TNxNi7jVOKOKkeXm5bVd94hRISiBMIWsLkzD0M-wKlVzmmWhVNL24T6JsM8qeEsK7Maq0UA5tvBEQ0uig");
        System.out.println(
                jwt.getClaims());
    }

}
