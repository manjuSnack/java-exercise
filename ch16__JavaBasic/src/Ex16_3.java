
// #16.11 URLConnection클래스 예제 1
import static java.lang.System.*;
import java.net.*;

public class Ex16_3 {
    public static void main(String args[]) {
        String address = "https://www.naver.com";

        try {
            URL url = new URL(address);
            URLConnection conn = url.openConnection();

            out.println("toString():" + conn);
            out.println("getAllowUserInterction():" + conn.getAllowUserInteraction());
            out.println("getConnectTimeout():" + conn.getConnectTimeout());
            out.println("getContent():" + conn.getContent());
            out.println("getContentEncoding():" + conn.getContentEncoding());
            out.println("getContentLength():" + conn.getContentLength());
            out.println("getContentType():" + conn.getContentType());
            out.println("getDate():" + conn.getDate());
            out.println("getDefaultAllowUserInteraction():" + conn.getDefaultAllowUserInteraction());
            out.println("getDefaultUseCaches():" + conn.getDefaultUseCaches());
            out.println("getDoInput():" + conn.getDoInput());
            out.println("getDoOutput():" + conn.getDoOutput());
            out.println("getExpiration():" + conn.getExpiration());
            out.println("getHeaderFields():" + conn.getHeaderFields());
            out.println("getIfModifiedSince():" + conn.getIfModifiedSince());
            out.println("getLastModified():" + conn.getLastModified());
            out.println("getInputStream():" + conn.getInputStream());
            out.println("getPermission():" + conn.getPermission());
            out.println("getReadTimeout():" + conn.getReadTimeout());
            out.println("getURL():" + conn.getURL());
            out.println("getUseCaches():" + conn.getUseCaches());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

/* 결과
toString():sun.net.www.protocol.https.DelegateHttpsURLConnection:https://www.naver.com
getAllowUserInterction():false
getConnectTimeout():0
getContent():sun.net.www.protocol.http.HttpURLConnection$HttpInputStream@5b1d2887
getContentEncoding():null
getContentLength():-1
getContentType():text/html; charset=UTF-8
getDate():1679974787000
getDefaultAllowUserInteraction():false
getDefaultUseCaches():true
getDoInput():true
getDoOutput():false
getExpiration():0
getHeaderFields():{
	Transfer-Encoding=[chunked], 
	null=[HTTP/1.1 200 OK], 
	Server=[NWS], 
	Connection=[keep-alive], 
	Pragma=[no-cache], 
	P3P=[CP="CAO DSP CURa ADMa TAIa PSAa OUR LAW STP PHY ONL UNI PUR FIN COM NAV INT DEM STA PRE"], 
	Date=[Tue, 28 Mar 2023 03:39:47 GMT], 
	Referrer-Policy=[unsafe-url], 
	X-Frame-Options=[DENY], 
	Strict-Transport-Security=[max-age=63072000; includeSubdomains], 
	Cache-Control=[no-cache, no-store, must-revalidate], 
	Set-Cookie=[PM_CK_loc=bcedb9cdad3d1105b62099378e5251da145e386867de7192b8339286c9a3a2fb; 
	Expires=Wed, 29 Mar 2023 03:39:47 GMT; Path=/; HttpOnly], 
	X-XSS-Protection=[1; mode=block], 
	Content-Type=[text/html; charset=UTF-8]
}
getIfModifiedSince():0
getLastModified():0
getInputStream():sun.net.www.protocol.http.HttpURLConnection$HttpInputStream@5b1d2887
getPermission():("java.net.SocketPermission" "www.naver.com:80" "connect,resolve")
getReadTimeout():0
getURL():https://www.naver.com
getUseCaches():true
 */
