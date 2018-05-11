# OAuth2 Server

首先调用 http://localhost:9999/oauth/authorize?response_type=code&client_id=userapp&state=123456&redirect_uri=http%3A%2F%2Flocalhost%3A9998%2Fuserapp
将跳转至redirect_uri

然后 POST:
http://localhost:9999/oauth/token?grant_type=authorization_code&client_id=userapp&code=T269yJqFveKlD1D5jEtlanERnD5DWxo6&redirect_uri=http://localhost:9998/userapp&client_secret=dXNlci1hcHA=
获取accessToken
